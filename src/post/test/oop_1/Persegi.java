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
public class Persegi {
    double sisi;
    double luas;
    
    void hitung(){
        //Sambutan
        System.out.println("Menghitung Luas Persegi");
        System.out.println("-----------------------");
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Mengisi sisi
        System.out.print("Masukkan Panjang Sisi : ");
        sisi = input.nextDouble();
        
        //Menghitung luas
        System.out.println("Luas Persegi : "+ (luas = sisi*sisi));
        
    }
}
