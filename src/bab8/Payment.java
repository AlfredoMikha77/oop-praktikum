    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8;

/**
 *
 * @author acerN
 */
public class Payment extends Purchase implements Cash, Credit, Emoney {
     double total, creditBalance, emoneyBalance, cashBalance;

    public Payment(double setTotal) {
        this.creditBalance = 1000000;
        this.emoneyBalance = 500000;
        this.cashBalance = 1500000;
        this.total = setTotal;
    }

    // Dari induk abstract Purchase
    @Override
    void titlePurchase(int numberPurchase) {
        System.out.println("Pembelian ke- " + numberPurchase);
    }

    // Dari interface Cash
    @Override
    public double cashProses() {
        total = cashBalance;
        return total;
    }

    // Dari interface Credit
    @Override
    public double creditProses() {
        total = creditBalance;
        return total;
    }

    // Dari interface EMoney
    @Override
    public double emoneyProses() {
        total = emoneyBalance;
        return total;
    }
}
