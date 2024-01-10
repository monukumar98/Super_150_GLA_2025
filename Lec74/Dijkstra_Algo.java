package Lec74;

import java.util.*;

public class Dijkstra_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	class DijkstraPair {
		int vtx;
		String acqpath;
		int cost;

		public DijkstraPair(int vtx, String acqpath, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}

		public String toString() {
			return this.vtx + " " + this.acqpath + " @ " + this.cost;
		}
	}

	public void Dijkstra() {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(1, "1", 0));
		while (!pq.isEmpty()) {
			DijkstraPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = rp.cost + map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.acqpath + nbrs, cost));
				}
			}
		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo g = new Dijkstra_Algo(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.Dijkstra();
	}

}
