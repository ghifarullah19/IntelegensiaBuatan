package id.ac.unpas.ib.latihan.heuristik.greedybfs;

// Main program
public class MainTest {
    // fungsi main
    public static void main(String[] args) {
        // inisialisasi node-node yang ada
        Node arad = new Node("Arad");
        Node bucharest = new Node("Bucharest");
        Node craiova = new Node("Craiova");
        Node dobreta = new Node("Dobreta");
        Node eforie = new Node("Eforie");
        Node fagaras = new Node("Fagaras");
        Node giurgiu = new Node("Giurgiu");
        Node hirsova = new Node("Hirsova");
        Node iasi = new Node("Iasi");
        Node lugoj = new Node("Lugoj");
        Node mehadia = new Node("Mehadia");
        Node neamt = new Node("Neamt");
        Node oradea = new Node("Oradea");
        Node pitesti = new Node("Pitesti");
        Node rimnicuVilcea = new Node("Rimnicu Vilcea");
        Node sibiu = new Node("Sibiu");
        Node timisoara = new Node("Timisoara");
        Node urziceni = new Node("Urziceni");
        Node vaslui = new Node("Vaslui");
        Node zerind = new Node("Zerind");

        // inisialisasi node-node yang ada dengan costnya
        NodeUCS aradUCS = new NodeUCS(arad, 366);
        NodeUCS bucharestUCS = new NodeUCS(bucharest, 0);
        NodeUCS craiovaUCS = new NodeUCS(craiova, 160);
        NodeUCS dobretaUCS = new NodeUCS(dobreta, 242);
        NodeUCS eforieUCS = new NodeUCS(eforie, 161);
        NodeUCS fagarasUCS = new NodeUCS(fagaras, 176);
        NodeUCS giurgiuUCS = new NodeUCS(giurgiu, 77);
        NodeUCS hirsovaUCS = new NodeUCS(hirsova, 151);
        NodeUCS iasiUCS = new NodeUCS(iasi, 226);
        NodeUCS lugojUCS = new NodeUCS(lugoj, 244);
        NodeUCS mehadiaUCS = new NodeUCS(mehadia, 241);
        NodeUCS neamtUCS = new NodeUCS(neamt, 234);
        NodeUCS oradeaUCS = new NodeUCS(oradea, 380);
        NodeUCS pitestiUCS = new NodeUCS(pitesti, 10);
        NodeUCS rimnicuVilceaUCS = new NodeUCS(rimnicuVilcea, 193);
        NodeUCS sibiuUCS = new NodeUCS(sibiu, 253);
        NodeUCS timisoaraUCS = new NodeUCS(timisoara, 329);
        NodeUCS urziceniUCS = new NodeUCS(urziceni, 80);
        NodeUCS vasluiUCS = new NodeUCS(vaslui, 199);
        NodeUCS zerindUCS = new NodeUCS(zerind, 374);

        // menambahkan tetangga dari masing-masing node
        aradUCS.addTetangga(zerindUCS);
        aradUCS.addTetangga(sibiuUCS);
        aradUCS.addTetangga(timisoaraUCS);

        bucharestUCS.addTetangga(fagarasUCS);
        bucharestUCS.addTetangga(pitestiUCS);
        bucharestUCS.addTetangga(giurgiuUCS);
        bucharestUCS.addTetangga(urziceniUCS);

        craiovaUCS.addTetangga(dobretaUCS);
        craiovaUCS.addTetangga(rimnicuVilceaUCS);
        craiovaUCS.addTetangga(pitestiUCS);

        dobretaUCS.addTetangga(mehadiaUCS);
        dobretaUCS.addTetangga(craiovaUCS);

        eforieUCS.addTetangga(hirsovaUCS);

        fagarasUCS.addTetangga(sibiuUCS);
        fagarasUCS.addTetangga(bucharestUCS);

        giurgiuUCS.addTetangga(bucharestUCS);

        hirsovaUCS.addTetangga(urziceniUCS);
        hirsovaUCS.addTetangga(eforieUCS);

        iasiUCS.addTetangga(neamtUCS);
        iasiUCS.addTetangga(vasluiUCS);

        lugojUCS.addTetangga(timisoaraUCS);
        lugojUCS.addTetangga(mehadiaUCS);

        mehadiaUCS.addTetangga(lugojUCS);
        mehadiaUCS.addTetangga(dobretaUCS);

        neamtUCS.addTetangga(iasiUCS);

        oradeaUCS.addTetangga(zerindUCS);
        oradeaUCS.addTetangga(sibiuUCS);

        pitestiUCS.addTetangga(rimnicuVilceaUCS);
        pitestiUCS.addTetangga(craiovaUCS);
        pitestiUCS.addTetangga(bucharestUCS);

        rimnicuVilceaUCS.addTetangga(sibiuUCS);
        rimnicuVilceaUCS.addTetangga(craiovaUCS);
        rimnicuVilceaUCS.addTetangga(pitestiUCS);

        sibiuUCS.addTetangga(aradUCS);
        sibiuUCS.addTetangga(oradeaUCS);
        sibiuUCS.addTetangga(fagarasUCS);
        sibiuUCS.addTetangga(rimnicuVilceaUCS);

        timisoaraUCS.addTetangga(aradUCS);
        timisoaraUCS.addTetangga(lugojUCS);

        urziceniUCS.addTetangga(bucharestUCS);
        urziceniUCS.addTetangga(vasluiUCS);
        urziceniUCS.addTetangga(hirsovaUCS);

        vasluiUCS.addTetangga(iasiUCS);
        vasluiUCS.addTetangga(urziceniUCS);

        zerindUCS.addTetangga(aradUCS);
        zerindUCS.addTetangga(oradeaUCS);

        // menampilkan hasil dari algoritma Greedy Best First Search
        System.out.println("Greedy BFS");
        // inisialisasi objek GreedyBestFirstSearch
        GreedyBestFirstSearch bfs = new GreedyBestFirstSearch();
        // memanggil fungsi search dari objek GreedyBestFirstSearch dari node aradUCS ke
        // bucharestUCS
        bfs.search(aradUCS, bucharestUCS);
        System.out.println();
    }
}
