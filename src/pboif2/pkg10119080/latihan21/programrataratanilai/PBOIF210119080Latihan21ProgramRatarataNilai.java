/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Program Rata-Rata Nilai
 */
public class PBOIF210119080Latihan21ProgramRatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int i, banyakmahasiswa;
        float totalnilaimahasiswa, nilaimahasiswa, rataratanilai;
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        banyakmahasiswa = scanner.nextInt();
        totalnilaimahasiswa = 0;
        i=1;
        while (i <= banyakmahasiswa){
                System.out.print ("Nilai Mahasiswa ke-"+i+" : ");
                nilaimahasiswa = scanner.nextFloat ();
                totalnilaimahasiswa += nilaimahasiswa;
                i++;
        }
        rataratanilai = totalnilaimahasiswa / banyakmahasiswa;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+rataratanilai);
        System.out.println("Developed by : Kevin Pratama Sinaga");
   }
    
}