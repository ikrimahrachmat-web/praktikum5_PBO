/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugaspraktikum.modul5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {
    String namaPemilik;
    String namaFile;
    //constructor
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik.toLowerCase().replace("","_") + ".txt";
    }
    //method untuk menulis
    public void tulisCatatan(String tanggal, String isi){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile, true))) {
            bw.write("[" + tanggal + "] - " + isi);
            bw.newLine(); // Pindah baris baru
            System.out.println("Catatan tanggal " + tanggal + " berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis catatan: " + e.getMessage());
        }
    }
    //method untuk membaca
    public void bacaCatatan() {
        try (BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            System.out.println("\n=== Catatan Harian milik " + namaPemilik + " ===");
            boolean adaIsi = false;
            while ((baris = br.readLine()) != null) {
                System.out.println(baris);
                adaIsi = true;
            }
            if (!adaIsi) {
                System.out.println("Belum ada catatan harian.");
            }
        } catch (IOException e) {
            System.out.println("Belum ada catatan harian.");
        }
    }
}
