package latihan;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nilai;
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
        Hubungan hubungan = new Hubungan(this, node, jenisHub);
        this.hubungan.add(hubungan);
        // this.isKeluar = isKeluar;
    }

    public boolean getHubungan(Node dua) {
        boolean hub = false;
        for (Hubungan h : this.hubungan) {
            if (h.satu.equals(this) && h.dua.equals(dua)) {
                hub = h.getHubungan();
            }
        }
        return hub;
    }

    // public void tampilHubungan(Node dua) {
    // this.hubungan.tampil(this, dua);
    // }

    // public void setKeluar(boolean isKeluar) {
    // this.isKeluar = isKeluar;
    // }

    // public boolean getKeluar() {
    // return this.isKeluar;
    // }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return ((Node) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}
