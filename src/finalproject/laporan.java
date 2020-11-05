/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Windows
 */
public class laporan {

    static String uName, pass;
    static int nilaii = 0;
    static int pilmenu;
    static int jam = 0;
    static String nopeg, lembur;
    static String[] menu = {"Profil Anda", "Pencarian Profil Pegawai", "Data Jabatan dan Gaji Pokok", "Perhitungan dan Slip Gaji Tiap Pegawai", "Pelaporan Penggajian", "Log Out"};
    static String[][] jabatan = {{"Direktur Keuangan", "42,400,000"}, {"Senior manajer", "28,400,000"}, {"Staff Pelaksana", "4,200,000"}, {"Customer Service", "4,000,000"},
    {"Pegawai Pramugari", "4,000,000"}, {"Pegawai Pramugara", "4,000,000"}, {"Pegawai Supervisor", "9,000,000"}, {"Pegawai Masinis", "8,000,000"}};
    static String[][] biodatauser = {{"Nama Anda", "Muhammad Daffa"}, {"Nomor Pegawai", "1931710044"}, {"Jenis Kelamin", "Laki-Laki"}, {"Alamat", "Malang"}, {"Jabatan", "Direktur Keuangan"}, {"Status", "Kawin (Anak 2)"}, {"Pendidikan", "S1"}};
    static String[] namapeg = {"Osy Krisdayanti", "Neli Alvionita", "Yayang Nirmala Novend", "Dyah Ayu Anggraini", "Susanti", "Mochammad Andy Rachman", "Muhammad Najib Alif"};
    static String[] jabatanpeg = {"Senior Manajer", "Staff Pelaksana", "Customer Service", "Pramugari", "Supervisor", "Masinis", "Pramugara"};
    static String[] jeniskel = {"Perempuan", "Perempuan", "Perempuan", "Perempuan", "Perempuan", "Laki-Laki", "Laki-Laki"};
    static String[] status = {"Kawin (Anak 2)", "Kawin (Anak 3)", "Belum Kawin", "Kawin (Anak 3)", "Belum Kawin", "Kawin (Anak 1)", "Belum Kawin"};
    static String[] alamat = {"Blitar", "Mojokerto", "Madiun", "Blitar", "Tuban", "Kediri", "Pasuruan"};
    static String[] nip = {"1931710075", "1931710077", "1931710052", "1931710112", "1931710067", "1931710010", "1931710088"};
    static int[] gajipokok1 = {28400000, 4200000, 4000000, 4000000, 9000000, 8000000, 4000000};
    static Scanner input = new Scanner(System.in);
    static NumberFormat formatnomor = new DecimalFormat("#,##,###");
    static String gajipokok = "Gaji pokok Pegawai/bulan\t: Rp. ";
    static String tunjangantrans = "Tunjangan Transport/bulan\t: Rp. ";
    static String tunjangankeb = "Tunjangan Kebugaran/bulan\t: Rp. ";
    static String tunjangankel = "Tunjangan Keluarga/bulan\t: Rp. ";
    static String gajilembur = "Gaji Lembur Pegawai/bulan\t: Rp. ";
    static String gajikotor = "Gaji Kotor Pegawai/bulan\t: Rp. ";
    static String pajak = "Pajak Penghasilan/bulan\t: Rp. ";
    static String gajibersih = "Gaji Bersih Pegawai/bulan\t: Rp. ";
    static String tunjangmas = "Tunjangan Masinis/bulan\t: Rp. ";
    static String gajibersihtahun = "Gaji Bersih Pegawai/tahun\t: Rp. ";
    static int check = 0, check1 = 0;

