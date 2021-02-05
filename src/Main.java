
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input user
        Scanner input = new Scanner(System.in);
        //inisialisasi dari user
        System.out.print("Masukkan Jenis Kendaraan\t : ");
        Kendaraan.jenis = input.nextLine();
        System.out.print("Masukkan CC Kendaraan\t : ");
        Kendaraan.cc = input.nextInt();
        System.out.print("Masukkan Brand Kendaraan\t : ");
        Kendaraan.brand = input.nextLine();
        
        //hasil output dari pemanggilan class method static
        System.out.println("Jenis Kendaraan\t : "+Kendaraan.jenis);
        System.out.println("CC Kendaraan\t : "+Kendaraan.cc);
        System.out.println("Brand Kendaraan\t : "+Kendaraan.brand);
    }
    
}
