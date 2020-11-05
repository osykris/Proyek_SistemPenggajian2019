/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
class Njajal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String uName, pass;
        int nilaii = 0;
        int pilmenu;
        String nopeg, lembur;
        String[][] biodata = {{"Nama Pegawai", "Muhammad Daffa"}, {"Nomor Pegawai", "1931710044"}, {"Jenis Kelamin", "Laki-Laki"}, {"Alamat", "Malang"}, {"Jabatan", "Direktur Keuangan"}, {"Status", "Kawin (Anak 2)"}, {"Pendidikan", "S1"},
        {"Nama Pegawai", "Osy Krisdayanti"}, {"Nomor Pegawai", "1931710075"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Blitar"}, {"Jabatan", "Senior Manajer"}, {"Status", "Kawin (Anak 2)"}, {"Pendidikan", "S1"},
        {"Nama Pegawai", "Neli Alvionita"}, {"Nomor Pegawai", "1931710077"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Mojokerto"}, {"Jabatan", "Staff Pelaksana"}, {"Status", "Kawin (Anak 3)"}, {"Pendidikan", "S1"},
        {"Nama Pegawai", "Yayang Nirmala Novend"}, {"Nomor Pegawai", "1931710052"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Madiun"}, {"Jabatan", "Customer Service"}, {"Status", "Belum Kawin"}, {"Pendidikan", "S1"},
        {"Nama Pegawai", "Dyah Ayu Anggraini"}, {"Nomor Pegawai", "1931710112"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Blitar"}, {"Jabatan", "Pramugari"}, {"Status", "Kawin (Anak 3)"}, {"Pendidikan", "SMA"},
        {"Nama Pegawai", "Susanti"}, {"Nomor Pegawai", "1931710067"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Tuban"}, {"Jabatan", "Supervisor"}, {"Status", "Belum Kawin"}, {"Pendidikan", "S1"},
        {"Nama Pegawai", "Mochamad Andy Rachman"}, {"Nomor Pegawai", "1931710010"}, {"Jenis Kelamin", "Laki-Laki"}, {"Alamat", "Kediri"}, {"Jabatan", "Masinis"}, {"Status", "Kawin (Anak 1)"}, {"Pendidikan", "S1"},
        {"Nama Pegawai", "Muhammad Najib Alif"}, {"Nomor Pegawai", "1931710088"}, {"Jenis Kelamin", "Laki-Laki"}, {"Alamat", "Pasuruan"}, {"Jabatan", "Pramugara"}, {"Status", "Belum Kawin"}, {"Pendidikan", "SMA"}};
        String[] menu = {"Profil Anda", "Pencarian Profil Pegawai", "Data Jabatan dan Gaji Pokok", "Perhitungan dan Slip Gaji Tiap Pegawai", "Pelaporan Penggajian", "Log Out"};
        String[][] jabatan = {{"Direktur Keuangan", "28400000"}, {"Senior manajer", "5000000"}, {"Staff Pelaksana", "4200000"}, {"Customer Service", "4000000"},
        {"Pegawai Pramugari", "40000000"}, {"Pegawai Pramugara", "4000000"}, {"Pegawai Supervisor", "9000000"}, {"Pegawai Masinis", "8000000"}};
        System.out.println("==================================================");
        System.out.println("|| \t      >>>SELAMAT DATANG<<< \t\t||");
        System.out.println("==================================================");
        System.out.println("---------Silahkan melakukan proses log in---------");
        NumberFormat formatnomor = new DecimalFormat("#,##,###");
        String gajipokok = "Gaji pokok Pegawai/bulan\t: Rp. ";
        String tunjangantrans = "Tunjangan Transport/bulan\t: Rp. ";
        String tunjangankeb = "Tunjangan Kebugaran/bulan\t: Rp. ";
        String tunjanganlus = "Tunjangan Lulusan S1/bulan\t: Rp. ";
        String tunjangankel = "Tunjangan Keluarga/bulan\t: Rp. ";
        String gajilembur = "Gaji Lembur Pegawai/bulan\t: Rp. ";
        String gajikotor = "Gaji Kotor Pegawai/bulan\t: Rp. ";
        String pajak = "Pajak Penghasilan/bulan\t: Rp. ";
        String gajibersih = "Gaji Bersih Pegawai/bulan\t: Rp. ";
        String tunjanganlus2 = "Tunjangan Lulusan SMA/bulan\t: Rp. ";
        String tunjangmas = "Tunjangan Masinis/bulan\t: Rp. ";
        for (int i = 0; i <= 3; i++) {
            nilaii = i + 1;
            System.out.print("Masukkan Username\t\t: ");
            uName = input.next();
            System.out.print("Masukkan Password\t\t: ");
            pass = input.next();
            System.out.println("==================================================");
            if ("MDaffa".equals(uName) && ("java".equals(pass))) {
                
            } else {
                System.out.println("-----------Mohon Maaf Log In Anda Gagal-----------");
            }
            if (nilaii > 3) {
                System.out.println("Akun Anda terblokir. Silahkan menghubungi customer services:)");
            }
        }
    }
}
