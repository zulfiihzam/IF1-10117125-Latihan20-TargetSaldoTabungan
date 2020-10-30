/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan20.targetsaldotabungan;

/**
 *
 * @author 
 *  * NAMA     : Zulfi Ihzam Rahmat
 * KELAS    : IF-1
 * NIM      : 10117125
 * Deskripsi Program : Program ini berisi Program yang menampilkan target
 * saldo tabungan.
 */
public class IF110117125Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int saldoAwal = 3500000;
        double bunga = 0.08;
        int saldoBulanan;
        
        do{
            saldoBulanan = (int) (bunga * saldoAwal);
            saldoAwal = (saldoAwal + saldoBulanan);
            System.out.println("Saldo di bulan ke- "+ i + " Rp " + saldoAwal);
            i++;
        } while (i<=8);
    }
    
}
