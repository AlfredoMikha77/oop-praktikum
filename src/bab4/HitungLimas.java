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
public class HitungLimas {
   private int luasAlas;
    int tinggi;
    double volume;

    public void setLuasAlas(int luasAlas) {
        this.luasAlas = luasAlas;
    }
    public int getLuasAlas() {
        return luasAlas;
    }
    int Tinggi(){
        return tinggi;
    }
    double volumeLimas(int LuasAlas){
        volume = 0.33 * LuasAlas * tinggi;
        return volume;
    }
   
}
