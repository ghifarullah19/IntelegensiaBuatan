package id.ac.unpas.ib.latihan.heuristik.greedybfs;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class GreedyBestFirstSearch {

    // fungsi untuk mencari solusi dari start ke goal
    public void search(NodeUCS start, NodeUCS goal) {
        // queue untuk menyimpan node yang akan dievaluasi
        Queue<Solusi> queue = new LinkedBlockingQueue<>();
        // solusiStart untuk menyimpan start node dengan tipe data bentukan Solusi
        Solusi solusiStart = new Solusi();
        // node start dimasukan ke solusiStart
        solusiStart.setNode(start);
        // solusiStart dimasukan ke dalam queue
        queue.add(solusiStart);
        // Pesan untuk menampilkan "Mencari solusi dari start ke goal"
        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());

        // Iterasi selama queue tidak kosong
        while (!queue.isEmpty()) {
            // eval untuk menyimpan node yang akan dievaluasi
            Solusi eval = queue.poll();
            // Pesan evaluasi masing-masing node
            System.out.println("Evaluasi: " + eval.getNode().getNilai());

            // Pengkondisian jika eval bernilai tujuan/goal, maka semua node tetangga dari
            // eval yang mengacu ke goal ditampilkan lalu iterasi berakhir
            if (eval.getNode().equals(goal)) {
                // Pesan solusi ditemukan
                System.out.println("Solusi ditemukan: ");

                // Iterasi seluruh node yang mengacu ke goal
                for (NodeUCS node : eval.getNodes()) {
                    // Pesan nilai dari masing-masing node
                    System.out.print(node.getNilai() + " -> ");
                }

                // Pesan nilai dari goal
                System.out.println(eval.getNode().getNilai());
                // Iterasi dihentikan
                break;
            } else {
                // Pesan menampilkan suksesor dari eval
                System.out.println("Suksesor " + eval.getNode().getNilai());
                // solusiSuksesor untuk menyimpan semua nilai suksesor dari eval
                Solusi solusiSuksesor = new Solusi();

                // best untuk menyimpan node terbaik dari eval
                NodeUCS best = null;
                // min untuk menyimpan nilai cost terkecil dari eval
                int min = Integer.MAX_VALUE;
                // depth untuk menyimpan kedalaman dari eval
                int depth = 0;

                // Iterasi seluruh node tetangga dari eval
                for (NodeUCS node : eval.getNode().getTetangga()) {
                    // Pengkondisian jika depth kurang dari 5
                    if (depth < 5) {
                        // Pesan nilai dari masing-masing node tetangga
                        System.out.print(node.getNilai() + " (" + node.getCost() + "), ");

                        // Jika cost dari node tetangga lebih kecil dari min
                        if (min > node.getCost()) {
                            // maka min diisi dengan cost dari node tetangga
                            min = node.getCost();
                            // best diisi dengan node tetangga
                            best = node;
                        }

                    } else {
                        // depth lebih dari 5, maka iterasi dihentikan
                        return;
                    }

                    // nilai depth ditambah 1
                    depth++;
                }

                // successor untuk menyimpan node terpilih
                NodeUCS successor = best;
                // solusiSuksesor menyimpan node terpilih
                solusiSuksesor.setNode(successor);
                // solusiSuksesor menyimpan semua node tetangga dari eval
                solusiSuksesor.setNodes(eval.getNodes());
                // solusiSuksesor menyimpan node eval ke dalam tetangga
                solusiSuksesor.getNodes().add(eval.getNode());

                // Pesan menampilkan enter (\n)
                System.out.println();
                // Pesan menampilkan node terpilih dan costnya
                System.out.println("Node terpilih: " + best.getNilai() + " (" + min + ")");
                // solusiSuksesor dimasukan ke dalam queue
                queue.offer(solusiSuksesor);
                System.out.println();
            }
        }

    }
}
