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
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Lat_Exception {
   public static void main(String[] args) {
        try {
            int a, b, hasil;
            // membuat scanner baru
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Program Pembagian=====");
            System.out.print("Masukkan angka 1= ");
            a = Integer.parseInt(keyboard.next());
            System.out.print("Masukkan angka 2= ");
            b = Integer.parseInt(keyboard.next());

            hasil = a / b;
            System.out.println(Integer.toString(hasil));

        } catch (ArithmeticException c) {
            JOptionPane.showMessageDialog(null, "Nilai pembagi tidak boleh 0!", "Warning", JOptionPane.WARNING_MESSAGE);

        } catch (NumberFormatException d) {
            JOptionPane.showMessageDialog(null, "Input yang anda masukkan bukan angka!", "Warning", JOptionPane.WARNING_MESSAGE);
            System.out.println("Terima kasih sudah menjalankan program");

        } finally {
           System.out.println("Terima kasih sudah menjalankan program"); 
        }
    }  
}
