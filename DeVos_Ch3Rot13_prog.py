# Name: Nick DeVos
# Date: 10/1/2016
# Description: Ch. 3 Rot13 Cryptography Programming Assignment

def rot13(textEntered):
    alphabet = "abcdefghijklmnopqrstuvwxyz "
    key = "nopqrstuvwxyzabcdefghijklm "
    textEntered = textEntered.lower()
    outputText = ""
    for ch in textEntered:
        index = alphabet.find(ch)
        outputText = outputText + key[index]
    return outputText

textEntered = input("Please enter some text. ")

print("The resulting message is... " + rot13(textEntered))