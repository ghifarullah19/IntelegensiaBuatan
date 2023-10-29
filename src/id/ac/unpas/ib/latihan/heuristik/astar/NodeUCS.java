package id.ac.unpas.ib.latihan.heuristik.astar;

import java.util.ArrayList;
import java.util.List;

// NodeUCS untuk menyimpan nilai node, cost, nilai apakah node sudah dikunjungi, dan tetangga beserta costnya.
public class NodeUCS {
    // nilai untuk menyimpan nama node
    private String nilai;
    // cost untuk menyimpan biaya dari node
    private int cost;
    // isVisited untuk menyimpan nilai apakah node sudah dikunjungi atau belum
    public boolean isVisited;

    // tetangga untuk menyimpan node tetangga dari node yang bersangkutan
    private List<NodeUCS> tetangga;
    // tetanggaCost untuk menyimpan cost dari node tetangga
    private List<Integer> tetanggaCost;

    // Constructor untuk menginisialisasi nilai dan cost dari node
    public NodeUCS(Node node, int cost) {
        // nilai diambil dari node yang bersangkutan
        this.nilai = node.getNilai();
        // cost diambil dari parameter cost
        this.cost = cost;

        // inisialisasi tetangga dan tetanggaCost
        tetangga = new ArrayList<>();
        tetanggaCost = new ArrayList<>();
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

    // fungsi untuk mengubah tetangga dan tetanggaCost dari node
    public void setTetangga(List<NodeUCS> tetangga, List<Integer> tetanggaCost) {
        // mengubah tetangga dari parameter
        this.tetangga = tetangga;
        // mengubah tetanggaCost dari parameter
        this.tetanggaCost = tetanggaCost;
    }

    // fungsi untuk mengembalikan tetangga dari node
    public List<NodeUCS> getTetangga() {
        // mengembalikan tetangga dari node
        return tetangga;
    }

    // fungsi untuk mengembalikan tetanggaCost dari node
    public List<Integer> getTetanggaCost() {
        // mengembalikan tetanggaCost dari node
        return tetanggaCost;
    }

    // fungsi untuk menambahkan tetangga dan tetanggaCost dari node
    public void addTetangga(NodeUCS node, int cost) {
        // menambahkan tetangga dari parameter
        tetangga.add(node);
        // menambahkan tetanggaCost dari parameter
        tetanggaCost.add(cost);
    }

    // fungsi untuk mengecek apakah node tersebut sama atau tidak
    @Override
    public boolean equals(Object obj) {
        // jika objek merupakan instance dari NodeUCS
        if (obj instanceof NodeUCS) {
            // maka akan dilakukan pengecekan apakah nilai dari node tersebut sama atau
            // tidak
            return ((NodeUCS) obj).nilai.equals(this.nilai);
        }
        // jika bukan, maka akan mengembalikan nilai false
        return false;
    }
}
