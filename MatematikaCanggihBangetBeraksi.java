/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikaa;

/**
 *
 * @author WINDOWS 11
 */
// Class MatematikaCanggihBangetBeraksi
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget matematika = new MatematikaCanggihBanget();

        // Memanggil method pertambahan
        System.out.println("Pertambahan: 10 + 20 = " + matematika.pertambahan(10, 20));

        // Memanggil method perkalian
        System.out.println("Perkalian: 10 * 20 = " + matematika.perkalian(10, 20));

        // Memanggil method modulus
        System.out.println("Modulus: 10 % 3 = " + matematika.modulus(10, 3));

        // Memanggil method pertambahanTiga
        System.out.println("Pertambahan Tiga: 10 + 20 + 30 = " + matematika.pertambahanTiga(10, 20, 30));
    }
}

