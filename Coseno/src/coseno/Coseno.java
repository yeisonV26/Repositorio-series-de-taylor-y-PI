/* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package coseno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Yeison  Vela ID: 597335
 */
public class Coseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
       
        int x=0;
        System.out.print("Ingrese en numero: ");
        x=Integer.parseInt(br.readLine());
       
        double n = 10;
        double coseno = 0;
        double ar;
        
        for (int i = 0; i <= n; i++) {

            //potencias x^(2n)
            double mul = 1;
            for (int j = 0; j < 2*n; j++) {

                mul = mul * x;

            }
            
            //factorial (2n)!
            double ab = 1;
            for (int j = 1; j <= 2*n; j++) {

                ab = ab * j;
            }
            
            //-1^n
            if (i % 2 == 0) {
                ar = 1;
            } else {
                ar = -1;
            }
            coseno = coseno + (ar/ab) * mul;

        }
        
        System.out.println("coseno: " + coseno);
        
    }
   
}
