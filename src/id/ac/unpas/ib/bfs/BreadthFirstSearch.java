package id.ac.unpas.ib.bfs;

import id.ac.unpas.ib.Node;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstSearch {

    public void search(Node start, Node goal) {
        Queue<Solusi> queue = new LinkedBlockingQueue<>();
        Solusi solusiStart = new Solusi();
        solusiStart.setNode(start);
        queue.add(solusiStart);
        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());

        while (!queue.isEmpty()) {
            Solusi eval = queue.poll();
            System.out.println("Evaluasi: " + eval.getNode().getNilai());

            if (eval.getNode().equals(goal)) {
                System.out.println("Solusi ditemukan: ");
                for (Node node : eval.getNodes()) {
                    System.out.print(node.getNilai() + " -> ");
                }
                System.out.println(eval.getNode().getNilai());
                break;
            } else {
                System.out.println("Suksesor " + eval.getNode().getNilai());
                for (Node successor : eval.getNode().getTetangga()) {
                    System.out.print(successor.getNilai() + " ");
                    Solusi solusiSuksesor = new Solusi();
                    solusiSuksesor.setNode(successor);
                    solusiSuksesor.setNodes(eval.getNodes());
                    solusiSuksesor.getNodes().add(eval.getNode());

                    queue.offer(solusiSuksesor);
                }
                System.out.println();
                System.out.println();
            }
        }

    }
}
