package marsrover.directions

import marsrover.Point

object East extends Direction {
    override def turnLeft(): Direction = North
    override def turnRight(): Direction = South
    override def move(currentPosition: Point): Point = new Point(currentPosition.x + 1, currentPosition.y)
}