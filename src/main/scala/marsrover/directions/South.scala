package marsrover.directions

import  marsrover._

object South extends Direction {
    override def turnLeft(): Direction = East
    override def turnRight(): Direction = West
    override def move(currentPosition: Point): Point = new Point(currentPosition.x, currentPosition.y - 1)
}