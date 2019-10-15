/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan38.perhitunganlingkaran;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program perhitungan lingkaran
 */
public class Lingkaran {
    private final float PHI = (float) 3.1416;
    private float diameter;
    private float jariJari;
    
    private void getJariJari(float varDiameter){
        jariJari = (float) (varDiameter / 2);
    }
    private float getLuas(float varJariJari){
        return (float) PHI* varJariJari * varJariJari;
    }
    private float geKeliling(float varDiameter){
        return (float) ((float)PHI*varDiameter);
    }
    private String getString(float varFloat){
        return Float.toString(varFloat);
    }
    
    public void hasilHitung(float varDiameter){
        diameter = varDiameter;
        getJariJari(diameter);
        System.out.println("");
        System.out.println("========Hasil Perhitungan Lingkaran========");
        System.out.println("Jari-jari Lingkaran\t:"+jariJari+" cm");
        System.out.println("Luas Lingkaran\t:"+getString((float)getLuas(jariJari))+" cm");
        System.out.println("Keliling Lingkaran\t:"+getString((float) getKeliling(diameter))+ " cm");
        
    }
    
    
}
