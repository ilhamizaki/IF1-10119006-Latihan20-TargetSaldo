/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan20.targetsaldo;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Menentukan Target Saldo
 */
public class IF110119006Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int saldoAwal, saldoTarget, bunga;
       double bungaPersen;
       boolean target = true;
       
       saldoAwal = 3500000;
       bungaPersen = 0.08;
       saldoTarget = 0;
       int i = 1;
        do {
            bunga = (int) (saldoAwal * bungaPersen);
            saldoTarget = saldoAwal + bunga;
            saldoAwal = saldoTarget;
            System.out.println("Saldo di bulan ke-" + i++ + " Rp." + saldoTarget);
                
            if (saldoTarget >= 6000000) {
                target = false;
            }
        } while (target);
           
    }
    
}
