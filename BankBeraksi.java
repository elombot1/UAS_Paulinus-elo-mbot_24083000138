/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author WINDOWS 11
 */
// Class BankBeraksi
public class BankBeraksi {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank ABC");

        // Tetapkan saldo awal melalui konstruktor
        Bank bank = new Bank(100000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        // Simpan uang
        bank.simpanUang(500000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        // Ambil uang
        bank.ambilUang(150000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
    }
}

