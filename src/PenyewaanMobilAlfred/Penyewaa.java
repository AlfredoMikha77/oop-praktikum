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
public class Penyewaa extends PenyewaanMobil {
String tglPinjam,tenggat,tglDikembalikan;
private String kodesewa;
void tglPinjam (String tglPinjam){
this.tglPinjam = tglPinjam;
}
void tenggat (String tenggat){ this.tenggat = tenggat;
}
void kodesewa (String kodesewa){ this.kodesewa = kodesewa;
}
void tglDikembalikan (String tglDikembalikan){ this.tglDikembalikan = tglDikembalikan;
}
String tglPinjam(){ return tglPinjam;
}
String tenggat(){ return tenggat;
}
String kodesewa(){ return kodesewa;
}
String tglDikembalikan(){ return tglDikembalikan;
} 


    public String getKodesewa() {
        return kodesewa;
    }

    public void setKodesewa(String kodesewa) {
        this.kodesewa = kodesewa;
    }

    @Override   
    int denda() {
        totaldn = dendahr * 300000;
        return totaldn;
    }
    @Override
    void ID(String ID) {
        this.ID = ID;
    }

    


}
