/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenyewaanMobilAlfred;

/**
 *
 * @author acerN
 */
public class DriverPenyewaanMobil {
  public static void main(String[]args){
 PenyewaanMobil sewa = new PenyewaanMobil(); 
 System.out.println("Isi Data Penyewa");
sewa.Nama("Alfred");
sewa.Umur=("18"); 
sewa.Alamat("Malang"); 
sewa.JenisMobil("Brio");
sewa.WarnaMobil("Merah"); 
sewa.DurasiPenyewaan(8);
sewa.HargaMobil(300000);
sewa.tanggal("14-11-2004");
System.out.println("Nama = "+sewa.Nama); System.out.println("Umur = "+sewa.Umur);
System.out.println("Alamat = "+sewa.getAlamat()); System.out.println("Jenis Mobil = "+sewa.JenisMobil);
System.out.println("Warna Mobil = "+sewa.WarnaMobil);
System.out.println("Durasi Penyewaan ="+sewa.DurasiPenyewaan);
System.out.println("\n");
System.out.println("Data Penyewa");
 System.out.println("Nama = "+sewa.Nama());
 System.out.println("Umur = "+sewa.Umur);
 System.out.println("Alamat = "+sewa.Alamat());
 System.out.println("Jenis Mobil ="+sewa.JenisMobil());
 System.out.println("Warna Mobil ="+sewa.WarnaMobil());
 System.out.println("Durasi Penyewaan ="+sewa.DurasiPenyewaan());
 System.out.println("Harga (per jam) ="+sewa.HargaMobil());
 System.out.println("Tanggal Sewa ="+sewa.tanggal());
 System.out.println("Informasi Mobil =" );sewa.Penyewaan();
 }
  
}