    static String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    static String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss ");
        Date date = new Date();
        return dateFormat.format(date);
    }

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
                System.out.print("> " + biodatauser[k][0] + "\t\t: " + biodatauser[k][1]);
                System.out.println();
            }
            System.out.println("==================================================");
        } else if (pilmenu == 2) {
            System.out.println("||\t>>>PENCARIAN PROFIL PEGAWAI<<<\t\t||");
            System.out.println("==================================================");
            System.out.print("Masukkan Nomor Pegawai\t: ");
            nopeg = input.next();
            for (int i = 0; i < namapeg.length; i++) {
                if (nopeg.equals(nip[i])) {
                    System.out.println("> Nama Pegawai\t\t: " + namapeg[i]);
                    System.out.println("> Nomor Pegawai\t\t: " + nip[i]);
                    System.out.println("> Jenis Kelamis\t\t: " + jeniskel[i]);
                    System.out.println("> Alamat\t\t: " + alamat[i]);
                    System.out.println("> Jabatan\t\t: " + jabatanpeg[i]);
                    System.out.println("> Status\t\t: " + status[i]);
                    System.out.println("==================================================");
                    check = 1;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("-Mohon Maaf Nomor Pegawai Tidak di Temukan-");
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
            for (int i = 0; i < namapeg.length; i++) {
                if (nopeg.equals(nip[i])) {
                    System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                    lembur = input.next();
                    int transport1 = 375000;
                    int kebugaran1 = 1000000;
                    int lembur1 = 70000;
                    int lem1;
                    double kel1 = 0, total1 = 0;
                    if (lembur.equals("y")) {
                        System.out.print("Berapa jam pegawai lembur (jam)? ");
                        jam = input.nextInt();
                        System.out.println();
                        System.out.println("**************************************************");
                        System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                        System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                        System.out.println("**************************************************");
                        System.out.println("\t\t   " + getTanggal());
                        System.out.println("\t\t    " + getWaktu());
                        System.out.println("--------------------------------------------------");
                        System.out.println("> Nama Pegawai\t\t: " + namapeg[i]);
                        System.out.println("> Nomor Pegawai\t\t: " + nip[i]);
                        System.out.println("> Jenis Kelamis\t\t: " + jeniskel[i]);
                        System.out.println("> Alamat\t\t: " + alamat[i]);
                        System.out.println("> Jabatan\t\t: " + jabatanpeg[i]);
                        System.out.println("> Status\t\t: " + status[i]);
                        System.out.println("--------------------------------------------------");
                        lem1 = lembur1 * jam;
                        kel1 = 0.1 * gajipokok1[i];
                        total1 = gajipokok1[i] + kel1 + transport1 + lem1 + kebugaran1;
                        System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok1[i]));
                        System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                        System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                        System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel1));
                        System.out.println("-> " + gajilembur + "" + formatnomor.format(lem1));
                        System.out.println("-----------------------------------------------  +");
                        System.out.println("-> " + gajikotor + "" + formatnomor.format(total1));
                        if (total1 >= 15000000) {
                            double pphtotal1 = 0.025 * gajipokok1[i];
                            double bersih1 = total1 - pphtotal1;
                            System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                            System.out.println("-----------------------------------------------  -");
                            System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                            System.out.println("**************************************************");
                        } else {
                            double pphtotal1 = gajipokok1[i] * 0;
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
                        System.out.println("\t\t   " + getTanggal());
                        System.out.println("\t\t    " + getWaktu());
                        System.out.println("--------------------------------------------------");
                        System.out.println("> Nama Pegawai\t\t: " + namapeg[i]);
                        System.out.println("> Nomor Pegawai\t\t: " + nip[i]);
                        System.out.println("> Jenis Kelamis\t\t: " + jeniskel[i]);
                        System.out.println("> Alamat\t\t: " + alamat[i]);
                        System.out.println("> Jabatan\t\t: " + jabatanpeg[i]);
                        System.out.println("> Status\t\t: " + status[i]);
                        System.out.println("--------------------------------------------------");
                        kel1 = 0.1 * gajipokok1[i];
                        total1 = gajipokok1[i] + kel1 + transport1 + kebugaran1;
                        System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok1[i]));
                        System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                        System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                        System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel1));
                        System.out.println("-----------------------------------------------  +");
                        System.out.println("-> " + gajikotor + "" + formatnomor.format(total1));
                        if (total1 >= 15000000) {
                            double pphtotal1 = 0.025 * gajipokok1[i];
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
                    check1 = 1;
                    break;
                }

            }
            if (check1 == 0) {
                System.out.println("-Mohon Maaf Nomor Pegawai Tidak di Temukan-");

            }
            System.out.println("==================================================");
        } else if (pilmenu == 5) {
            System.out.println("||\t   >>>PELAPORAN PENGGAJIAN<<<     \t||");
            System.out.println("==================================================");
            System.out.println("-------Laporan Penggajian Selama Satu Tahun-------");
            System.out.print("Masukkan Nomor Pegawai\t: ");
            nopeg = input.next();
            for (int i = 0; i < namapeg.length; i++) {
                if (nopeg.equals(nip[i])) {
                    System.out.print("Apakah pegawai lembur (dalam sebulan)?(ya/tidak)");
                    lembur = input.next();
                    int transport1 = 375000;
                    int kebugaran1 = 1000000;
                    int lembur1 = 70000;
                    int lem1;
                    double kel1 = 0, total1 = 0;
                    if (lembur.equals("y")) {
                        System.out.println();
                        System.out.println("**************************************************");
                        System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                        System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                        System.out.println("**************************************************");
                        System.out.println("-------Laporan Penggajian Selama Satu Tahun-------");
                        System.out.println("\t\t   " + getTanggal());
                        System.out.println("\t\t    " + getWaktu());
                        System.out.println("--------------------------------------------------");
                        System.out.println("> Nama Pegawai\t\t: " + namapeg[i]);
                        System.out.println("> Nomor Pegawai\t\t: " + nip[i]);
                        System.out.println("> Jenis Kelamis\t\t: " + jeniskel[i]);
                        System.out.println("> Alamat\t\t: " + alamat[i]);
                        System.out.println("> Jabatan\t\t: " + jabatanpeg[i]);
                        System.out.println("> Status\t\t: " + status[i]);
                        System.out.println("--------------------------------------------------");
                        lem1 = lembur1 * jam;
                        kel1 = 0.1 * gajipokok1[i];
                        total1 = gajipokok1[i] + kel1 + transport1 + lem1 + kebugaran1;
                        System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok1[i]));
                        System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                        System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                        System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel1));
                        System.out.println("-> " + gajilembur + "" + formatnomor.format(lem1));
                        System.out.println("-----------------------------------------------  +");
                        System.out.println("-> " + gajikotor + "" + formatnomor.format(total1));
                        if (total1 >= 15000000) {
                            double pphtotal1 = 0.025 * gajipokok1[i];
                            double bersih1 = total1 - pphtotal1;
                            double bersih11 = (total1 - pphtotal1) * 12;
                            System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                            System.out.println("-----------------------------------------------  -");
                            System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                            System.out.println("--------------------------------------------------");
                            System.out.println("-> Perhitungannya adalah " + formatnomor.format(bersih1) + " * 12");
                            System.out.println("-> " + gajibersihtahun + "" + formatnomor.format(bersih11));
                            System.out.println("**************************************************");
                        } else {
                            double pphtotal1 = gajipokok1[i] * 0;
                            int bersih1 = (int) (total1 - pphtotal1);
                            double bersih11 = (total1 - pphtotal1) * 12;
                            System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                            System.out.println("-----------------------------------------------  -");
                            System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                            System.out.println("--------------------------------------------------");
                            System.out.println("-> Perhitungannya adalah " + formatnomor.format(bersih1) + " * 12");
                            System.out.println("-> " + gajibersihtahun + "" + formatnomor.format(bersih11));
                            System.out.println("**************************************************");
                        }
                    } else {
                        System.out.println();
                        System.out.println("**************************************************");
                        System.out.println("*\t  >>>PT KERETA API SUKSES TENAN<<<\t *");
                        System.out.println("*     PERINCIAN PEMBAYARAN PENGHASILAN PEGAWAI   *");
                        System.out.println("**************************************************");
                        System.out.println("-------Laporan Penggajian Selama Satu Tahun-------");
                        System.out.println("\t\t   " + getTanggal());
                        System.out.println("\t\t    " + getWaktu());
                        System.out.println("--------------------------------------------------");
                        System.out.println("> Nama Pegawai\t\t: " + namapeg[i]);
                        System.out.println("> Nomor Pegawai\t\t: " + nip[i]);
                        System.out.println("> Jenis Kelamis\t\t: " + jeniskel[i]);
                        System.out.println("> Alamat\t\t: " + alamat[i]);
                        System.out.println("> Jabatan\t\t: " + jabatanpeg[i]);
                        System.out.println("> Status\t\t: " + status[i]);
                        System.out.println("--------------------------------------------------");
                        kel1 = 0.1 * gajipokok1[i];
                        total1 = gajipokok1[i] + kel1 + transport1 + kebugaran1;
                        System.out.println("-> " + gajipokok + "" + formatnomor.format(gajipokok1[i]));
                        System.out.println("-> " + tunjangantrans + "" + formatnomor.format(transport1));
                        System.out.println("-> " + tunjangankeb + "" + formatnomor.format(kebugaran1));
                        System.out.println("-> " + tunjangankel + "" + formatnomor.format(kel1));
                        System.out.println("-----------------------------------------------  +");
                        System.out.println("-> " + gajikotor + "" + formatnomor.format(total1));
                        if (total1 >= 15000000) {
                            double pphtotal1 = 0.025 * gajipokok1[i];
                            double bersih1 = total1 - pphtotal1;
                            double bersih11 = (total1 - pphtotal1) * 12;
                            System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                            System.out.println("-----------------------------------------------  -");
                            System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                            System.out.println("--------------------------------------------------");
                            System.out.println("-> Perhitungannya adalah " + formatnomor.format(bersih1) + " * 12");
                            System.out.println("-> " + gajibersihtahun + "" + formatnomor.format(bersih11));
                            System.out.println("**************************************************");
                        } else {
                            double pphtotal1 = total1 * 0;
                            double bersih1 = total1 - pphtotal1;
                            double bersih11 = (total1 - pphtotal1) * 12;
                            System.out.println("-> " + pajak + "" + formatnomor.format(pphtotal1));
                            System.out.println("-----------------------------------------------  -");
                            System.out.println("-> " + gajibersih + "" + formatnomor.format(bersih1));
                            System.out.println("--------------------------------------------------");
                            System.out.println("-> Perhitungannya adalah " + formatnomor.format(bersih1) + " * 12");
                            System.out.println("-> " + gajibersihtahun + "" + formatnomor.format(bersih11));
                            System.out.println("**************************************************");
                        }

                    }
                    check1 = 1;
                    break;
                }

            }
            if (check1 == 0) {
                System.out.println("-Mohon Maaf NIP Tidak di Temukan-");

            }
            System.out.println("==================================================");
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
        System.out.println("y = menu utama, t = logout");
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
