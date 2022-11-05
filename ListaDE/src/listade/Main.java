/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listade;

import java.util.Scanner;

/**
 *
 * @author MilesMorales
 */
public class Main {
    
    public static void main(String[] args) {

        

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa cadena: ");
        String cadena = entrada.nextLine();
        int longitudCadena = cadena.length();
        ListaDE listaDE = new ListaDE();
        
        for(int i= 0 ; i<longitudCadena; i++){
            listaDE.InsertAtPos(cadena.charAt(i), i);
        }
        System.out.println("La cadena de caracteres es: " + listaDE.retornarCad());
        System.out.println("La cadena invertida es: " + listaDE.retornarCadRev());
        
        
        
    }
    
}
