/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2konstruktor;

/**
 *
 * @author acerN
 */
public class Luas_Segitiga {
  int alas, tinggi;
double luas;

public Luas_Segitiga(){
    this.alas = 10;
}
public double luas(){
    luas = (alas*tinggi)/2;
    return luas;
}

}
