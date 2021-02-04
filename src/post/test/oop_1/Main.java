/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post.test.oop_1;

/**
 *
 * @author MOKLET1
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Deklarasi variabel
        String program [] = {"x", "Luas Persegi", "Luas Lingkaran"};
        int pilihan;
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Sambutan
        System.out.println("Selamat Datang!!");
        System.out.println("======================");
        System.out.println("Silahkan Pilih Program");
        
        //Perulangan menampilkan isi data array
        for(int i = 1; i < program.length; i++){
            System.out.println(i + ". " +program[i]);
        }
        
        //Pemilihan program
        System.out.println("------------------------");
        System.out.print("Masukkan pilihan program : ");
        pilihan = input.nextInt();
        System.out.println("------------------------");
        
        //Menjalankan perintah menghitung luas lingkaran ataupun persegi sesuai inputan
        switch (pilihan) {
            case 1 :
                Persegi persegi = new Persegi();
                persegi.hitung();
                break;
            case 2 :
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.hitung();
                break;
        }
        
    }
}
