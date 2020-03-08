# Name: Nick DeVos
# Date: 11/19/2016
# Decsription: Functions to remove all red from images

from cImage import *

def removeRed(oldPixel):
    newRed = 0
    newGreen = oldPixel.getGreen()
    newBlue = oldPixel.getBlue()
    newPixel = Pixel(newRed,newGreen,newBlue)
    return newPixel

def makeRedLess(imageFile):
    myimagewindow = ImageWin("Image Processing", 600,200)
    oldimage = FileImage(imageFile)
    oldimage.draw(myimagewindow)

    width = oldimage.getWidth()
    height = oldimage.getHeight()
    newim = EmptyImage(width,height)

    for row in range(height):
        for col in range(width):
            originalPixel = oldimage.getPixel(col,row)
            newPixel = removeRed(originalPixel)
            newim.setPixel(col,row,newPixel)

    newim.setPosition(width+1,0)
    newim.draw(myimagewindow)
    myimagewindow.exitOnClick()

makeRedLess("lutherBell.gif")