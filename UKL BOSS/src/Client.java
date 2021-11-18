
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rayz
 */
public class Client implements userInterface {

    private final ArrayList<String> nama;
    private final ArrayList<String> alamat;
    private final ArrayList<String> telepon;
    private final ArrayList<Integer> saldo;

    public Client() {
        saldo = new ArrayList<>();
        telepon = new ArrayList<>();
        alamat = new ArrayList<>();
        nama = new ArrayList<>();

        this.initListClient();
    }

    public void initListClient() {
        this.nama.add("Aldo");
        this.alamat.add("Malang");
        this.telepon.add("0355-0000-0000");
        this.saldo.add(50000);
    }
    
     public void printListClient() {
        System.out.println("Daftar Client:");
        for (int i = 0; i < this.nama.size(); i++) {
            String msg = i + ". ";
            msg += this.nama.get(i) + " | ";
            msg += this.alamat.get(i) + " | ";
            msg += this.telepon.get(i) + " | ";
            msg += this.saldo.get(i);
            System.out.println(msg);
        }
        System.out.println("");
    }

    public Integer getJumlahClient() {
        return this.nama.size();
    }

    public void updateStatus(int idClient, int saldo) {
        this.saldo.set(idClient, saldo);
    }

 @Override
    public void setNama(String nama) {
        this.nama.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    @Override
    public String getNama(int id) {
        return nama.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return telepon.get(id);
    }

    public int getSaldo(int id) {
        return saldo.get(id);
    }    

    public void pilihLaundry(int id,int harga) {
        int sisaSaldo = this.saldo.get(id);
        sisaSaldo -= harga;

        this.saldo.set(id, sisaSaldo);
    }
}
