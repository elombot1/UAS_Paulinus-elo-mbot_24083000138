/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author WINDOWS 11
 */
// Class MatematikaBeraksi
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        // Pertambahan
        int hasilPertambahan = matematika.pertambahan(20, 20);
        System.out.println("Pertambahan: 20 + 20 = " + hasilPertambahan);

        // Pengurangan
        int hasilPengurangan = matematika.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);

        // Perkalian
        int hasilPerkalian = matematika.perkalian(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + hasilPerkalian);

        // Pembagian
        int hasilPembagian = matematika.pembagian(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + hasilPembagian);
    }
}
