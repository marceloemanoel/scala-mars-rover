package marsrover.directions

import marsrover.Point

object West extends Direction {
    override def turnLeft(): Direction = South
    override def turnRight(): Direction = North
    override def move(currentPosition: Point): Point = new Point(currentPosition.x - 1 , currentPosition.y)
}