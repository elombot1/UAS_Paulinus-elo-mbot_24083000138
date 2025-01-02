/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author WINDOWS 11
 */
// Class Bank
public class Bank {
    private int saldo;

    // Konstruktor dengan parameter saldo
    public Bank(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Method untuk menyimpan uang
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    // Method untuk mengambil uang
    public void ambilUang(int jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk mengambil Rp. " + jumlah);
        } else {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        }
    }

    // Method untuk mendapatkan saldo saat ini
    public int getSaldo() {
        return saldo;
    }
}

