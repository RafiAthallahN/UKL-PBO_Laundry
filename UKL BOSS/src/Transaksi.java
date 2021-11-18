
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rayz
 */
public class Transaksi {
    private final ArrayList<Integer> idClient;
    private final ArrayList<Integer> idJenisLaundry;
    private final ArrayList<Integer> banyak;
    
    public Transaksi(){
        banyak = new ArrayList<>();
        idJenisLaundry = new ArrayList<>();
        idClient = new ArrayList<>();
    }
    
    public void printPaketTerpilih(int idClient) {
        System.out.println("Berikut adalah paket yang dipilih Client id " + idClient);
        this.idClient.stream()
            .filter(id -> (id == idClient))
            .map(id -> this.idClient.indexOf(id))
            .forEach(index -> {
                String msg = index + ". ";
                msg += "Jenis Laundry id-" + this.idJenisLaundry.get(index) + " | ";
                msg += this.banyak.get(index) + " Kg";
                System.out.println(msg);
            });
        System.out.println("");
    }
    

    public void tambahLaundry(int idClient, int idJenisLaundry, int banyak) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyak);
    }

    public Integer getIdJenisLaundry(int idClient) {
        int index = this.idClient.indexOf(idClient);
        return this.idJenisLaundry.get(index);
    }

    public Integer getBanyak(int idClient) {
        int index = this.idClient.indexOf(idClient);
        return this.banyak.get(index);
    }

    public Integer getIdClient(int idClient) {
        int index = this.idClient.indexOf(idClient);
        return this.idClient.get(index);
    }


}
