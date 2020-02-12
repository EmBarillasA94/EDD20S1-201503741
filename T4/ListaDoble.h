#ifndef LISTADOBLE_H
#define LISTADOBLE_H

#include <iostream>
using namespace std;


class ListaDoble {
	//Nodo
	class Nodo {
	public:
		//constructor
		Nodo(string nombre_) {
			nombre = nombre_;
			siguiente = 0;
			anterior = 0;
		}
		//get 
		string getNombre() {
			return nombre;
		}
		Nodo *getSiguiente() {
			return siguiente;
		}
		Nodo *getAnterior() {
			return anterior;
		}
		//set
		void setSiguiente(Nodo *n) {
			siguiente = n;
		}
		void setAnterior(Nodo *n) {
			anterior = n;
		}
	private:
		string nombre;
		Nodo *siguiente;
		Nodo *anterior;
	};

public:
	//contructor Lista
	ListaDoble() {
		this->primero = 0;
		this->ultimo = 0;
	}
	//metodos
	bool esta_vacia();
	void InsertarPrimero(string nombre);
	void EliminarUltimo();
	//la implementacion la tuve que hacer aqui para que no me diera error
	Nodo* Buscar(string s) {
		Nodo *aux = this->primero;
		while (!aux->getSiguiente() == 0) {
			if (aux->getNombre == s) {
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
bool ListaDoble::esta_vacia() {
	return this->primero == 0;
}

void ListaDoble::InsertarPrimero(string nombre)
{
	Nodo *n = new Nodo(nombre);
	if (esta_vacia) {
		primero = n;
		ultimo = n;
	}
	else {
		primero->setAnterior(n);
		n->setSiguiente(primero);
		primero = n;
	}
}

void ListaDoble::EliminarUltimo()
{
	if (esta_vacia) {
		cout << "Lista Vacia \n";
	}
	else {
		ultimo = ultimo->getAnterior();
		ultimo->setSiguiente(0);
	}
}











#endif // !LISTA_SIMPLE_H


