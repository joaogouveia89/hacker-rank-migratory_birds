import java.util.Arrays;  

public class MigratoryBirds{
	public static int run(int[] arr){
		MigratoryBird currentCheckingBird = new MigratoryBird();
		MigratoryBird mostFrequentBird = new MigratoryBird();

		int birdId;

		Arrays.parallelSort(arr);

		for(int i = 0; i < arr.length; i++){
			birdId = arr[i];

			if(currentCheckingBird.getId() == birdId){
				currentCheckingBird.incrementFrequency();
			}else{
				currentCheckingBird.restoreFrequency();
				currentCheckingBird.setId(birdId);
			}
			// as the array is already sorted, we dont have to compare if the mostFrequentBird id is bigger than the current one on loop
			if(mostFrequentBird.getFrequency() < currentCheckingBird.getFrequency()){
				mostFrequentBird.copy(currentCheckingBird);
			}
		}
		return mostFrequentBird.getId();
	}
}