package marsrover;

class Point(var x:Int,var y:Int) {
  override def equals(that: Any) = {
    that match {
      case point: Point => point.x == x && point.y == y
      case _ => false
    }
  }
}