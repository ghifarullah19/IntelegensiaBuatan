package id.ac.unpas.ib.latihan.searching;

public class DepthLimitedSearch {
    // Atribut limit
    private int limit;

    // Method untuk mengatur limit
    public void setLimit(int limit) {
        this.limit = limit;
    }

    // Method untuk mengambil limit
    public int getLimit() {
        return limit;
    }

    public void search(Node start, Node goal) {
        // Pesan mencari solusi dari start ke goal
        System.out.println("Mencari solusi dari " + start.getNilai() + " ke " + goal.getNilai());

        // Memberi eval menjadi start
        Node eval = start;

        // Iterasi eval sebanyak limit yang telah ditentukan
        for (int i = 0; i < limit; i++) {
            // Pesan Level
            System.out.println("Level " + i + " evaluasi: " + eval.getNilai());
            // Jika eval itu sama dengan goal,
            if (eval.equals(goal)) {
                // Pesan ditemukan ditampilkan
                System.out.println("Solusi ditemukan ");
                break;
            }
            // Jika tidak, maka akan diperiksa tetangga dari eval
            if (!eval.getTetangga().isEmpty()) {
                // Jika eval memiliki hubungan yang masuk ke kota tetangganya,
                if (eval.getHubungan(eval.getTetangga().get(0))) {
                    // maka eval diberikan nilai tetangga tersebut
                    eval = eval.getTetangga().get(0);
                } else {
                    // Jika tidak, maka tetangga dari eval akan diiterasi terus hingga ditemukan
                    // tetangga yang memiliki jalur masuk dari eval.
                    int j = 1;
                    while (eval.getHubungan(eval.getTetangga().get(j)) != true) {
                        j++;
                    }
                    // eval diberikan nilai tetangga tersebut
                    eval = eval.getTetangga().get(j);
                }
            } else {
                // Jika solusi tidak ditemukan, maka iterasi dihentikan.
                break;
            }
        }
    }
}
