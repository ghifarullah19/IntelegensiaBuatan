package backtrack;

import java.util.ArrayList;
import java.util.List;

public class DepthLimitedSearch {
    private int limit;

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void search(Node start, Node goal) {
    	System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai());
        Node eval = start;
//        eval.isVisited = true;
        List<String> nodeSolusi = new ArrayList<String>();
        
        for (Node n : eval.getTetangga()) {
        	
    		for (int i = 0; i < limit; i++) {
                System.out.println("Level "+i+" evaluasi: "+n.getNilai());
                
                if (n.equals(goal)) {
                    System.out.println("Solusi ditemukan ");
                    break;
                } else {
                	if (!n.getTetangga().isEmpty()) {
                
                		for (Node m : n.getTetangga()) {
                			if (m.isVisited != true) {
//                				m.isVisited = true;
                				n = m;
                				System.out.println(n.getNilai());                				
                			} else {
                				continue;
                			}
		                }
                		
		            } else {
		                break;
		            }
                }
            }
    		System.out.println();
        }
    }
}
