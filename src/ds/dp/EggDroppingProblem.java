/**
 * 
 */
package ds.dp;

import java.util.Arrays;

/**
 * @author sunnyb
 *
 */
public class EggDroppingProblem {

	private long runningTime;
	private int[][] mem;

	public int dropEgg(int e, int f) {

		if (mem[e][f] > -1) {
			return mem[e][f];
		}

		// No floor or one floor.
		if (f < 2) {
			return f;
		}

		// One egg only.
		if (e < 1) {
			return f;
		}

		int min = Integer.MAX_VALUE;

		for (int i = 1; i < f + 1; i++) {

			int max = Math.max(dropEgg(e - 1, i - 1), dropEgg(e, f - i));

			if (min > max) {
				min = max;
			}

			runningTime++;
		}

		mem[e][f] = min + 1;

		return min + 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EggDroppingProblem edp = new EggDroppingProblem();

		edp.runningTime = 0;

		int floor = 10;
		int egg = 2;

		edp.mem = new int[egg + 1][floor + 1];
		for (int i = 0; i < egg + 1; i++) {
			Arrays.fill(edp.mem[i], -1);
		}

		System.out.println(edp.dropEgg(egg, floor));

		System.out.println(edp.runningTime);
	}

}
