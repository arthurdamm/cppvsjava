from random import randint

INPUT_FILE = "inputfile.txt"
NUM_WORDS = 10000

def randomWord(size):
	word = [0] * size
	for i in range(size):
		word[i] = chr(ord('a') + randint(0, 25))
	return "".join(word)

def writeWords(numWords):
	with open(INPUT_FILE, "w") as f:
		for _ in range(numWords):
			f.write(randomWord(randint(5, 15)))
			f.write("\n")

writeWords(NUM_WORDS)

