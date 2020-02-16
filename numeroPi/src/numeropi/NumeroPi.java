/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

/**
 *
 * @author YEISON ASDRUBAL
 */
public class NumeroPi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Calcular valor PI: ");
        System.out.print("Ingrese la cantidad de veces a repetir el ciclo: ");
        
        double n;
        double ab = 1;
        double sig = 1;
        double x;
        double res = 0;
        
        n=Integer.parseInt(br.readLine());
        
        
        for (int i = 0; i <= n; i++) {
            
            x = 1/ab *sig;
            res += x;
            ab += 2;
            sig *= -1;
            
            
        }
        
        res = res*4;
        
        System.out.println("Valor del numero pi " + res);
        
    }
    
}
