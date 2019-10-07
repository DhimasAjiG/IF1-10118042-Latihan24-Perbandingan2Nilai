/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan24.perbandingan2nilai;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Membandingkan 2 buah nilai
*/
public class IF110118042Latihan24Perbandingan2Nilai {
    
    public static void main(String[] args) {
       
        String status;
        int nilai1;
        int nilai2;
        
        
        //proses
        do{
            System.out.println("=====PROGRAM PERBANDINGAN NILAI=====");
            System.out.print("Masukkan Nilai Pertama\t: ");
            Scanner tempNilai1 = new Scanner(System.in);
            nilai1 = tempNilai1.nextInt();
            
            System.out.print("Masukkan Nilai Kedua\t: ");
            Scanner tempNilai2 = new Scanner(System.in);
            nilai2 = tempNilai2.nextInt();
           if(nilai1==nilai2){
            System.out.println("Hasil : "+nilai1+" Sama Dengan "+nilai2);
           }
           else if (nilai1<nilai2){
            System.out.println("Hasil : "+nilai1+" Lebih Kecil dari "+nilai2);
           }
           else{
            System.out.println("Hasil : "+nilai1+" Lebih Besar dari "+nilai2);
           } 
            System.out.print("Ulangi Aktivitas? [Ya/Tidak] : ");    
            Scanner tempStatus = new Scanner(System.in);
            status = tempStatus.nextLine();
            System.out.println();
        }while(status.equals("Ya") || status.equals("ya"));
    }
    
}
