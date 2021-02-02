class MigratoryBird{
    var id: Int = 0
    var frequency: Int = 0
        private set
    
    fun restoreFrequency(){
        this.frequency = 1
    }
    
    fun incrementFrequency(){
        this.frequency++
    }
    
    fun copy(bird: MigratoryBird){
        this.id = bird.id
        this.frequency = bird.frequency
    }
}

// Complete the migratoryBirds function below.
fun migratoryBirds(arr: Array<Int>): Int {
    val currentCheckingBird = MigratoryBird()
    val mostFrequentBird = MigratoryBird()
    
    arr.sort()
    
    arr.forEach { birdId ->
        if(currentCheckingBird.id == birdId){
            currentCheckingBird.incrementFrequency()
        }else{
            currentCheckingBird.restoreFrequency()
            currentCheckingBird.id = birdId
        }
        
        // as the array is already sorted, we dont have to compare if the mostFrequentBird id is bigger than the current one on loop
        if(mostFrequentBird.frequency < currentCheckingBird.frequency){
            mostFrequentBird.copy(currentCheckingBird)
        }
    }
    return mostFrequentBird.id
}
