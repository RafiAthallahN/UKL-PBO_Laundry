
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rayz
 */
public class Petugas implements userInterface {
    private final ArrayList<String> nama;
    private final ArrayList<String> alamat;
    private final ArrayList<String> telepon;
    private final ArrayList<Integer> jabatan;
    
    public Petugas(){
     jabatan = new ArrayList<>();
     telepon = new ArrayList<>();
     alamat = new ArrayList<>();
     nama = new ArrayList<>();
     
     this.initListPetugas();
    }
    
    public void initListPetugas(){
        this.nama.add("Budi");
        this.alamat.add("Malang");
        this.telepon.add("0355-0658-XXXX");
        this.jabatan.add(2);
    }

    public void printListPetugas() {
        System.out.println("Daftar petugas terdaftar:");
        for (int i = 0; i < this.nama.size(); i++) {
            String msg = i + ". ";
            msg += this.nama.get(i) + " | ";
            msg += this.alamat.get(i) + " | ";
            msg += this.telepon.get(i) + " | ";
            msg += this.jabatan.get(i);
            System.out.println(msg);
        }
        System.out.println("");
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

    public Integer getJabatan(int id) {
        return jabatan.get(id);
    }
}
