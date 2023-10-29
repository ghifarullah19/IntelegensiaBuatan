package id.ac.unpas.ib.latihan.heuristik.astar;

// main program
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

        // menambahkan tetangga dari masing-masing node dengan costnya
        aradUCS.addTetangga(zerindUCS, 75);
        aradUCS.addTetangga(sibiuUCS, 140);
        aradUCS.addTetangga(timisoaraUCS, 118);

        bucharestUCS.addTetangga(fagarasUCS, 211);
        bucharestUCS.addTetangga(pitestiUCS, 101);
        bucharestUCS.addTetangga(giurgiuUCS, 90);
        bucharestUCS.addTetangga(urziceniUCS, 85);

        craiovaUCS.addTetangga(dobretaUCS, 120);
        craiovaUCS.addTetangga(rimnicuVilceaUCS, 146);
        craiovaUCS.addTetangga(pitestiUCS, 138);

        dobretaUCS.addTetangga(mehadiaUCS, 75);
        dobretaUCS.addTetangga(craiovaUCS, 120);

        eforieUCS.addTetangga(hirsovaUCS, 86);

        fagarasUCS.addTetangga(sibiuUCS, 99);
        fagarasUCS.addTetangga(bucharestUCS, 211);

        giurgiuUCS.addTetangga(bucharestUCS, 90);

        hirsovaUCS.addTetangga(urziceniUCS, 98);
        hirsovaUCS.addTetangga(eforieUCS, 86);

        iasiUCS.addTetangga(neamtUCS, 87);
        iasiUCS.addTetangga(vasluiUCS, 92);

        lugojUCS.addTetangga(timisoaraUCS, 111);
        lugojUCS.addTetangga(mehadiaUCS, 70);

        mehadiaUCS.addTetangga(lugojUCS, 70);
        mehadiaUCS.addTetangga(dobretaUCS, 75);

        neamtUCS.addTetangga(iasiUCS, 87);

        oradeaUCS.addTetangga(zerindUCS, 71);
        oradeaUCS.addTetangga(sibiuUCS, 151);

        pitestiUCS.addTetangga(rimnicuVilceaUCS, 97);
        pitestiUCS.addTetangga(craiovaUCS, 138);
        pitestiUCS.addTetangga(bucharestUCS, 101);

        rimnicuVilceaUCS.addTetangga(sibiuUCS, 80);
        rimnicuVilceaUCS.addTetangga(craiovaUCS, 146);
        rimnicuVilceaUCS.addTetangga(pitestiUCS, 97);

        sibiuUCS.addTetangga(aradUCS, 140);
        sibiuUCS.addTetangga(oradeaUCS, 151);
        sibiuUCS.addTetangga(fagarasUCS, 99);
        sibiuUCS.addTetangga(rimnicuVilceaUCS, 80);

        timisoaraUCS.addTetangga(aradUCS, 118);
        timisoaraUCS.addTetangga(lugojUCS, 111);

        urziceniUCS.addTetangga(bucharestUCS, 85);
        urziceniUCS.addTetangga(vasluiUCS, 142);
        urziceniUCS.addTetangga(hirsovaUCS, 98);

        vasluiUCS.addTetangga(iasiUCS, 92);
        vasluiUCS.addTetangga(urziceniUCS, 142);

        zerindUCS.addTetangga(aradUCS, 75);
        zerindUCS.addTetangga(oradeaUCS, 71);

        // menampilkan hasil dari algoritma A*
        System.out.println("A*");
        // inisialisasi objek AStar
        AStar aStar = new AStar();
        // memanggil fungsi search dari objek aStar dari node aradUCS ke bucharestUCS
        aStar.search(aradUCS, bucharestUCS);
        System.out.println();
    }
}
