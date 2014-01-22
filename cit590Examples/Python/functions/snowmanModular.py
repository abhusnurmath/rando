from turtle import *

def snowmanBodyCircle(startCoordinate, circleSize):
    turtle = Turtle()
    turtle.up()
    turtle.goto(0,startCoordinate)
    turtle.down()
    turtle.color('black')
    turtle.width(width=5)
    turtle.fill(1)
    turtle.fill(0)
    turtle.circle(circleSize)
    turtle.hideturtle()

def makeSnowmanBody():
    title('snowman')
    snowmanBodyCircle(-250, 120)
    snowmanBodyCircle(-10, 90)
    snowmanBodyCircle(170, 60)
    exitonclick()

makeSnowmanBody()
