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
        // solusiSuksesor dibuat untuk menyimpan semua nilai suksesor (node terpilih) dari eval (node yang sedang diuji)
        Solusi solusiSuksesor = new Solusi();

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
                // solusiSuksesor diberikan nilai node eval ke dalam list tetangga dari solusiSuksesor
                solusiSuksesor.getNodes().add(eval.getNode());

                // Iterasi seluruh node yang mengacu ke goal
                for (int i = 0; i < solusiSuksesor.getNodes().size(); i++) {
                    // Pesan nilai dari masing-masing node
                    if (i < solusiSuksesor.getNodes().size() - 1) {
                        System.out.print(solusiSuksesor.getNodes().get(i).getNilai() + " -> ");
                    } else {
                        System.out.print(solusiSuksesor.getNodes().get(i).getNilai());
                    }
                }

                // Iterasi dihentikan
                break;
            } else {
                // Pesan menampilkan suksesor dari eval
                System.out.println("Suksesor " + eval.getNode().getNilai());
                // solusiSuksesor dibuat untuk menyimpan semua nilai suksesor (node terpilih) dari eval (node yang sedang diuji)
                solusiSuksesor = new Solusi();

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
                // solusiSuksesor diberikan nilai node terpilih
                solusiSuksesor.setNode(successor);
                // solusiSuksesor diberikan nilai semua node tetangga dari node terpilih tersebut
                solusiSuksesor.setNodes(eval.getNodes());
                // solusiSuksesor diberikan nilai node eval ke dalam list tetangga dari solusiSuksesor
                solusiSuksesor.getNodes().add(eval.getNode());

                this.tampilSolusi(solusiSuksesor);
                
                // Pesan menampilkan enter (\n)
                System.out.println();
                
                // Pesan menampilkan node terpilih dan costnya
                System.out.println("Node terpilih: " + best.getNilai() + " (" + min + ")");
                
                // queue diupdate nilainya menjadi solusiSuksesor
                queue.offer(solusiSuksesor);
                System.out.println();
            }
        }
    }
    
    public void tampilSolusi(Solusi solusiSuksesor) {
        System.out.println("\n\n===Printing solusiSuksesor: ");
        for (int i = 0; i < solusiSuksesor.getNodes().size(); i++) {
            // Pesan nilai dari masing-masing node
            if (i < solusiSuksesor.getNodes().size() - 1) {
                System.out.print(solusiSuksesor.getNodes().get(i).getNilai() + " -> ");
            } else {
                System.out.print(solusiSuksesor.getNodes().get(i).getNilai());
            }
        }
        System.out.println("\n===Done");
    }
}
