package id.ac.unpas.ib.latihan.heuristik.greedybfs;

import java.util.ArrayList;
import java.util.List;

// NodeUCS untuk menyimpan nilai node, cost, dan tetangga beserta costnya.
public class NodeUCS {
    // nilai untuk menyimpan nama node
    private String nilai;
    // cost untuk menyimpan biaya dari node
    private int cost;
    // tetangga untuk menyimpan node tetangga dari node yang bersangkutan
    private List<NodeUCS> tetangga;

    // Constructor untuk menginisialisasi nilai dan cost dari node
    public NodeUCS(Node node, int cost) {
        // nilai diambil dari node yang bersangkutan
        this.nilai = node.getNilai();
        // cost diambil dari parameter cost
        this.cost = cost;
        // inisialisasi tetangga
        tetangga = new ArrayList<>();
    }

    // fungsi untuk mengembalikan nama node
    public String getNilai() {
        // mengembalikan nama node
        return nilai;
    }

    // fungsi untuk mengubah nama node
    public void setNilai(String nilai) {
        // mengubah nama node dari parameter
        this.nilai = nilai;
    }

    // fungsi untuk mengubah nilai biaya dari node
    public void setCost(int cost) {
        // mengubah nilai biaya dari parameter
        this.cost = cost;
    }

    // fungsi untuk mengembalikan nilai biaya dari node
    public int getCost() {
        // mengembalikan nilai biaya dari node
        return cost;
    }

    // fungsi untuk mengubah tetangga dari node
    public void setTetangga(List<NodeUCS> tetangga) {
        // mengubah tetangga dari parameter
        this.tetangga = tetangga;
    }

    // fungsi untuk mengembalikan tetangga dari node
    public List<NodeUCS> getTetangga() {
        // mengembalikan tetangga dari node
        return tetangga;
    }

    // fungsi untuk menambahkan tetangga dari node
    public void addTetangga(NodeUCS node) {
        // menambahkan tetangga dari parameter
        tetangga.add(node);
    }

    // fungsi untuk mengecek apakah node sama atau tidak
    @Override
    public boolean equals(Object obj) {
        // jika objek sama dengan node
        if (obj instanceof NodeUCS) {
            // mengembalikan nilai apakah nilai dari objek sama dengan nilai dari node
            return ((NodeUCS) obj).nilai.equals(this.nilai);
        }
        // mengembalikan nilai false
        return false;
    }
}
