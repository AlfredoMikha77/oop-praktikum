/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1.ClassObject;

/**
 *
 * @author acerN
 */
public class Main {
    public static void main(String[] args){
        
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "merah";
        mobil.merk = "toyota";
        System.out.println("Nama kendaraan : " + mobil.nama);
        System.out.println("Nama kendaraan : " + mobil.warna);
        System.out.println("Nama kendaraan : " + mobil.merk);
        System.out.println("jumlah roda    : " + mobil.jmlRoda(4) + "\n");
        System.out.println("Cara kendaraan bergerak: " );
        System.out.println("saat maju: " );
        mobil.kendaraanMaju();
        System.out.println("Saat berhenti : " + mobil.nama);
        mobil.kendaraanBerhenti();
    }
    
}
