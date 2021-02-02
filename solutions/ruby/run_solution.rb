require 'colorize'
require './migratory_birds'

#input parsing and reading
input00 = File.open("../../test-cases/input/input00.txt")
input05 = File.open("../../test-cases/input/input05.txt")

data = input00.map(&:chomp)
arr0 = data[1].split(" ").map(&:to_i)

data = input05.map(&:chomp)
arr5 = data[1].split(" ").map(&:to_i)


# problem application
start = Time.now
response00 = migratory_birds arr0
response05 = migratory_birds arr5
finish = Time.now

puts("solved all the test cases in " + (1000 * (finish - start)).round(2).to_s + "ms")

#expected outputs

output00File = File.open("../../test-cases/output/output00.txt")
output05File = File.open("../../test-cases/output/output05.txt")


data = output00File.map(&:chomp)
output00 = data[0].to_i

data = output05File.map(&:chomp)
output05 = data[0].to_i

if response00 === output00
	puts "INPUT 00".green
else
	puts "INPUT 00".red
end

if response05 === output05
	puts "INPUT 05".green
else
	puts "INPUT 05".red
end