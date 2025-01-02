/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematikaaa;

/**
 *
 * @author WINDOWS 11
 */
// Class MatematikaBeraksi
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih matematika = new MatematikaCanggih();

        // Uji konsep overloading
        System.out.println("Pertambahan(12.5, 28.7, 14.2): " + matematika.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan(12, 28, 14): " + matematika.pertambahan(12, 28, 14));
        System.out.println("Pertambahan(23, 34): " + matematika.pertambahan(23, 34));
        System.out.println("Pertambahan(3.4, 4.9): " + matematika.pertambahan(3.4, 4.9));

        // Uji method lainnya
        System.out.println("Pengurangan(12.5, 5.3): " + matematika.pengurangan(12.5, 5.3));
        System.out.println("Perkalian(3.4, 4.9): " + matematika.perkalian(3.4, 4.9));
        System.out.println("Pembagian(25.5, 5): " + matematika.pembagian(25.5, 5));
        System.out.println("Modulus(25.5, 4.2): " + matematika.modulus(25.5, 4.2));
    }
}

