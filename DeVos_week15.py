# Name: Nick DeVos
# Date: 11/23/2016
# Description: Make a program to horizontally flip an image

from cImage import *

def horizontalFlip(oldImage):
    oldw = oldImage.getWidth()
    oldh = oldImage.getHeight()

    newim = EmptyImage(oldw,oldh)

    maxp = oldw-1
    for row in range(oldh):
        for col in range(oldw):

            oldpixel = oldImage.getPixel(col, maxp-row)

            newim.setPixel(col,row,oldpixel)

    return newim

def testHorizontalFlip(imageFile):

    oldimage = FileImage(imageFile)
    windowWidth = oldimage.getWidth() * 2
    windowHeight = oldimage.getHeight()
    myimagewindow = ImageWin("Horizontal Flip Image Processing",windowWidth, windowHeight)

    oldimage.draw(myimagewindow)

    newimage = horizontalFlip(oldimage)

    newimage.setPosition(oldimage.getWidth()+1,0)
    newimage.draw(myimagewindow)

    myimagewindow.exitOnClick()

testHorizontalFlip("mickey.gif")