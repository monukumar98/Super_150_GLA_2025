package Lec12;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		System.out.println(CompleteCircuit(gas, cost));

	}

	public static int CompleteCircuit(int[] gas, int[] cost) {
		int tc = 0;	
		for (int i = 0; i < cost.length; i++) {
			tc = tc + gas[i] - cost[i];
		}

		if (tc < 0) {
			return -1;
		}
		int si = 0;
		int curr = 0;
		for (int i = 0; i < cost.length; i++) {
			curr += gas[i] - cost[i];

			if (curr < 0) {
				curr = 0;
				si = i + 1;
			}
		}

		return si;

	}
}
