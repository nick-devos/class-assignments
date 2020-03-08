# Name: Nick DeVos
# Date: 12/2/2016
# Description: Final Exam - Image scaling

from cImage import *

def scaleUp(oldimage,widthScale,heightScale):
    oldw = oldimage.getWidth() # gets old width
    oldh = oldimage.getHeight() # gets old height

    newim = EmptyImage(oldw*widthScale,oldh*heightScale)

    for row in range(newim.getHeight()):
        for col in range(newim.getWidth()):

            originalCol = col // widthScale
            originalRow = row // heightScale
            oldpixel = oldimage.getPixel(originalCol,originalRow)

            newim.setPixel(col,row,oldpixel)

    return newim

def do_ScaleUp(imageFile):
    # Ask for scaling sizes
    widthScale = input("By what factor would you like to increase the width?")
    heightScale = input("By what factor would you like to increase the height?")

    widthScale = int(widthScale) # convert input to int
    heightScale = int(heightScale) # convert input to int

    oldimage = FileImage(imageFile)
    windowWidth = oldimage.getWidth() + (oldimage.getWidth() * widthScale)
    windowHeight = oldimage.getHeight() * heightScale
    # make window to show images
    myimagewindow = ImageWin("Scale Image Processing",windowWidth, windowHeight)

    oldimage.draw(myimagewindow) # Draws original image

    newimage = scaleUp(oldimage, widthScale, heightScale) # use scaleUp function

    newimage.setPosition(oldimage.getWidth()+1,0)
    newimage.draw(myimagewindow) # draw new image

    myimagewindow.exitOnClick() # exit when you click the image

do_ScaleUp("mickey.gif")