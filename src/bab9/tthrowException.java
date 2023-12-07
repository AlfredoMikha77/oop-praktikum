/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;

/**
 *
 * @author acerN
 */
public class tthrowException {
 static void throwError() throws ClassNotFoundException {
        System.out.println("Ada Yang Error Ni!");
        throw new ClassNotFoundException("Error sudah Saya Tangkap");
    }

    public static void main(String[] args) {
        try {
            throwError();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }   
}
