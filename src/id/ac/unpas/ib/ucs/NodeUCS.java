package id.ac.unpas.ib.ucs;

import id.ac.unpas.ib.Node;

import java.util.ArrayList;
import java.util.List;

public class NodeUCS {
    private String nilai;
    private int cost;

    private List<NodeUCS> tetangga;

    public NodeUCS(Node node, int cost) {
        this.nilai = node.getNilai();
        this.cost = cost;
        tetangga = new ArrayList<>();
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setTetangga(List<NodeUCS> tetangga) {
        this.tetangga = tetangga;
    }

    public List<NodeUCS> getTetangga() {
        return tetangga;
    }

    public void addTetangga(NodeUCS node) {
        tetangga.add(node);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodeUCS) {
            return ((NodeUCS) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}
