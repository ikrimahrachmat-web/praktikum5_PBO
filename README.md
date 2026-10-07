# Tugas Praktikum PBO Modul 5
## Aplikasi Catatan Harian (Diary) dengan Persistensi Data

**Nama:** Ikrimah  
**NIM:** L0325028

### Tujuan Praktikum
  Setelah menyelesaikan modul praktikum ini, mahasiswa diharapkan mampu:
  1. Mahasiswa mampu menerapkan operasi I/O untuk membaca dan menulis data ke dalam file eksternal secara aman.
  2. Mahasiswa mampu memahami konsep persistensi data agar status atau nilai suatu objek tidak hilang ketika program dihentikan (terminated).
  3. Mahasiswa mampu melakukan parsing data berbasis teks (TXT/CSV) menjadi instansiasi objek Java dan sebaliknya.

### BukuHarian.java
    1. Atribut
        namaPemilik: nama pemilik buku harian.
        namaFile: nama file penyimpanan, dibuat otomatis dari nama pemilik (contoh: diary_ikrimah.txt).
    2. Constructor
        Menyimpan namaPemilik, lalu menentukan namaFile dengan format "diary_" + nama (huruf kecil) + ".txt".

    3. Method tulisCatatan(tanggal, isi)
       Membuka file dengan FileWriter(namaFile, true). Parameter true berarti mode append, sehingga catatan lama tidak terhapus dan catatan baru ditambahkan di bawahnya.
       BufferedWriter membungkus FileWriter agar proses tulis lebih efisien.
       Menulis satu baris dengan format [tanggal] - isi, lalu newLine() untuk pindah baris.
       Memakai try-with-resources, jadi file otomatis ditutup. Kalau terjadi error, catch (IOException) menampilkan pesan kesalahan.
    
    4. Method bacaCatatan()
       Membuka file dengan BufferedReader dan FileReader.
       Membaca baris demi baris dengan readLine() sampai hasilnya null (akhir file), lalu mencetaknya ke konsol.
       Variabel adaIsi menandai apakah ada isi. Kalau file kosong, tampil pesan "Belum ada catatan harian.".
       Kalau file belum ada, IOException tertangkap di catch dan pesan yang sama ditampilkan.

### MainDiary.java
    Membuat objek BukuHarian dengan nama pemilik "Ikrimah".
    Memanggil tulisCatatan dua kali dengan tanggal berbeda (12-09-2026 dan 13-09-2026).
    Memanggil bacaCatatan() untuk menampilkan isi file.
    Pada uji persistensi, dua baris tulisCatatan dikomentari. Data tetap muncul karena sudah tersimpan permanen di file .txt, bukan di memori program.
