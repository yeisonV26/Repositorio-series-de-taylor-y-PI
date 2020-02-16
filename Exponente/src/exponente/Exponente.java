/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yeison Vela ID: 597335
 */
public class Exponente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("funcion exponencial: ");
        double num;
        int n = 100;
        System.out.print("Ingrese el numero: ");
        num = Integer.parseInt(br.readLine());
        double exp = 1;
        double f = 1;
        double p = 1;

        for (int i = 1; i <= n; i++) {
            
            p = p * num;
            f = f * i;
            exp = exp + (p / f);
        }

        System.out.println("Numero ingresado: " + num);
        System.out.println("Numero exponencial:  " + exp);
    }

}
