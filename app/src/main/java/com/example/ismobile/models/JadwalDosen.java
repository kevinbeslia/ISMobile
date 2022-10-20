package com.example.ismobile.models;

public class JadwalDosen {
    public String nama;
    public String nim;
    public String skripsi;
    public String waktu;
    public String kategori;
    public String jam;
    public String tempat;
    int ava;

    public JadwalDosen(String kategori, String nama, String nim, String skripsi, String waktu, String jam, String tempat) {
        this.nama = nama;
        this.nim = nim;
        this.ava = ava;
        this.waktu = waktu;
        this.skripsi = skripsi;
        this.kategori = kategori;
        this.jam = jam;
        this.tempat = tempat;
    }
}

