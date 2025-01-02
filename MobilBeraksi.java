/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author WINDOWS 11
 */
public class MobilBeraksi {
    public static void main(String[] args){
        Mobil mobilJangku = new Mobil();
        
        mobilJangku.warna = "Mereh";
        mobilJangku.tahunProduksi = 2005;
        
        System.out.println("warna: " + mobilJangku.warna);
        System.out.println("tahunProduksi: " + mobilJangku.tahunProduksi);
    }
}
