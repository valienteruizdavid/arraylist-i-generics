/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03uf5exceptions;

/**
 *
 * @author dvali
 */
public class NumeroErroneoException extends Exception {

    public NumeroErroneoException() {
    }

    public NumeroErroneoException(String msg) {
        super(msg);
    }
}
