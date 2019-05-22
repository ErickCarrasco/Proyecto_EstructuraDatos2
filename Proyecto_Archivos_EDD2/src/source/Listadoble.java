/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author josep
 */
public class Listadoble {

    Nodo primero;
    Nodo ultimo;

    Listadoble() {
        primero = null;
        ultimo = null;
    }

    public boolean estavacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public Listadoble Insertar(int dat) {
        if (estavacio()) {
            Nodo nuevo = new Nodo(dat);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            Nodo nuevo = new Nodo(dat);
            ultimo.next = nuevo;
            nuevo.ant = ultimo;
            ultimo = nuevo;
        }
        return this;
    }

    /*public Listadoble borrar(int a) {
        Nodo w = primero;
        Nodo y;
        for (int i = 0; i < a; i++) {
            y = w.ant;
            w = w.next;
        }
        y = w.ant;
        return this;
    }*///No sirve, lo dejo por cuestiones de pruebas///

    public boolean delete(int num) {
        Nodo anterior = null;
        Nodo actual = primero;
        while (actual != ultimo) {
            if (actual.dato == num) {
                if (anterior == null) {
                    primero = actual.next;
                    primero.ant = null;
                } else {
                    anterior.next = actual.next;
                    Nodo temporal;
                    temporal = actual.next;
                    temporal.ant = anterior;
                }
                return true;
            }
            anterior = actual;
            actual = actual.next;
        }
        if (num == ultimo.dato) {
            ultimo = actual.ant;
            return true;
        }
        return false;
    }

    public void imprimir2() {
        Nodo actual;
        actual = ultimo;
        while (actual != primero) {
            System.out.println(actual.dato);
            actual = actual.ant;
        }
        System.out.println(actual.dato);

    }

    public void imprimir() {
        Nodo actual;
        actual = primero;
        while (actual != ultimo) {
            System.out.println(actual.dato);
            actual = actual.next;
        }
        System.out.println(actual.dato);

    }
}
