package marsrover.test

import org.scalatest.FunSpec;
import marsrover.directions._;
import marsrover._;


class WestSpec extends FunSpec {
    describe("West") {
        it("turns left to see the South") {
             assert(West.turnLeft() == South)
        }
        it("turn right to see North") {
            assert(West.turnRight() == North)
        }
        it("move up -1 in x direction") {
            assert(West.move(new Point(0, 0)) equals new Point(-1, 0))
        }
    }
}