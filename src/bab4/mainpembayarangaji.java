/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

/**
 *
 * @author acerN
 */
public class mainpembayarangaji {
    public static void main(String[] args) {
        pembayarangaji gaji = new pembayarangaji();
        gaji.setInput("G12345");
        System.out.println("Rekening yang anda masukkan : " + gaji.getInput());
        System.out.println("Jumlah saldo anda: " + gaji.cekSaldo());
    }
} 
