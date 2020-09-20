/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.modelo.rFuncionales;
import java.util.ArrayList;

/**
 *
 * @author JuanObregon
 */
public class ejercicioDosMain {
      public static void main(String[] args){
      
      	rFuncionales r = new rFuncionales();
                
		ArrayList<Double> datos = new ArrayList<>();
		double[] vector = { 186, 699, 132, 272, 291, 331, 199, 1890, 788, 1601, 129, 298,389, 310, 220};
		for( double x: vector){
			datos.add(x);
		}
		double resultado = r.desviacionEstandar( datos);
                
                System.out.println("la desviacion estandar es:"+resultado);
                
	}
      
      }
    

