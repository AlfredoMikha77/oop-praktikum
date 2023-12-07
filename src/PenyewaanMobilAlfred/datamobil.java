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
public class datamobil extends PenyewaanMobil implements Mobil_Interface {
   String tahun;
   private String plat,stnk;
void plat(String plat){ this.plat = plat;
}
void stnk(String stnk){ this.stnk = stnk;
}
void tahun(String tahun){ this.tahun = tahun;
}
String stnk(){ return stnk;
}
String plat(){ return plat;
}
String tahun(){ return tahun;
}

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public void setStnk(String stnk) {
        this.stnk = stnk;
    }

    public String getPlat() {
        return plat;
    }

    public String getStnk() {
        return stnk;
    }
    @Override
    void ID(String IDmobil) {
        this.ID = IDmobil;
    }
@Override
    double pajakkendaraanbermotor() { // Penerapan Polymorfisme
        return ((HargaMobil()*(pajakkendaraanbermotor))+HargaMobil);
    }
    @Override
    public String sewa() {
        return "MOBIL DISEWA"; 
        
    }

    @Override
    public String tidaksewa() {
       return "TIDAK SEWA" ; 
    }
  
}
