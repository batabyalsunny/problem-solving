/**
 * 
 */
package queue;

/**
 * @author sunnyb
 *
 */
public class FindCircularTourOfPetrolPumps {

	public static void main(String[] args) {

		PetrolPump[] arr = { new PetrolPump(6, 4), new PetrolPump(3, 6), new PetrolPump(7, 3) };

		int n = arr.length;

		int start = 0, end = 1;
		int currentPetrol = arr[start].petrol - arr[start].distance;

		while (currentPetrol < 0 || start != end) {

			while (currentPetrol < 0 && start != end) {

				// Remove the current petrol and distance from current petrol.
				currentPetrol -= arr[start].petrol - arr[start].distance;
				start = (start + 1) % n;

				if (start == 0) {
					System.out.println(-1);
					return;
				}
			}

			currentPetrol += arr[end].petrol - arr[end].distance;
			end = (end + 1) % n;
		}

		System.out.println(start);
		return;
	}

}

class PetrolPump {
	int petrol;
	int distance;

	/**
	 * @param petrol
	 * @param distance
	 */
	public PetrolPump(int petrol, int distance) {
		this.petrol = petrol;
		this.distance = distance;
	}
}
