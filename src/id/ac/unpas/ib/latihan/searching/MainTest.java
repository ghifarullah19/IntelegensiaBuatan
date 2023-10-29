package id.ac.unpas.ib.latihan.searching;

public class MainTest {
    public static void main(String[] args) {
        // Membuat Node kota yang diperlukan
        Node arad = new Node("Arad");
        Node bucharest = new Node("Bucharest");
        Node craiova = new Node("Craiova");
        Node dobreta = new Node("Dobreta");
        Node fagaras = new Node("Fagaras");
        Node lugoj = new Node("Lugoj");
        Node mehadia = new Node("Mehadia");
        Node oradea = new Node("Oradea");
        Node pitesti = new Node("Pitesti");
        Node rimnicuVilcea = new Node("Rimnicu Vilcea");
        Node sibiu = new Node("Sibiu");
        Node timisoara = new Node("Timisoara");
        Node zerind = new Node("Zerind");

        // Menambah tetangga ke tiap-tiap kota
        // Contoh
        // arad.addTetangga(zerind, false) artinya dari arad tidak ada jalur masuk ke
        // zerind
        arad.addTetangga(zerind, false);
        arad.addTetangga(sibiu, false);
        arad.addTetangga(timisoara, true);

        bucharest.addTetangga(fagaras, true);
        bucharest.addTetangga(pitesti, false);

        craiova.addTetangga(dobreta, false);
        craiova.addTetangga(rimnicuVilcea, true);
        craiova.addTetangga(pitesti, true);

        dobreta.addTetangga(mehadia, false);
        dobreta.addTetangga(craiova, true);

        fagaras.addTetangga(sibiu, true);
        fagaras.addTetangga(bucharest, false);

        lugoj.addTetangga(timisoara, false);
        lugoj.addTetangga(mehadia, true);

        mehadia.addTetangga(lugoj, false);
        mehadia.addTetangga(dobreta, true);

        oradea.addTetangga(zerind, true);
        oradea.addTetangga(sibiu, false);

        pitesti.addTetangga(rimnicuVilcea, false);
        pitesti.addTetangga(craiova, false);
        pitesti.addTetangga(bucharest, true);

        rimnicuVilcea.addTetangga(sibiu, false);
        rimnicuVilcea.addTetangga(craiova, false);
        rimnicuVilcea.addTetangga(pitesti, true);

        sibiu.addTetangga(arad, false);
        sibiu.addTetangga(oradea, true);
        sibiu.addTetangga(fagaras, false);
        sibiu.addTetangga(rimnicuVilcea, false);

        timisoara.addTetangga(arad, false);
        timisoara.addTetangga(lugoj, true);

        zerind.addTetangga(arad, true);
        zerind.addTetangga(oradea, false);

        // Instansiasi DLS
        System.out.println("Depth Limited Search");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        // Mengatur limit depth sebanyak 10
        dls.setLimit(10);
        // Cari jalur dari arad ke bucharest
        dls.search(arad, bucharest);

        System.out.println();

        // Mengatur limit depth sebanyak 10
        dls.setLimit(10);
        // Cari jalur dari bucharest ke arad
        dls.search(bucharest, arad);
    }
}
