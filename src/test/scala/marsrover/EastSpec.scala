package marsrover.test

import org.scalatest.FunSpec;
import marsrover.directions._;
import marsrover._;


class EastSpec extends FunSpec {
    describe("East") {
        it("turns left to see the North") {
             assert(West.turnLeft() == North)
        }
        it("turn right to see South") {
            assert(West.turnRight() == South)
        }
        it("move up +1 in x direction") {
            assert(West.move(new Point(0, 0)) equals new Point(1, 0))
        }
    }
}