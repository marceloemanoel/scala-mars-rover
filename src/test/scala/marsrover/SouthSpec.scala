package marsrover.test

import org.scalatest.FunSpec;
import marsrover.directions._;
import marsrover._;

class SouthSpec extends FunSpec {
    describe("South") {
        it("turns left to see the East") {
             assert(South.turnLeft() == East)
        }
        it("turn right to see West") {
            assert(South.turnRight() == West)
        }
        it("move up -1 in y direction") {
            assert(South.move(new Point(0, 0)) equals new Point(0, -1))
        }
    }
}