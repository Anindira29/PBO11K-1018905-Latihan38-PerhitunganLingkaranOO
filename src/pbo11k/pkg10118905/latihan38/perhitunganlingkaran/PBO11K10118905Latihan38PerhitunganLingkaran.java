/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan38.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program perhitungan lingkaran
 */
public class PBO11K10118905Latihan38PerhitunganLingkaran {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Lingkaran 1 = new Lingkaran();
        float n =0;
        
        System.out.println("========Perhitungan Lingkaran========");
    
        do {
            System.out.print("Masukkan nilai diameter lingkaran\t:");
        try{
            n =input.nextFloat();
        }catch (Exception e){
            System.out.println("Nilai diameter tidak sesuai");
            input.next();
        }
        }while(n<=0);
        l.hasilHitung(n);
        
    }
    
}
