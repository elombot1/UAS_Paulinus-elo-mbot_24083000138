/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author WINDOWS 11
 */
// Class ACBeraksi
public class ACBeraksi implements AC {

    private boolean statusAC;
    private String modeAC;

    // Constructor
    public ACBeraksi() {
        this.statusAC = false; // AC mati saat awal
        this.modeAC = "Standby"; // Mode awal
    }

    @Override
    public void matikanAC() {
        if (statusAC) {
            statusAC = false;
            modeAC = "Standby";
            System.out.println("AC dimatikan.");
        } else {
            System.out.println("AC sudah dalam keadaan mati.");
        }
    }

    @Override
    public void hidupkanAC() {
        if (!statusAC) {
            statusAC = true;
            modeAC = "Normal";
            System.out.println("AC dihidupkan.");
        } else {
            System.out.println("AC sudah dalam keadaan hidup.");
        }
    }

    @Override
    public void dinginkanAC() {
        if (statusAC) {
            modeAC = "Dingin";
            System.out.println("AC dalam mode pendingin.");
        } else {
            System.out.println("Tidak dapat mendinginkan, AC dalam keadaan mati.");
        }
    }

    @Override
    public void panaskanAC() {
        if (statusAC) {
            modeAC = "Panas";
            System.out.println("AC dalam mode pemanas.");
        } else {
            System.out.println("Tidak dapat memanaskan, AC dalam keadaan mati.");
        }
    }

    public static void main(String[] args) {
        ACBeraksi ac = new ACBeraksi();

        // Hidupkan AC
        ac.hidupkanAC();

        // Dinginkan AC
        ac.dinginkanAC();

        // Panaskan AC
        ac.panaskanAC();

        // Matikan AC
        ac.matikanAC();

        // Coba mendinginkan saat AC mati
        ac.dinginkanAC();
    }
}

