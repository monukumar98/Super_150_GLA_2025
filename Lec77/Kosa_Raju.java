package Lec77;

import java.util.*;

public class Kosa_Raju {
	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Kosa_Raju(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addedge(int v1, int v2) {
		map.get(v1).put(v2, 5);

	}

	public void KosaRajuAlgo() {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> st = new Stack<>();
		// dfs all vtx stack me put kr do
		dfs(visited, st, 0);
		// Transpose krna
		HashMap<Integer, HashMap<Integer, Integer>> map1 = new HashMap<>();

		Transpose(map1);

		// dfs component count krna
		int c = 0;
		visited = new HashSet<>();
		while (!st.isEmpty()) {
			int pop = st.pop();
			if (!visited.contains(pop)) {
				c++;
				dfs(map1, visited, pop);
			}

		}
		System.out.println(c);
	}

	private void dfs(HashMap<Integer, HashMap<Integer, Integer>> map1, HashSet<Integer> visited, int pop) {
		// TODO Auto-generated method stub
		visited.add(pop);
		for (int nbrs : map1.get(pop).keySet()) {
			if (!visited.contains(nbrs)) {
				dfs(map1, visited, nbrs);
			}
		}

	}

	private void Transpose(HashMap<Integer, HashMap<Integer, Integer>> map1) {
		// TODO Auto-generated method stub
		for (int v1 : map.keySet()) {
			for (int v2 : map.get(v1).keySet()) {
				if (!map1.containsKey(v2)) {
					map1.put(v2, new HashMap<>());
				}
				map1.get(v2).put(v1, 5);
			}
		}
		for (int v1 : map.keySet()) {
			if (!map1.containsKey(v1)) {
				map1.put(v1, new HashMap<>());
			}
		}

	}

	public void dfs(HashSet<Integer> visited, Stack<Integer> st, int vtx) {
		visited.add(vtx);
		for (int nbrs : map.get(vtx).keySet()) {
			if (!visited.contains(nbrs)) {
				dfs(visited, st, nbrs);
			}
		}
		st.push(vtx);
	}

}
