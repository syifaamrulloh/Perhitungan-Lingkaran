/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan22.perhitungan.lingkaran;

/**
 *
 * @author
 * Nama :Muhamad Syifa Amruloh
 * Kelas:IF11K
 * NIM  :10118910
 * 
 * Description : Program Perhitungan Lingkaran
 */
import java.util.*;
public class PBO11K10118910Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static float PHI = (float) 3.1415919999999997;
    public static void hitunglinkaran(int d){
    float l,k;
    int r,rpangkat;
    r = d/2;
    l = (float) (Math.pow(r, 2)* PHI);
    k = PHI * d;
    
    //Output
        System.out.print("\n========== Hasil Perhitungan Lingkaran ==========\n");
        System.out.printf("Jari-Jari Lingkaran = " + r + " cm\n");
        System.out.printf("Luas Lingkaran = "+"%.2f",l);
        System.out.print(" cm\n");
        System.out.printf("Keliling Lingkaran = "+"%.2f",k);
        System.out.print(" cm\n");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("========== Perhitungan Lingkaran ==========");
        do {            
            System.out.print("Masukan nilai diameter lingkaran\t: ");
            try {
                n= input.nextInt();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai\n");
                input.next();
            }
        } while ( n <= 0);
        hitunglinkaran(n);
        System.out.println("(Developed by : Muhamad Syifa Amruloh)");
    }
    
}
