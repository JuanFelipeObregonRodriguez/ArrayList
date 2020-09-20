/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanObregon
 */
public class rFuncionales {

    /**
     *
     * recorre los elementos de la lista y devuelve un decimal
     */
    public static double promedio(ArrayList<Double> numero) {

        double resultado = 0;

        for (double x : numero) {
            resultado += x;

        }
        return resultado / numero.size();

    }

    /**
     *
     * se calcula la diferencia entre la lista y el promedio y retorna un valor
     * decimal
     */
    public static ArrayList<Double> calcular(double media, ArrayList<Double> numero) {

        double num = 0;

        ArrayList<Double> resultado = new ArrayList<Double>();

        for (double x : numero) {
            num = (x - media) + (x - media);
            resultado.add(num);

        }

        return resultado;
    }

    /**
     *
     * esta funcion aplica el mismo metodo que la primera la diferencia es que
     * es para calcular numeros y los retorna decimales
     */
    public static double sumatoria(ArrayList<Double> numeros) {

        double resultado = 0;
        for (double y : numeros) {

            resultado += y;

        }
        return resultado;

    }

    /**
     * el siguiente metodo calcula la desviacion estandar de los numeros que
     * recibe la lista
     */

    public static double desviacionEstandar(ArrayList<Double> numero) {

        double promedio = promedio(numero);

        ArrayList<Double> diferencia = calcular(promedio, numero);

        double sumar = sumatoria(diferencia);
        double resultado = Math.sqrt(sumar / (diferencia.size() - 1));

        return resultado;
    }

    /**
     * el siguiente metodo corresponde al ejercicio 4
     *
     * comparar dos vectores de 30 caracteres y retornar el resultado
     */
}
