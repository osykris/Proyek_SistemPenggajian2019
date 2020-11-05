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
public class FinalProject {

    static String uName, pass;
    static int nilaii = 0;
    static int pilmenu;
    static String nopeg, lembur;
    static String[] menu = {"Profil Anda", "Pencarian Profil Pegawai", "Data Jabatan dan Gaji Pokok", "Perhitungan dan Slip Gaji Tiap Pegawai", "Pelaporan Penggajian", "Log Out"};
    static String[][] jabatan = {{"Direktur Keuangan", "28,400,000"}, {"Senior manajer", "5,000,000"}, {"Staff Pelaksana", "4,200,000"}, {"Customer Service", "4,000,000"},
    {"Pegawai Pramugari", "4,000,000"}, {"Pegawai Pramugara", "4,000,000"}, {"Pegawai Supervisor", "9,000,000"}, {"Pegawai Masinis", "8,000,000"}};
    static String[][] biodata = {{"Nama Pegawai", "Muhammad Daffa"}, {"Nomor Pegawai", "1931710044"}, {"Jenis Kelamin", "Laki-Laki"}, {"Alamat", "Malang"}, {"Jabatan", "Direktur Keuangan"}, {"Status", "Kawin (Anak 2)"}, {"Pendidikan", "S1"},
    {"Nama Pegawai", "Osy Krisdayanti"}, {"Nomor Pegawai", "1931710075"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Blitar"}, {"Jabatan", "Senior Manajer"}, {"Status", "Kawin (Anak 2)"}, {"Pendidikan", "S1"},
    {"Nama Pegawai", "Neli Alvionita"}, {"Nomor Pegawai", "1931710077"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Mojokerto"}, {"Jabatan", "Staff Pelaksana"}, {"Status", "Kawin (Anak 3)"}, {"Pendidikan", "S1"},
    {"Nama Pegawai", "Yayang Nirmala Novend"}, {"Nomor Pegawai", "1931710052"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Madiun"}, {"Jabatan", "Customer Service"}, {"Status", "Belum Kawin"}, {"Pendidikan", "S1"},
    {"Nama Pegawai", "Dyah Ayu Anggraini"}, {"Nomor Pegawai", "1931710112"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Blitar"}, {"Jabatan", "Pramugari"}, {"Status", "Kawin (Anak 3)"}, {"Pendidikan", "SMA"},
    {"Nama Pegawai", "Susanti"}, {"Nomor Pegawai", "1931710067"}, {"Jenis Kelamin", "Perempuan"}, {"Alamat", "Tuban"}, {"Jabatan", "Supervisor"}, {"Status", "Belum Kawin"}, {"Pendidikan", "S1"},
    {"Nama Pegawai", "Mochamad Andy Rachman"}, {"Nomor Pegawai", "1931710010"}, {"Jenis Kelamin", "Laki-Laki"}, {"Alamat", "Kediri"}, {"Jabatan", "Masinis"}, {"Status", "Kawin (Anak 1)"}, {"Pendidikan", "S1"},
    {"Nama Pegawai", "Muhammad Najib Alif"}, {"Nomor Pegawai", "1931710088"}, {"Jenis Kelamin", "Laki-Laki"}, {"Alamat", "Pasuruan"}, {"Jabatan", "Pramugara"}, {"Status", "Belum Kawin"}, {"Pendidikan", "SMA"}};
    static Scanner input = new Scanner(System.in);
    static NumberFormat formatnomor = new DecimalFormat("#,##,###");
    static String gajipokok = "Gaji pokok Pegawai/bulan\t: Rp. ";
    static String tunjangantrans = "Tunjangan Transport/bulan\t: Rp. ";
    static String tunjangankeb = "Tunjangan Kebugaran/bulan\t: Rp. ";
    static String tunjanganlus = "Tunjangan Lulusan S1/bulan\t: Rp. ";
    static String tunjangankel = "Tunjangan Keluarga/bulan\t: Rp. ";
    static String gajilembur = "Gaji Lembur Pegawai/bulan\t: Rp. ";
    static String gajikotor = "Gaji Kotor Pegawai/bulan\t: Rp. ";
    static String pajak = "Pajak Penghasilan/bulan\t: Rp. ";
    static String gajibersih = "Gaji Bersih Pegawai/bulan\t: Rp. ";
    static String tunjanganlus2 = "Tunjangan Lulusan SMA/bulan\t: Rp. ";
    static String tunjangmas = "Tunjangan Masinis/bulan\t: Rp. ";

    static void menu() {
        System.out.println("==================================================");
        System.out.println("|| \t      >>>SELAMAT DATANG<<< \t\t||");
        System.out.println("||\tdi Program Perhitungan Gaji Pegawai \t||");
        System.out.println("||\t   PT Kereta Api Sukses Tenan\t\t||");
        System.out.println("==================================================");
        System.out.println("------Silahkan Klik Menu Yang Anda Inginkan-------");
        for (int k = 0; k < 6; k++) {
            System.out.println((k + 1) + ". " + menu[k]);
        }
        System.out.println("==================================================");
        pilmenu = input.nextInt();
        System.out.println("==================================================");
        if (pilmenu == 1) {
            System.out.println("||\t\t>>>PROFIL ANDA<<<\t\t||");
            System.out.println("==================================================");
            for (int k = 0; k < 6; k++) {
                System.out.print("> " + biodata[k][0] + "\t\t: " + biodata[k][1]);
                System.out.println();
            }
            System.out.println("==================================================");
        } else if (pilmenu == 2) {
            System.out.println("||\t>>>PENCARIAN PROFIL PEGAWAI<<<\t\t||");
            System.out.println("==================================================");
            System.out.print("Masukkan Nomor Pegawai\t: ");
            nopeg = input.next();
            if (nopeg.equals("1931710075")) {
                for (int a = 7; a < 14; a++) {
                    System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                    System.out.println();
                }
                System.out.println("==================================================");
            } else if (nopeg.equals("1931710077")) {
                for (int a = 14; a < 21; a++) {
                    System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                    System.out.println();
                }
                System.out.println("==================================================");
            } else if (nopeg.equals("1931710052")) {
                for (int a = 21; a < 28; a++) {
                    System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                    System.out.println();
                }
                System.out.println("==================================================");
            } else if (nopeg.equals("1931710112")) {
                for (int a = 28; a < 35; a++) {
                    System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                    System.out.println();
                }
                System.out.println("==================================================");
            } else if (nopeg.equals("1931710067")) {
                for (int a = 35; a < 42; a++) {
                    System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                    System.out.println();
                }
                System.out.println("==================================================");
            } else if (nopeg.equals("1931710010")) {
                for (int a = 42; a < 49; a++) {
                    System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                    System.out.println();
                }
                System.out.println("==================================================");
            } else if (nopeg.equals("1931710088")) {
                for (int a = 49; a < 56; a++) {
                    System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                    System.out.println();
                }
                System.out.println("==================================================");
            } else {
                System.out.println("-Mohon Maaf NIP Tidak di Temukan-");
                System.out.println("==================================================");
            }
        } else if (pilmenu == 3) {
            System.out.println("||\t>>>DATA JABATAN DAN GAJI POKOK<<<\t||");
            System.out.println("==================================================");
            for (int l = 0; l < jabatan.length; l++) {
                System.out.print((l + 1) + ". " + jabatan[l][0] + "\t\t: Rp. " + jabatan[l][1]);
                System.out.println();
            }
            System.out.println("==================================================");
        } else if (pilmenu == 4) {
            System.out.println("|| >>>PERHITUNGAN DAN SLIP GAJI TIAP PEGAWAI<<< ||");
            System.out.println("==================================================");
            System.out.print("Masukkan Nomor Pegawai\t: ");
            nopeg = input.next();
            int transport1 = 375000;
            int kebugaran1 = 1000000;
            int lulusan1 = 600000;
            int lembur1 = 70000;
            int lulusan2 = 200000;
            if (nopeg.equals("1931710075")) {
                int gajipokok1 = 28400000;
                System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                lembur = input.next();
                if ("ya".equals(lembur)) {
                    System.out.print("Berapa jam pegawai lembur (jam)? ");
                    int jam = input.nextInt();
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 7; a < 14; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    int lem1 = lembur1 * jam;
                    double kel1 = 0.1 * gajipokok1;
                    double total1 = gajipokok1 + kel1 + lulusan1 + transport1 + lem1 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok1));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel1));
                    System.out.println("-> " + gajilembur + "" + formatnomor.format(lem1));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total1));
                    if (total1 >= 15000000) {
                        double pphtotal1 = 0.025 * gajipokok1;
                        double bersih1 = total1 - pphtotal1;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal1 = gajipokok1 * 0;
                        int bersih1 = (int) (total1 - pphtotal1);
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                        System.out.println("**************************************************");
                    }
                } else {
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 7; a < 14; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    double kel1 = 0.1 * gajipokok1;
                    double total1 = gajipokok1 + kel1 + lulusan1 + transport1 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok1));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel1));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total1));
                    if (total1 >= 15000000) {
                        double pphtotal1 = 0.025 * gajipokok1;
                        double bersih1 = total1 - pphtotal1;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal1 = total1 * 0;
                        double bersih1 = total1 - pphtotal1;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                        System.out.println("**************************************************");
                    }
                }
            } else if (nopeg.equals("1931710077")) {
                int gajipokok2 = 5000000;
                System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                lembur = input.next();
                if ("ya".equals(lembur)) {
                    System.out.print("Berapa jam pegawai lembur (jam)? ");
                    int jam = input.nextInt();
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 14; a < 21; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    int lem2 = lembur1 * jam;
                    double kel2 = 0.1 * gajipokok2;
                    double total2 = gajipokok2 + kel2 + lulusan1 + transport1 + lem2 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok2));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel2));
                    System.out.println("-> " + gajilembur + "" + formatnomor.format(lem2));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total2));
                    if (total2 >= 15000000) {
                        double pphtotal2 = 0.025 * gajipokok2;
                        double bersih2 = total2 - pphtotal2;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal2));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih2));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal2 = gajipokok2 * 0;
                        int bersih2 = (int) (total2 - pphtotal2);
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal2));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih2));
                        System.out.println("**************************************************");
                    }
                } else {
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 14; a < 21; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    double kel2 = 0.1 * gajipokok2;
                    double total2 = gajipokok2 + kel2 + lulusan1 + transport1 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok2));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel2));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total2));
                    if (total2 >= 15000000) {
                        double pphtotal2 = 0.025 * gajipokok2;
                        double bersih2 = total2 - pphtotal2;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal2));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih2));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal2 = total2 * 0;
                        double bersih2 = total2 - pphtotal2;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal2));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih2));
                        System.out.println("**************************************************");
                    }
                }
            } else if (nopeg.equals("1931710052")) {
                int gajipokok3 = 4200000;
                System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                lembur = input.next();
                if ("ya".equals(lembur)) {
                    System.out.print("Berapa jam pegawai lembur (jam)? ");
                    int jam = input.nextInt();
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 21; a < 28; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    int lem3 = lembur1 * jam;
                    double total3 = gajipokok3 + lulusan1 + transport1 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok3));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + gajilembur + "" + formatnomor.format(lem3));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total3));
                    if (total3 >= 15000000) {
                        double pphtotal3 = 0.025 * gajipokok3;
                        double bersih3 = total3 - pphtotal3;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal3));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih3));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal3 = gajipokok3 * 0;
                        int bersih3 = (int) (total3 - pphtotal3);
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal3));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih3));
                        System.out.println("**************************************************");
                    }
                } else {
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 21; a < 28; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    double total3 = gajipokok3 + lulusan1 + transport1 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok3));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total3));
                    if (total3 >= 15000000) {
                        double pphtotal3 = 0.025 * gajipokok3;
                        double bersih3 = total3 - pphtotal3;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal3));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih3));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal3 = total3 * 0;
                        double bersih3 = total3 - pphtotal3;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal3));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih3));
                        System.out.println("**************************************************");
                    }
                }
            } else if (nopeg.equals("1931710112")) {
                int gajipokok4 = 4000000;
                System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                lembur = input.next();
                if ("ya".equals(lembur)) {
                    System.out.print("Berapa jam pegawai lembur (jam)? ");
                    int jam = input.nextInt();
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 28; a < 35; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    int lem4 = lembur1 * jam;
                    double kel4 = 0.1 * gajipokok4;
                    double total4 = gajipokok4 + kel4 + lulusan1 + transport1 + lem4 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok4));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus2 + "" + formatnomor.format(lulusan2));
                    System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel4));
                    System.out.println("-> " + gajilembur + "" + formatnomor.format(lem4));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total4));
                    if (total4 >= 15000000) {
                        double pphtotal4 = 0.025 * gajipokok4;
                        double bersih4 = total4 - pphtotal4;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal4));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih4));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal4 = gajipokok4 * 0;
                        int bersih4 = (int) (total4 - pphtotal4);
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal4));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih4));
                        System.out.println("**************************************************");
                    }
                } else {
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 28; a < 35; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    double kel4 = 0.1 * gajipokok4;
                    double total4 = gajipokok4 + kel4 + lulusan1 + transport1 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok4));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel4));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total4));
                    if (total4 >= 15000000) {
                        double pphtotal4 = 0.025 * gajipokok4;
                        double bersih4 = total4 - pphtotal4;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal4));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih4));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal4 = total4 * 0;
                        double bersih4 = total4 - pphtotal4;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal4));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih4));
                        System.out.println("**************************************************");
                    }
                }
            } else if (nopeg.equals("1931710067")) {
                int gajipokok5 = 9000000;
                System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                lembur = input.next();
                if ("ya".equals(lembur)) {
                    System.out.print("Berapa jam pegawai lembur (jam)? ");
                    int jam = input.nextInt();
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 35; a < 42; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    int lem5 = lembur1 * jam;
                    double total5 = gajipokok5 + lulusan1 + transport1 + lem5 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok5));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + gajilembur + "" + formatnomor.format(lem5));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total5));
                    if (total5 >= 15000000) {
                        double pphtotal5 = 0.025 * gajipokok5;
                        double bersih5 = total5 - pphtotal5;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal5));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih5));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal5 = gajipokok5 * 0;
                        int bersih5 = (int) (total5 - pphtotal5);
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal5));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih5));
                        System.out.println("**************************************************");
                    }
                } else {
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 35; a < 42; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    double total5 = gajipokok5 + lulusan1 + transport1 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok5));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total5));
                    if (total5 >= 15000000) {
                        double pphtotal5 = 0.025 * gajipokok5;
                        double bersih5 = total5 - pphtotal5;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal5));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih5));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal5 = total5 * 0;
                        double bersih5 = total5 - pphtotal5;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal5));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih5));
                        System.out.println("**************************************************");
                    }
                }
            } else if (nopeg.equals("1931710010")) {
                int gajipokok6 = 8000000;
                int tunjanganmas = 1000000;
                System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                lembur = input.next();
                if ("ya".equals(lembur)) {
                    System.out.print("Berapa jam pegawai lembur (jam)? ");
                    int jam = input.nextInt();
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 42; a < 49; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    int lem6 = lembur1 * jam;
                    double kel6 = 0.1 * gajipokok6;
                    double total6 = gajipokok6 + kel6 + lulusan1 + transport1 + lem6 + kebugaran1 + tunjanganmas;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok6));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel6));
                    System.out.println("-> " + gajilembur + "" + formatnomor.format(lem6));
                    System.out.println("-> " + tunjangmas + "" + formatnomor.format(tunjanganmas));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total6));
                    if (total6 >= 15000000) {
                        double pphtotal6 = 0.025 * gajipokok6;
                        double bersih6 = total6 - pphtotal6;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal6));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih6));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal6 = gajipokok6 * 0;
                        int bersih6 = (int) (total6 - pphtotal6);
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal6));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih6));
                        System.out.println("**************************************************");
                    }
                } else {
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 42; a < 49; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    double kel6 = 0.1 * gajipokok6;
                    double total6 = gajipokok6 + kel6 + lulusan1 + transport1 + kebugaran1 + tunjanganmas;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok6));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan1));
                    System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel6));
                    System.out.println("-> " + tunjangmas + "" + formatnomor.format(tunjanganmas));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total6));
                    if (total6 >= 15000000) {
                        double pphtotal6 = 0.025 * gajipokok6;
                        double bersih6 = total6 - pphtotal6;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal6));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih6));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal6 = total6 * 0;
                        double bersih6 = total6 - pphtotal6;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal6));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih6));
                        System.out.println("**************************************************");
                    }
                }
            } else if (nopeg.equals("1931710088")) {
                int gajipokok7 = 4000000;
                System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                lembur = input.next();
                if ("ya".equals(lembur)) {
                    System.out.print("Berapa jam pegawai lembur (jam)? ");
                    int jam = input.nextInt();
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 49; a < 56; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    int lem7 = lembur1 * jam;
                    double total7 = gajipokok7 + lulusan2 + transport1 + lem7 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok7));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan2));
                    System.out.println("-> " + gajilembur + "" + formatnomor.format(lem7));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total7));
                    if (total7 >= 15000000) {
                        double pphtotal7 = 0.025 * gajipokok7;
                        double bersih7 = total7 - pphtotal7;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal7));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih7));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal7 = gajipokok7 * 0;
                        int bersih7 = (int) (total7 - pphtotal7);
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal7));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih7));
                        System.out.println("**************************************************");
                    }
                } else {
                    System.out.println();
                    System.out.println("**************************************************");
                    System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                    System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                    System.out.println("**************************************************");
                    for (int a = 49; a < 56; a++) {
                        System.out.print("> " + biodata[a][0] + "\t\t: " + biodata[a][1]);
                        System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    double total7 = gajipokok7 + lulusan2 + transport1 + kebugaran1;
                    System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok7));
                    System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                    System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                    System.out.println("-> " + tunjanganlus + "" + formatnomor.format(lulusan2));
                    System.out.println("-----------------------------------------------  +");
                    System.out.println("-> " + gajikotor + "" + formatnomor.format(total7));
                    if (total7 >= 15000000) {
                        double pphtotal7 = 0.025 * gajipokok7;
                        double bersih7 = total7 - pphtotal7;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal7));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih7));
                        System.out.println("**************************************************");
                    } else {
                        double pphtotal7 = total7 * 0;
                        double bersih7 = total7 - pphtotal7;
                        System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal7));
                        System.out.println("-----------------------------------------------  -");
                        System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih7));
                        System.out.println("**************************************************");
                    }
                }
            } else {
                System.out.println("-Maaf keyword yang Anda masukkan salah-");
            }
        } else if (pilmenu == 5) {
            System.out.println("||\t   >>>PELAPORAN PENGGAJIAN<<<     \t||");
            System.out.println("==================================================");
            System.out.println("-------Laporan Penggajian Selama Satu Tahun-------");
            System.out.println("Nomor Induk Peggawai\t: 19317110075");
            System.out.println("Nama Pegawai\t: Osy Krisdayanti");
            System.out.println("Gaji Bersih Pegawai\t: ");
        } else if (pilmenu == 6) {
            System.out.println("------Anda keluar dalam sistem programan ini------");
            System.exit(0);
        }
    }

    static void login() {
        System.out.println("==================================================");
        System.out.println("|| \t      >>>SELAMAT DATANG<<< \t\t||");
        System.out.println("==================================================");
        System.out.println("---------Silahkan melakukan proses log in---------");
        for (int i = 0; i <= 3; i++) {
            nilaii = i + 1;
            System.out.print("Masukkan Username\t\t: ");
            uName = input.next();
            System.out.print("Masukkan Password\t\t: ");
            pass = input.next();
            if ("MDaffa".equals(uName) && ("java".equals(pass))) {
                menu();
                pertanyaan();
                break;
            } else {
                System.out.println("-----------Mohon Maaf Log In Anda Gagal-----------");
            }
            if (nilaii > 3) {
                System.out.println("Akun Anda terblokir. Silahkan menghubungi customer services:)");
            }
        }
    }

    static void pertanyaan() {
        String pert = null;
        System.out.print("Apakah Anda ingin kembali ke menu utama?(y/t) ");
        pert = input.next();
        if ("y".equals(pert)) {
            menu();
            pertanyaan();
        } else {
            System.out.println("------Anda keluar dalam sistem programan ini------");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        login();
    }
}
