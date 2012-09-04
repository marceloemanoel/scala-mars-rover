package marsrover.directions;

import marsrover.Point;

object North extends Direction {
     override def turnLeft(): Direction = West
     override def turnRight(): Direction = East
     override def move(currentPosition: Point): Point = new Point(currentPosition.x, currentPosition.y + 1)
}