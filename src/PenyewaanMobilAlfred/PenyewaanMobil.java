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
public class PenyewaanMobil extends ABSTRACTMOBIL{
String Nama,Umur,JenisMobil,WarnaMobil,tanggal,ID;
private String Alamat;
int HargaMobil,jumlah,DurasiPenyewaan;
int dendahr,dendakrs,totaldn;
double pajakkendaraanbermotor;
int denda(  int hr){
    totaldn =  hr * 300000;
    return totaldn;
}
int denda(){
    return 0;
}
void Nama(String Nama){ this.Nama = Nama;
}
void Umur (String Umur){ this.Umur = Umur;
}
void Alamat(String Alamat){ this.Alamat = Alamat;
}
void JenisMobil(String JenisMobil){ this.JenisMobil = JenisMobil;
}
void WarnaMobil(String WarnaMobil){
this.WarnaMobil = WarnaMobil;
}
void DurasiPenyewaan(int DurasiPenyewaan){ 
this.DurasiPenyewaan = DurasiPenyewaan;
}
void HargaMobil(int HargaMobil){ 
this.HargaMobil = HargaMobil;
}
void tanggal(String Tanggal){ 
this.tanggal = Tanggal;
}
void dendahr(int Dendahr){
    this.dendahr = Dendahr;
}
void PKB(double pajakkendaraanbermotor){
        this.pajakkendaraanbermotor = pajakkendaraanbermotor;
    }
double pajakkendaraanbermotor(){ // Penerapan Polymorfisme
        return pajakkendaraanbermotor;
    }

String Nama(){ return Nama;
}
String Umur(){ return Umur;
}
String Alamat(){ return Alamat;
}
String JenisMobil(){ return JenisMobil;
}
String WarnaMobil(){ return WarnaMobil;
}
int DurasiPenyewaan(){ return DurasiPenyewaan;
}
int HargaMobil(){return HargaMobil;    
}
String tanggal(){return tanggal;    
}
String ID(){
        return ID;
    }


    public PenyewaanMobil() {
        this.HargaMobil = 300000;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getAlamat() {
        return Alamat;
    }

    public int PenyewaanMobil() {
        jumlah = (HargaMobil * DurasiPenyewaan);
        return jumlah;
    }
    @Override
    void ID(String ID) {
        this.ID = ID;
    }


void Penyewaan(){
System.out.println("Mobil Sedang Disewa");
}
void TidakDisewa(){
System.out.println("Mobil Tidak Disewa");
}

}
