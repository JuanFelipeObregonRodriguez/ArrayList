/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.modelo.rFuncionales;

import java.util.*;

/**
 *
 * @author JuanObregon
 */
public class ejercicioUnoMain {

    /**
     *
     */
    
    public static void main(String[] args) {
        // Primer ejercicio
        
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < 50; i++) {
            lista.add((int) (Math.random() * 100 + 1));
           lista.get(i);
            System.out.println("el numero mayor es" + Collections.max(lista));

        }
        
    }
    /**
     * otra forma de insertar numeros aleatorios en un arraylist se crea un
     * objeto y se asigna un rango despues se llama el metodo en el ciclo de
     * nuestro ArrayList public static int aleat() {
     *
     * //return (int)Math.random()*1+50; Random r = new Random(); int valorDado
     * = r.nextInt(50) + 1; return valorDado;
     *
     * }
     */
        
    	
            
            
	

}

