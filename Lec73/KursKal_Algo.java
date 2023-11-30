package Lec73;

import java.util.*;

import Lec72.Disjoint_Set_Union;

public class KursKal_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public KursKal_Algo(int v) {
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

	class EdegPair {
		int e1;
		int e2;
		int cost;

		public EdegPair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
		}

		public String toString() {
			return this.e1 + " " + this.e2 + " @ " + this.cost;
		}
	}

	public List<EdegPair> GetALlEdge() {
		List<EdegPair> ll = new ArrayList<>();
		for (int e1 : map.keySet()) {
			for (int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdegPair(e1, e2, cost));
			}
		}
		return ll;
	}

	public void Kurskal() {
		List<EdegPair> ll = GetALlEdge();
		Collections.sort(ll, new Comparator<EdegPair>() {

			@Override
			public int compare(EdegPair o1, EdegPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		Disjoint_Set_Union dsu = new Disjoint_Set_Union();
		for (int v : map.keySet()) {
			dsu.Create(v);
		}
		for (EdegPair e : ll) {
			int re1 = dsu.find(e.e1);
			int re2 = dsu.find(e.e2);
			if (re1 == re2) {
				// nothing
			} else {
				dsu.Union(e.e1, e.e2);
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		KursKal_Algo g = new KursKal_Algo(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.Kurskal();
	}

}
