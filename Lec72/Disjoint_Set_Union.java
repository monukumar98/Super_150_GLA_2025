package Lec72;

import java.util.HashMap;

public class Disjoint_Set_Union {

	class Node {
		int vtx;
		Node parent;
		int rank;
	}

	private HashMap<Integer, Node> map = new HashMap<>();

	public void Create(int v) {
		Node node = new Node();
		node.vtx = v;
		node.parent = node;
		node.rank = 0;
		map.put(v, node);

	}

	public int find(int v) {
		Node rn = map.get(v);
		return find(rn).vtx;

	}

	private Node find(Node rn) {
		if (rn.parent == rn) {
			return rn;
		}
		Node ren = find(rn.parent);
		rn.parent = ren;// path compression
		return ren;

	}

	public void Union(int e1, int e2) {
		Node rv1 = map.get(e1);
		Node rv2 = map.get(e2);
		Node ren1 = find(rv1);
		Node ren2 = find(rv2);
		if (ren1.rank == ren2.rank) {
			ren1.parent = ren2;
			ren2.rank++;
		} else if (ren1.rank > ren2.rank) {
			ren2.parent = ren1;
		} else {
			ren1.parent = ren2;
		}

	}

}
