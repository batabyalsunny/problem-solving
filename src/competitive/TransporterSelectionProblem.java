/**
 * 
 */
package competitive;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author sunnyb
 *
 */
public class TransporterSelectionProblem {

	public Map<Integer, Map<Integer, Integer>> findTransporters(int[] productWeights, int[] transporterCapacities) {

		// Sort product weights and transporter capacity array in decending order.

		// Transporter list.
		Map<Integer, Integer> transporter = new HashMap<>();
		Map<Integer, Integer> remainingCapacity = new HashMap<>();

		int transporterCount = 0, i;

		// Loop through the product weights array to find how many products
		// can be fit in the highest capacity transporter.
		for (int weight : productWeights) {

			// If the weight is higher or equal than the capacity.
			// If no transporter is yet choose.
			if (weight >= transporterCapacities[0] || transporterCount == 0) {
				// Create new transporter bucket.
				transporter.put(transporterCount, weight);
				remainingCapacity.put(transporterCount, transporterCapacities[0] - weight);
				transporterCount++;
				continue;
			}

			// Check for all the existing transporter bucket.
			for (i = 0; i < transporterCount; i++) {

				// If the current weight can be fit into some existing transporter bucket.
				if (weight < remainingCapacity.get(i)) {

					// Put the current product into the transporter bucket.
					transporter.put(i, transporter.get(i) + weight);
					remainingCapacity.put(i, remainingCapacity.get(i) - weight);
					break;
				}
			}

			// If container does not fit into any existing container.
			if (i == transporterCount) {

				// Create new transporter bucket.
				transporter.put(transporterCount, weight);
				remainingCapacity.put(i, transporterCapacities[0] - weight);
				transporterCount++;
			}

		}

		Map<Integer, Map<Integer, Integer>> transporters = new HashMap<>();
		Map<Integer, Integer> transportersCount = new HashMap<>();

		// Loop through the highest capacity transporter bucket to check if
		// current bucket can be fit into any less capacity transporter or not.
		for (Map.Entry<Integer, Integer> entry : transporter.entrySet()) {

			// For all the other capacity transporter.
			for (int j = 1; j < transporterCapacities.length; j++) {

				transporters.put(j, new HashMap<>());

				// If value is greater than current capacity.
				if (entry.getValue() > transporterCapacities[j]) {
					break;
				}

				// If not the last transporter.
				// Bigger than next transporter capacity.
				if (j == transporterCapacities.length - 1 || entry.getValue() > transporterCapacities[j + 1]) {

					if (!transportersCount.containsKey(j)) {
						transportersCount.put(j, 0);
					}

					// Put into this transporter bucket.
					transporters.get(j).put(transportersCount.get(j), entry.getValue());
					transportersCount.put(j, transportersCount.get(j) + 1);

					// Remove from biggest transporter array.
					transporter.remove(entry.getKey());
				}
			}
		}

		// Put the biggest transporter.
		transporters.put(0, transporter);

		return transporters;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TransporterSelectionProblem tsp = new TransporterSelectionProblem();

		int productWeights[] = { 50, 40, 40, 30, 20, 20 };
		int transporterCapacities[] = { 20, 12, 5 };

		Map<Integer, Map<Integer, Integer>> transporters = tsp.findTransporters(productWeights, transporterCapacities);

		for (Entry<Integer, Map<Integer, Integer>> entry : transporters.entrySet()) {

			System.out
					.println(entry.getKey() + "->" + transporters.get(entry.getKey()).size() + "->" + entry.getValue());
		}

		System.out.println(transporters.get(0).size());
		System.out.println(transporters.get(1).size());
		System.out.println(transporters.get(2).size());
	}

}
