package marsrover.test;

import org.scalatest.FunSpec;
import marsrover.directions._;
import marsrover._;

class NorthSpec extends FunSpec {
  
    describe("North") {
        it("turns left to see the West") {
             assert(North.turnLeft() == West)
        }
        it("turn right to see East") {
            assert(North.turnRight() == East)
        }
        it("move up +1 in y direction") {
            assert(North.move(new Point(0, 0)) equals new Point(0, 1))
        }
    }
}