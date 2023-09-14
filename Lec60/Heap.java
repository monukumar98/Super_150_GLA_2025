package Lec60;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> list;

	public Heap() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
	}

	public void Add(int item) {
		list.add(item);
		upheapify(list.size() - 1);
	}

	private void upheapify(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (list.get(pi) > list.get(ci)) {
			Swap(pi, ci);
			upheapify(pi);
		}
	}

	public void Swap(int pi, int ci) {
		int temp = list.get(pi);
		list.set(pi, list.get(ci));
		list.set(ci, temp);

	}

	public int remove() {
		int rv = list.get(0);
		Swap(0, list.size() - 1);
		list.remove(list.size() - 1);
		downheapify(0);
		return rv;

	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < list.size() && list.get(lci) < list.get(mini)) {
			mini = lci;
		}
		if (rci < list.size() && list.get(rci) < list.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			Swap(pi, mini);
			downheapify(mini);
		}

	}

	public int get() {
		return list.get(0);
	}

	public void Display() {
		System.out.println(list);
	}

}
