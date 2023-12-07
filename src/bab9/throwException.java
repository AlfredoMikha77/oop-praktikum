/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;

import java.util.Scanner;

/**
 *
 * @author acerN
 */
public class throwException {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlKaki;
        System.out.println("Berapa Jumlah kaki kerbau ?");
        try {
            System.out.print("Jumlah Kaki : ");
            jmlKaki = input.nextInt(); // Mendapatkan Input Dari User
            if (jmlKaki != 4) {
                // Jika jumlah kaki kerbau lebih atau kurang dari 4, maka akan terjadi error
                throw new NullPointerException("Terjadi Kesalahan: Jumlah kaki kerbau harus 4");
            } else {
                System.out.println("Benar Jumlah kaki kerbau 4");
            }
        } catch (NullPointerException e) {
            // Menampilkan Pesan Kesalahan
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Closing the Scanner to prevent resource leak
            if (input != null) {
                input.close();
            }
        }
    }  
}
