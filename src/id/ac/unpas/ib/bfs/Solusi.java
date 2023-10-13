package id.ac.unpas.ib.bfs;

import id.ac.unpas.ib.Node;

import java.util.ArrayList;
import java.util.List;

public class Solusi {
    private List<Node> nodes;
    private Node node;

    public Solusi() {
        nodes = new ArrayList<>();
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node getNode() {
        return node;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = new ArrayList<>(nodes);
    }

    public List<Node> getNodes() {
        return nodes;
    }
}
