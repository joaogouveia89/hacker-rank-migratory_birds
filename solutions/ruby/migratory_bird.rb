class MigratoryBird

	attr_accessor :id
	attr_reader :frequency

	def initialize
		@frequency = 0
		@id = 0
	end

	def increment_frequency
		@frequency = @frequency + 1
	end

	def restore_frequency
		@frequency = 1
	end

	def copy bird
		@frequency = bird.frequency
		@id = bird.id
	end
end