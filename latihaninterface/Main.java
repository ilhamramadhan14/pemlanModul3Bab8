package latihaninterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("\n=== MENU ===");
            System.out.println("1. Manusia");
            System.out.println("2. Hewan");
            System.out.println("3. Ikan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan umur: ");
                    int umur = input.nextInt();

                    Manusia m = new Manusia(nama, umur);
                    System.out.println("\n=== Data Manusia ===");
                    m.tampilkanNama();
                    m.tampilkanUmur();
                    m.makan();
                    m.berjalan();
                    m.bersuara();
                    break;

                case 2:
                    System.out.print("Masukkan nama: ");
                    String namaHewan = input.nextLine();

                    System.out.print("Masukkan umur: ");
                    int umurHewan = input.nextInt();

                    Hewan h = new Hewan(namaHewan, umurHewan);
                    System.out.println("\n=== Data Hewan ===");
                    h.tampilkanNama();
                    h.tampilkanUmur();
                    h.makan();
                    h.berjalan();
                    h.bersuara();
                    break;

                case 3:
                    System.out.print("Masukkan nama: ");
                    String namaIkan = input.nextLine();

                    System.out.print("Masukkan umur: ");
                    int umurIkan = input.nextInt();

                    Ikan i = new Ikan(namaIkan, umurIkan);
                    System.out.println("\n=== Data Hewan ===");
                    i.tampilkanNama();
                    i.tampilkanUmur();
                    i.makan();
                    i.berjalan();
                    i.bersuara();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 0);
        input.close();
    }
}