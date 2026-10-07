/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugaspraktikum.modul5;



public class MainDiary {
    public static void main(String[] args) {
        BukuHarian diarySaya = new BukuHarian("Ikrimah");

        // diarySaya.tulisCatatan("12-09-2026", "Hari ini belajar konsep I/O dan Persistensi Data di Java.");
        // diarySaya.tulisCatatan("13-09-2026", "Program catatan harian berhasil dijalankan tanpa error!");

        diarySaya.bacaCatatan();
    }
}
