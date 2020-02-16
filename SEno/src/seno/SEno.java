/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yeison Vela ID: 597335
 */
public class SEno {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        System.out.print("Ingrese el numero: ");
        x = Integer.parseInt(br.readLine());

        double n = 10;
        double seno = 0;
        double ar;
        
               
        //-1^n
        for (int i = 0; i <= n; i++) {

            //potencias x^(2n+1)
            double mul = 1;
            for (int j = 0; j < 2*n+1; j++) {

                mul = mul * x;

            }
            //factorial (2n+1)!
            double ab = 1;
            for (int j = 1; j <= 2*n+1; j++) {

                ab = ab * j;
            }

            if (i % 2 == 0) {
                ar = 1;
            } else {
                ar = -1;
            }
            seno = seno + (ar / ab) * mul;

        }

        System.out.println("seno: " + seno);
        
        
    }

}
