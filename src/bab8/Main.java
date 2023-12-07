/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8;

/**
 *
 * @author acerN
 */
public class Main {
    public static void main(String[] args) {
        Payment pay1 = new Payment(750000); // Atur jumlah uang total pembelian di sini
        pay1.titlePurchase(1);
        System.out.println("Credit Balance: " + pay1.creditBalance);
        System.out.println("Emoney Balance: " + pay1.emoneyBalance);
        System.out.println("Cash Balance: " + pay1.cashBalance);
        System.out.println("===");

        System.out.println("Total Payment: " + pay1.total);
        System.out.println("=====");

        // Menampilkan sisa saldo dengan berbagai macam metode pembayaran
        System.out.println("Payment With Credit, Ending Balance: " + pay1.creditProses());
        System.out.println("Payment With E-Money, Ending Balance: " + pay1.emoneyProses());
        System.out.println("Payment With Cash, Ending Balance: " + pay1.cashProses());
    }
}

