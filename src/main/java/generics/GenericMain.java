/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author dvali
 */
public class GenericMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* Caixa caixa1 = new Caixa("Una cadena"); //String
        Caixa caixa2 = new Caixa(77); //integer
        //Conversio de tipus Cast
        String content = (String) caixa2.getContent();
        System.out.println(content);*/
       
       CaixaGenerica<String> caixa1 = new CaixaGenerica<>("Contenido generico");
       CaixaGenerica<Integer> caixa2 = new CaixaGenerica<>(6);
       
       Integer content = caixa2.getContent();
        
    }
    
}
