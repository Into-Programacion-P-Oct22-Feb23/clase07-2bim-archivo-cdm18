/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {
    
    public static void main(String[] args) {

        // creación de un ArrayList
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        
        System.out.printf("%s\n", cadenaFinal);
        
    }
    
    public static ArrayList<String> obtenerDatos() {
        Scanner entrada = new Scanner(System.in);
        String pais;
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String opcion = "";
        while (bandera) {
            
            System.out.println("Ingrese el pais");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Si desea terminar de ingresar, pulse x");
            opcion = entrada.nextLine();
            if ("x".equals(opcion) || "X".equals(opcion)) {
                bandera = false;
                
            }
        }
        return arreglo2;
    }
    
    public static String obtenerCadenaFinal(ArrayList<String> a) {
        String mensaje = "";
        for (int i = 0; i < a.size(); i++) {
            mensaje = String.format("%s%s\n", mensaje, a.get(i));
        }
        
        return mensaje;
    }
    
}
