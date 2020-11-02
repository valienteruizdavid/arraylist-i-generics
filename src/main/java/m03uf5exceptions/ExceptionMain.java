/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03uf5exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ExceptionMain {
    
    static double division(double a, double b) throws Exception{
        if(b == 0){
            throw new Exception("El denominador no puede ser 0",new IllegalArgumentException());
        }
        return a/b;
    }
    
    public static void main(String[] args) {
        double d = 0;
        try {
            d = division(5,0);
        } catch (Exception ex) {
            Logger.getLogger(ExceptionMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(d);
    }
    
}
