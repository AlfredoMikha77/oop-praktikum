/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

/**
 *
 * @author acerN
 */
public abstract class Pembayaran {
    abstract double hitPembayaran(double bayar);
    abstract double cekkode(String input);
    abstract void tampilkanMember();
    
    String member(G0001 member) {
        return "Gold";
    }
    
    String member(P0001 member) {
        return "Platinum";
    }
    
    String member(S0001 member) {
        return "Silver";
    }
}
