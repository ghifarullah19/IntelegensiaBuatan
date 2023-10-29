package id.ac.unpas.ib.latihan.heuristik.greedybfs;

import java.util.ArrayList;
import java.util.List;

// Node untuk menyimpan nilai node dan tetangga beserta costnya.
public class Node {
    // nilai untuk menyimpan nama node
    private String nilai;
    // tetangga untuk menyimpan node tetangga dari node yang bersangkutan
    private List<Node> tetangga;

    // Constructor untuk menginisialisasi nilai dari node
    public Node(String nilai) {
        // inisialisasi tetangga
        tetangga = new ArrayList<>();
        // nilai diambil dari parameter
        this.nilai = nilai;
    }

    // fungsi untuk mengubah nilai dari node
    public void setNilai(String nilai) {
        // mengubah nilai dari parameter
        this.nilai = nilai;
    }

    // fungsi untuk mengembalikan nilai dari node
    public String getNilai() {
        // mengembalikan nilai dari node
        return nilai;
    }

    // fungsi untuk mengubah tetangga dari node
    public void setTetangga(List<Node> tetangga) {
        // mengubah tetangga dari parameter
        this.tetangga = tetangga;
    }

    // fungsi untuk mengembalikan tetangga dari node
    public List<Node> getTetangga() {
        // mengembalikan tetangga dari node
        return tetangga;
    }

    // fungsi untuk menambahkan tetangga dari node
    public void addTetangga(Node node) {
        // menambahkan tetangga dari parameter
        tetangga.add(node);
    }

    // fungsi untuk mengecek apakah node sama atau tidak
    @Override
    public boolean equals(Object obj) {
        // jika objek sama dengan node
        if (obj instanceof Node) {
            // mengembalikan nilai apakah nilai dari objek sama dengan nilai dari node
            return ((Node) obj).nilai.equals(this.nilai);
        }
        // mengembalikan nilai false
        return false;
    }
}
