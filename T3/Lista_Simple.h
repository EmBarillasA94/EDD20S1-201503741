#ifndef LISTA_SIMPLE_H
#define LISTA_SIMPLE_H

#include <iostream>
using namespace std;


class Lista_Simple {
	//Nodo
	class Nodo {
	public:
		//constructor
		Nodo(int id_, string nombre_) {
			id = id_;
			nombre = nombre_;
			siguiente = 0;
		}
		//get 
		int getId() {
			return id;
		}
		string getNombre() {
			return nombre;
		}
		Nodo *getSiguiente() {
			return siguiente;
		}
		//set
		void setSiguiente(Nodo *n) {
			siguiente = n;
		}
	private:
		int id;
		string nombre;
		Nodo *siguiente;
	};

public:
	//contructor Lista
	Lista_Simple() {
		this->primero = 0;
		this->ultimo = 0;
	}
	//metodos
	bool esta_vacia();
	void Insertar(int id, string nombre);
	void Eliminar(Nodo *n);
	//la implementacion del metodo buscar la tuve que hacer aqui para que no me diera error
	Nodo* Buscar(int id) {
		Nodo *aux = this->primero;
		while (!aux->getSiguiente() == 0) {
			if (aux->getId() == id) {
				return aux;
			}
			else {
				aux = aux->getSiguiente();
			}
		}
		return 0;
	}
	
private:
	Nodo *primero;
	Nodo *ultimo;
};

//implementando los metodos
bool Lista_Simple::esta_vacia() {
	return this->primero == 0;
}

void Lista_Simple::Insertar(int id, string nombre){
	Nodo *n = new Nodo(id, nombre);
	if (esta_vacia()) {
		this->primero = n;
		this->ultimo = n;
	}
	else{
		this->ultimo->setSiguiente(n);
		this->ultimo = n;
	}
}

void Lista_Simple::Eliminar(Nodo * n){
	Nodo *aux = this->primero;
	while (!aux->getSiguiente() == 0) {
		if (aux == n) {
			aux->setSiguiente(0);
		}
		else{
			aux = aux->getSiguiente();
		}
	}
}










#endif // !LISTA_SIMPLE_H

