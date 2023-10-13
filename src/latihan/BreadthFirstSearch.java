package latihan;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstSearch {

    public void search(Node start, Node goal) {
        Queue<Solusi> queue = new LinkedBlockingQueue<>();
        Solusi solusiStart = new Solusi();
        List<Node> track = new ArrayList<>();
        solusiStart.setNode(start);
        track.add(start);
        queue.add(solusiStart);
        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());

        while (!queue.isEmpty()) {
            Solusi eval = queue.poll();
            System.out.println("Evaluasi: " + eval.getNode().getNilai());

            if (eval.getNode().equals(goal)) {
                System.out.println("Solusi ditemukan: ");
                // for (Node node : eval.getNodes()) {
                // System.out.print(node.getNilai() + " -> ");
                // }
                // System.out.println(eval.getNode().getNilai());
                // break;
                for (Node t : track) {
                    System.out.println(t.getNilai());
                }
                break;
            } else {
                // System.out.println("Suksesor " + eval.getNode().getNilai());
                for (Node successor : eval.getNode().getTetangga()) {
                    // if (eval.getNode().getHubungan(successor)) {
                    // eval.getNode().tampilHubungan(successor);
                    // }
                    // System.out.print(successor.getNilai() + " ");
                    eval.getNode().getHubungan(successor);
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
        // searchUlang(goal, start);
    }

    public void searchUlang(Node start, Node goal) {
        Queue<Solusi> queue = new LinkedBlockingQueue<>();
        Solusi solusiStart = new Solusi();
        List<Node> track = new ArrayList<>();
        solusiStart.setNode(start);
        track.add(start);
        queue.add(solusiStart);
        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());

        while (!queue.isEmpty()) {
            Solusi eval = queue.poll();
            System.out.println("Evaluasi: " + eval.getNode().getNilai());

            if (eval.getNode().equals(goal)) {
                System.out.println("Solusi ditemukan: ");
                // for (Node node : eval.getNodes()) {
                // System.out.print(node.getNilai() + " -> ");
                // }
                // System.out.println(eval.getNode().getNilai());
                for (Node t : track) {
                    System.out.println(t.getNilai());
                }
                break;
            } else {
                System.out.println("Suksesor " + eval.getNode().getNilai());
                for (Node successor : eval.getNode().getTetangga()) {
                    System.out.print(successor.getNilai() + " ");
                    Solusi solusiSuksesor = new Solusi();
                    // if (successor.getKeluar() == true) {
                    // if (track.contains(successor)) {
                    // System.out.println(successor.getNilai());
                    // } else {
                    // track.add(successor);
                    // }
                    // }
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
