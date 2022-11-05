/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listade;

/**
 *
 * @author MilesMorales
 */
public class Nodo {
    private  char data; //Seccion de datos
    private Nodo prev; //Referencioa a memoria para el nodo anterior
    private Nodo next;
    
    //Constructor
    public Nodo (){
    this.data = ' ';
    prev = null;
    next = null;
    }
    
    /**
     * Inicializa los atributos de la clase nodo
     * @param data Es de tipo primitivo entero
     */
    
    public Nodo (char data){
    this.data = data;
    prev = null;
    next = null;
    }
    
    /**
     * Constructor para inicializar un nodo completo con los datos y nodos prev y next
     * @param data
     * @param prev Referencia a memoria para el nodo anterior
     * @param next Referenica a memoria para el nodo siguiente
     */
    
    public Nodo (char data, Nodo prev, Nodo next){
    this.data = data;
    this.prev=prev;
    this.next=next;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    public static Nodo clone(char data){
    return new Nodo (data);
    }
}