package backtrack;

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

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(arad, bucharest);
        System.out.println();
    }
}
