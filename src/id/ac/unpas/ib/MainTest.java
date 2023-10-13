package id.ac.unpas.ib;

import id.ac.unpas.ib.bfs.BreadthFirstSearch;
import id.ac.unpas.ib.dls.DepthLimitedSearch;
import id.ac.unpas.ib.ucs.NodeUCS;
import id.ac.unpas.ib.ucs.UniformCostSearch;

public class MainTest {
    public static void main(String[] args) {
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

        arad.addTetangga(zerind);
        arad.addTetangga(sibiu);
        arad.addTetangga(timisoara);

        bucharest.addTetangga(fagaras);
        bucharest.addTetangga(pitesti);
        bucharest.addTetangga(giurgiu);
        bucharest.addTetangga(urziceni);

        craiova.addTetangga(dobreta);
        craiova.addTetangga(rimnicuVilcea);
        craiova.addTetangga(pitesti);

        dobreta.addTetangga(mehadia);
        dobreta.addTetangga(craiova);

        eforie.addTetangga(hirsova);

        fagaras.addTetangga(sibiu);
        fagaras.addTetangga(bucharest);

        giurgiu.addTetangga(bucharest);

        hirsova.addTetangga(urziceni);
        hirsova.addTetangga(eforie);

        iasi.addTetangga(neamt);
        iasi.addTetangga(vaslui);

        lugoj.addTetangga(timisoara);
        lugoj.addTetangga(mehadia);

        mehadia.addTetangga(lugoj);
        mehadia.addTetangga(dobreta);

        neamt.addTetangga(iasi);

        oradea.addTetangga(zerind);
        oradea.addTetangga(sibiu);

        pitesti.addTetangga(rimnicuVilcea);
        pitesti.addTetangga(craiova);
        pitesti.addTetangga(bucharest);

        rimnicuVilcea.addTetangga(sibiu);
        rimnicuVilcea.addTetangga(craiova);
        rimnicuVilcea.addTetangga(pitesti);

        sibiu.addTetangga(arad);
        sibiu.addTetangga(oradea);
        sibiu.addTetangga(fagaras);
        sibiu.addTetangga(rimnicuVilcea);

        timisoara.addTetangga(arad);
        timisoara.addTetangga(lugoj);

        urziceni.addTetangga(bucharest);
        urziceni.addTetangga(vaslui);
        urziceni.addTetangga(hirsova);

        vaslui.addTetangga(iasi);
        vaslui.addTetangga(urziceni);

        zerind.addTetangga(arad);
        zerind.addTetangga(oradea);

        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(arad, bucharest);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(arad, bucharest);
        System.out.println();

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

        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(aradUCS, bucharestUCS);
        System.out.println();
    }
}
