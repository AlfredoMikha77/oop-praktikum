/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab3inheritance.bab1.bab2.bab3;

/**
 *
 * @author acerN
 */
public class KeaktifanMahasiswa extends Penilaian {
  int nilai_keaktifan;
    public KeaktifanMahasiswa(){
        this.nilai_keaktifan = 0;
    }
    public double nilaikeaktifan(){
        return ((nilai_keaktifan*0.1)+nilaiakhir());
}
}
