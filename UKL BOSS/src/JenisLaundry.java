
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rayz
 */
public class JenisLaundry {
    private final ArrayList<String> jenisLaundry;
    private final ArrayList<Integer> harga;
    private final ArrayList<Integer> durasi;
    
    public JenisLaundry(){
        durasi = new ArrayList<>();
        harga = new ArrayList<>();
        jenisLaundry = new ArrayList<>();
        
        this.initListjenisLaundry();
    }
    
    public void initListjenisLaundry(){
        this.jenisLaundry.add("Paket Normal");
        this.durasi.add(4);
        this.harga.add(10000);
        
        this.jenisLaundry.add("Paket Kilat");
        this.durasi.add(2);
        this.harga.add(25000);
    }
    
    public void printListJenisLaundry() {
        System.out.println("Berikut Paket Laundry yang tersedia: ");
        for (int i = 0; i < this.jenisLaundry.size(); i++) {
            String msg = i + ". ";
            msg += this.durasi.get(i) + " jam | ";
            msg += this.jenisLaundry.get(i) + " | ";
            msg += "Rp. " + this.harga.get(i);
            System.out.println(msg);
        }
        System.out.println("");
    }
    public String getJenisLaundry(int id) {
        return this.jenisLaundry.get(id);
    }
    public int getHargaPaket(int id){
        return this.harga.get(id);
    }
}
