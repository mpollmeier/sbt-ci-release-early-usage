import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class SimpleTest extends AnyWordSpec with Matchers {

  "foo bar" in {
    2 shouldBe 2
  }

}
