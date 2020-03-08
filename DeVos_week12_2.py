# Name: Nick DeVos
# Date: 11/5/2016
# Description: Count number of lines, words, and characters in a file

# Count number of lines in rainfall.txt
rainfile = open("rainfall.txt","r")
lines = len(rainfile.readlines())
lines = str(lines)
print("The number of lines is " + lines)

# Count number of words in rainfall.txt
rainfile = open("rainfall.txt","r")
wordCount = 0
for line in rainfile:
    words = line.split()
    wordCount += len(words)
wordCount = str(wordCount)
print("The number of words is " + wordCount)

# Count number of characters in rainfall.txt
rainfile = open("rainfall.txt","r")
characters = len(rainfile.read())
characters = str(characters)
print("The number of characters is " + characters)

print("End of Week12_2 by Nick DeVos")