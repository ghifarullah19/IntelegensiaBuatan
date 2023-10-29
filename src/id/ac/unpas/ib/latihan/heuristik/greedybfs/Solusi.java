package id.ac.unpas.ib.latihan.heuristik.greedybfs;

import java.util.ArrayList;
import java.util.List;

// Solusi untuk menyimpan node-node yang menjadi solusi yang ditemukan
public class Solusi {
    // nodes untuk menyimpan tetangga dari node yang menjadi solusi
    private List<NodeUCS> nodes;
    // node untuk menyimpan node yang menjadi solusi
    private NodeUCS node;

    // Constructor untuk menginisialisasi nodes
    public Solusi() {
        // inisialisasi nodes
        nodes = new ArrayList<>();
    }

    // fungsi untuk mengubah node solusi
    public void setNode(NodeUCS node) {
        // mengubah node dari parameter
        this.node = node;
    }

    // fungsi untuk mengembalikan node
    public NodeUCS getNode() {
        // mengembalikan node
        return node;
    }

    // fungsi untuk mengubah node tetangga
    public void setNodes(List<NodeUCS> nodes) {
        // mengubah tetangga dari parameter
        this.nodes = new ArrayList<>(nodes);
    }

    // fungsi untuk mengembalikan tetangga
    public List<NodeUCS> getNodes() {
        // mengembalikan tetangga
        return nodes;
    }
}
