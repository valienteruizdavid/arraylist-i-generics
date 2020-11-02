
package cat.copernic.m03uf5review;

import m03uf5exceptions.NumeroErroneoException;
import m03uf5exceptions.NumeroNegativoException;
import m03uf5exceptions.NumeroIgualCeroException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class M03uf5Exercici {
    
 
    static int Lados(int a, int b, int c) throws Exception {
        if(a == 0 || a < 0 || b == 0 || b < 0 || c == 0 || c < 0){
             throw new Exception("No puede haber ningún numero igual a 0 o negativo",new IllegalArgumentException());
        }
     return a+b+c;
    }
    
    public static void main(String[] args) throws NumeroErroneoException, Exception {
     
        int n = 0;
        try{
            n = Lados(3,4,5);
        } catch (NumeroNegativoException ex1){
            Logger.getLogger(NumeroNegativoException.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (NumeroIgualCeroException ex2){
            Logger.getLogger(NumeroIgualCeroException.class.getName()).log(Level.SEVERE, null, ex2);
        } catch (NumeroErroneoException ex3){
            Logger.getLogger(NumeroErroneoException.class.getName()).log(Level.SEVERE, null, ex3);
        }
    System.out.println(n);
}
    
}
