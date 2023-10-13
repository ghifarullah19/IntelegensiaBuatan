package latihan;

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

        // arad.addTetangga(zerind, false);
        arad.addTetangga(sibiu, true);
        // arad.addTetangga(timisoara, true);

        bucharest.addTetangga(fagaras, true);
        bucharest.addTetangga(pitesti, false);
        // bucharest.addTetangga(giurgiu);
        // bucharest.addTetangga(urziceni);

        // craiova.addTetangga(dobreta);
        // craiova.addTetangga(rimnicuVilcea);
        // craiova.addTetangga(pitesti, true);

        // dobreta.addTetangga(mehadia, false);
        // dobreta.addTetangga(craiova, true);

        // eforie.addTetangga(hirsova);

        fagaras.addTetangga(sibiu, true);
        // fagaras.addTetangga(bucharest, false);

        // giurgiu.addTetangga(bucharest);

        // hirsova.addTetangga(urziceni);
        // hirsova.addTetangga(eforie);

        // iasi.addTetangga(neamt);
        // iasi.addTetangga(vaslui);

        // lugoj.addTetangga(timisoara, false);
        // lugoj.addTetangga(mehadia, true);

        // mehadia.addTetangga(lugoj, false);
        // mehadia.addTetangga(dobreta, true);

        // neamt.addTetangga(iasi);

        oradea.addTetangga(zerind, true);
        oradea.addTetangga(sibiu, false);

        pitesti.addTetangga(rimnicuVilcea, false);
        // pitesti.addTetangga(craiova, false);
        pitesti.addTetangga(bucharest, true);

        // rimnicuVilcea.addTetangga(sibiu, false);
        // rimnicuVilcea.addTetangga(craiova);
        rimnicuVilcea.addTetangga(pitesti, true);

        sibiu.addTetangga(arad, false);
        // sibiu.addTetangga(oradea, true);
        // sibiu.addTetangga(fagaras, false);
        sibiu.addTetangga(rimnicuVilcea, true);

        // timisoara.addTetangga(arad, false);
        // timisoara.addTetangga(lugoj, true);

        // urziceni.addTetangga(bucharest);
        // urziceni.addTetangga(vaslui);
        // urziceni.addTetangga(hirsova);

        // vaslui.addTetangga(iasi);
        // vaslui.addTetangga(urziceni);

        // zerind.addTetangga(arad, true);
        // zerind.addTetangga(oradea, false);

        // System.out.println("BFS");
        // BreadthFirstSearch bfs = new BreadthFirstSearch();
        // bfs.search(bucharest, arad);

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(100);
        dls.search(arad, bucharest);
        System.out.println();
    }
}
