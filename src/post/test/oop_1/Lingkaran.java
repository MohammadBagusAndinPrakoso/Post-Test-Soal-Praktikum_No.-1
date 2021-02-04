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
public class Lingkaran {
    double r;
    double luas;
    
    void hitung(){
        //Sambutan
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("-------------------------");
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Menginputkan jari-jari lingkaran
        System.out.print("Masukkan Panjang Jari-jari : ");
        r = input.nextDouble();
        
        /*Menghitung luas lingkaran, jika hasil bagi jari-jari adalah 1, maka 
        menggunakan phi 22/7, jika tidak maka menggunakan phi 3.14*/
        if (r % 7 == 1){
            System.out.println("Luas Persegi : "+ (luas = r*r*22/7));
        } else {
            System.out.println("Luas Persegi : "+ (luas = r*r*3.14));
        }
        
    }
}
