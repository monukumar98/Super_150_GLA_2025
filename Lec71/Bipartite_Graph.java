package Lec71;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_Graph {
	class Solution {
		public boolean isBipartite(int[][] graph) {
			HashMap<Integer, Integer> visited = new HashMap<>();
			Queue<BipartitePair> q = new LinkedList<>();
			for (int i = 0; i < graph.length; i++) {

			}

		}
	}

	class BipartitePair {
		int vtx;
		int des;
		public BipartitePair(int vtx, int des) {
			// TODO Auto-generated constructor stub
			this.vtx=vtx;
			this.des=des;
		}
	}

}
