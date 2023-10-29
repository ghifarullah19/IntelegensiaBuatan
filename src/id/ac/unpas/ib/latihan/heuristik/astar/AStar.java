package id.ac.unpas.ib.latihan.heuristik.astar;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class AStar {

    public void search(NodeUCS start, NodeUCS goal) {
        // queue untuk menyimpan node yang akan dievaluasi
        Queue<Solusi> queue = new LinkedBlockingQueue<>();

        // solusiStart untuk menyimpan start node dengan tipe data bentukan Solusi
        Solusi solusiStart = new Solusi();
        // node start dimasukan ke solusiStart
        solusiStart.setNode(start);

        // solusiStart dimasukan ke dalam queue
        queue.add(solusiStart);

        // costAll untuk menghitung total biaya jalur yang ditempuh
        int costAll = 0;

        // Pesan untuk menampilkan "Mencari solusi dari Arad ke Bucharest"
        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());

        // Iterasi selama queue tidak kosong
        while (!queue.isEmpty()) {
            // eval untuk menyimpan node yang akan dievaluasi
            Solusi eval = queue.poll();

            // Pesan evaluasi masing-masing node
            System.out.println("Evaluasi: " + eval.getNode().getNilai());

            // Pengkondisian jika eval bernilai tujuan/goal, maka semua node tetangga dari
            // eval
            // yang mengacu ke goal ditampilkan lalu iterasi berakhir
            if (eval.getNode().equals(goal)) {
                // Pesan solusi ditemukan
                System.out.println("Solusi ditemukan: ");

                // Iterasi seluruh node yang mengacu ke goal
                for (NodeUCS node : eval.getNodes()) {
                    // Pesan nilai dari masing-masing node
                    System.out.print(node.getNilai() + " -> ");
                }

                // Pesan nilai dari goal
                System.out.print(eval.getNode().getNilai());

                // Iterasi dihentikan
                break;
            }
            // Pengkondisian jika eval belum bernilai goal, maka
            else {
                // Pesan menampilkan suksesor dari eval
                System.out.println("Suksesor " + eval.getNode().getNilai() + ": ");

                // solusiSuksesor untuk menyimpan semua nilai suksesor dari eval
                Solusi solusiSuksesor = new Solusi();
                // beri nilai true pada eval yang telah dijumpai
                eval.getNode().isVisited = true;

                // inisiasi node best
                NodeUCS best = null;
                // inisiasi min dengan nilai integer yang paling besar
                int min = Integer.MAX_VALUE;
                // inisiasi cost dengan 0, cost untuk menyimpan index jalur terpendek antar node
                int cost = 0;
                // inisiasi i dengan 0, i untuk variabel yang mengukur jumlah iterasi pada
                // iterasi cost
                // dari node tetangga
                int i = 0;

                // iterasi tetangga dari eval
                for (NodeUCS node : eval.getNode().getTetangga()) {
                    // costTetangga untuk menyimpan nilai jarak antar node tetangga
                    int costTetangga = eval.getNode().getTetanggaCost().get(i);

                    // jika i kurang dari banyaknya elemen cost tetangga dari node,
                    // maka akan dilakukan pengecekan apakah node itu telah dilalui
                    // dan apakah jarak dari node itu ke goal ditambah jarak antar nodenya
                    // kurang dari nilai min
                    if (eval.getNode().getTetanggaCost().size() > i) {
                        // apakahMin untuk menyimpan nilai dari jarak node ke goal ditambah
                        // jarak node ke tetangganya dan jarak node dari start
                        int apakahMin = node.getCost() + costTetangga + costAll;

                        // Pesan
                        System.out.print(node.getNilai() + " (" + node.getCost() + " + " +
                                costTetangga + " + " + costAll + "), = " + apakahMin + "\n");

                        // jika node tersebut telah dilalui, tampilkan pesan
                        if (node.isVisited == true) {
                            // Pesan
                            System.out.println(node.getNilai() + " sudah dikunjungi.\n");
                        }

                        // jika nilai min kurang dari nilai apakahMin dan node itu belum dilalui,
                        // maka min diberikan nilai apakahMin, best diberikan nilai node, dan
                        // cost diberikan nilai i. lalu node tersebut diberi tanda bahwa telah dilalui
                        if (min > apakahMin && node.isVisited == false) {
                            // min diberikan nilai apakahMin
                            min = apakahMin;
                            // best diberikan nilai node
                            best = node;
                            // cost diberikan nilai i
                            cost = i;
                            // node diatur nilai isVisitednya menjadi true
                            node.isVisited = true;
                        }

                    }
                    // jika i lebih dari banyaknya jumlah elemen cost tetangga, maka iterasi
                    // dihentikan
                    else {
                        return;
                    }
                    // i diupdate nilainya sebanyak 1
                    i++;
                }

                // suksesor untuk menyimpan node best
                NodeUCS successor = best;
                // sukssesor tersebut dimasukan ke solusiSuksesor
                solusiSuksesor.setNode(successor);
                // tetangga dari node eval menjadi tetangga dari node successor
                solusiSuksesor.setNodes(eval.getNodes());
                // node eval dimasukan ke tetangga node suksesor
                solusiSuksesor.getNodes().add(eval.getNode());

                // Menambahkan enter (\n)
                System.out.println();
                // Pesan node terpilih dengan nilai jarak dari node ke goal ditambah jarak antar
                // node
                System.out.println("Node terpilih: " + best.getNilai() + " (" + min + ")");

                // costAll diupadate nilainya dengan nilai jarak antar node yang terpilih
                costAll += eval.getNode().getTetanggaCost().get(cost);

                // solusiSuksesor dimasukan ke queue
                queue.offer(solusiSuksesor);
                System.out.println();
            }
        }
    }
}
