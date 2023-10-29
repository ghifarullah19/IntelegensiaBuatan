package id.ac.unpas.ib.latihan.searching;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nilai;
    // List hubungan untuk menampung hubungan yang dimiliki oleh suatu kota (bisa
    // lebih dari 1)
    private List<Hubungan> hubungan = new ArrayList<>();
    private List<Node> tetangga;

    public Node(String nilai) {
        tetangga = new ArrayList<>();
        this.nilai = nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getNilai() {
        return nilai;
    }

    public void setTetangga(List<Node> tetangga) {
        this.tetangga = tetangga;
    }

    public List<Node> getTetangga() {
        return tetangga;
    }

    public void addTetangga(Node node, boolean jenisHub) {
        tetangga.add(node);
        // hubungan dibuat dari parameter jenisHub
        Hubungan hubungan = new Hubungan(this, node, jenisHub);
        // Menambah hubungan yang telah dibuat ke list hubungan
        this.hubungan.add(hubungan);
    }

    // Mendapatkan hubungan
    public boolean getHubungan(Node dua) {
        // Inisialisasi nilai hubungan
        boolean hub = false;
        // Iterasi list hubungan
        for (Hubungan h : this.hubungan) {
            // Jika ditemukan hubungan antara kota satu dan kota dua
            if (h.satu.equals(this) && h.dua.equals(dua)) {
                // Nilai hubungan diberikan dari list yang telah ditemukan
                hub = h.getHubungan();
            }
        }
        // Kembalikan hubungan
        return hub;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return ((Node) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}
