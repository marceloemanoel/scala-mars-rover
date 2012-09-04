package marsrover.directions

import marsrover.Point

trait Direction {
   def turnLeft(): Direction
   def turnRight(): Direction
   def move(currentPosition: Point): Point
}