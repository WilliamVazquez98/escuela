/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listade;

/**
 *
 * @author MilesMorales
 */
public class ListaDE {
    private Nodo head;
    private Nodo tall;
    private int size;
    private String cadena = "";

    //Create a new empty list using a constructor 
    public ListaDE() {
        this.head = new Nodo(' ', null,  null);
        this.tall = new Nodo(' ', head,  null);
        this.size = size;
    }

    //add a new value to the front of the list 
    public void InsertAtFront(char newValue) {
        Nodo newNodo = new Nodo(newValue, null, head.getNext());
        newNodo.getNext().setPrev(newNodo);
        head = newNodo;
        size++;
    }

    //add a new value to the list at a given position
    public void InsertAtPos(char value, int position) {
        //fix the position if the position is lessthan 0
        if (position < 0) {
            position = 0;
        }
        if (position > size) {
            position = size;
        }

        //if the list is empty
        if (head == null) {
            head = new Nodo(value);
            tall = head;
            cadena = cadena + value;
        } else if (position == 0) {
            Nodo newNodo = new Nodo(value);
            newNodo.setNext(head);
            head.setPrev(newNodo);
            head = newNodo;
            size++;
            cadena = cadena + value;
        } else {//find the correct position 
            Nodo temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }

            //insert value
            Nodo newNodo = new Nodo(value);
            newNodo.setNext(temp.getNext());
            newNodo.setPrev(temp);
            newNodo.getNext().setPrev(newNodo);
            temp.setNext(newNodo);
            //size++;
            cadena = cadena + value;
        }
        size++;
        
    }

    //Add a new value to the rerar of the list
    public void InsertarAtTall(char value) {
        Nodo newNodo = new Nodo(value, tall.getPrev(), tall);
        newNodo.getPrev().setNext(newNodo);
        tall.setPrev(newNodo);
        size++;
    }
    
   public String retornarCad(){
       return cadena;
   }
    
    public String retornarCadRev(){
        String invertida = "";
	// Recorremos la original del final al inicio
	for (int indice = cadena.length() - 1; indice >= 0; indice--) {
		// Y vamos concatenando cada carácter a la nueva cadena
		invertida += cadena.charAt(indice);
	}
        return invertida;
    }
    
}

