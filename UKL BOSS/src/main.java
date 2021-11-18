
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rayz
 */
public class main {
    static Scanner input;

    static Petugas petugas;
    static Client client;
    static JenisLaundry jenisLaundry;
    static Transaksi transaksi;

    static Integer idClient;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI LAUNDRY");
        System.out.println("");

        petugas = new Petugas();
        client = new Client();
        jenisLaundry = new JenisLaundry();
        transaksi = new Transaksi();

        petugas.printListPetugas();
        client.printListClient();
        
        idClient = pilihClient();

        Boolean ulang = true;
        while (ulang) {
            Integer menu = pilihMenu();
            switch (menu) {
                case 1 ->
                    jenisLaundry.printListJenisLaundry();
                case 2 ->
                    prosesPilihPaket();
                case 99 ->
                    ulang = false;
                default -> {
                    System.out.println("Menu yang dipilih tidak tersedia");
                    System.out.println("");
                }
            }
        }

        input.close();
    }

    public static Integer pilihClient() {
        System.out.println("Silahkan masukkan id Client : ");
        int pilih = input.nextInt();
        if (pilih >= client.getJumlahClient()) {
            System.out.println("Client tidak ada");
            System.out.println("");
            System.exit(0);
        }
        return pilih;
    }

    public static Integer pilihMenu() {
        System.out.println("Selamat datang di Laundry");
        System.out.println("1. List Paket Laundry");
        System.out.println("2. Pilih Paket");
        System.out.println("99. Keluar");
        System.out.print("=> ");
        return input.nextInt();
    }
    

    public static void prosesPilihPaket() {
        System.out.println("Silahkan Masukkan Informasi Transaksi: ");
        System.out.println("Masukkan ID CLient : ");
        int idClient = input.nextInt(); 
        System.out.print("Masukkan id Paket: ");
        int idJenisLaundry = input.nextInt();
        System.out.print("Banyak Baju(Kg): ");
        int banyak = input.nextInt();   
        System.out.println("Berhasil melakukan Transaksi");
        System.out.println("");
        System.out.println("Id Client: " + idClient);
        System.out.println("Id Paket: " + idJenisLaundry);
        System.out.println("Banyak Baju(Kg): " + banyak);   
        System.out.println("Total biaya: " + jenisLaundry.getHargaPaket(idJenisLaundry));
        System.out.println("Sisa Saldo: " + (client.getSaldo(idClient)-jenisLaundry.getHargaPaket(idJenisLaundry)));
        System.out.println(" ");
        System.exit(0);
    }
}
   


   

