package id.ac.unpas.ib;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nilai;
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

    public void addTetangga(Node node) {
        tetangga.add(node);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return ((Node) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}
