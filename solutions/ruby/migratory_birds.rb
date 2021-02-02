require './migratory_bird'
def migratory_birds arr
	most_frequent_bird = MigratoryBird.new
	current_checking_bird = MigratoryBird.new

	arr.sort!

	arr.each do |bird_id|
		if current_checking_bird.id == bird_id
			current_checking_bird.increment_frequency
		else
			current_checking_bird.restore_frequency
			current_checking_bird.id = bird_id
		end

		# as the array is already sorted, we dont have to compare if the most_frequent_type bird id is bigger than the current one on loop
		if (most_frequent_bird.frequency < current_checking_bird.frequency)
			most_frequent_bird.copy current_checking_bird
		end
	end
	most_frequent_bird.id
end