import org.scalatest.{Matchers, WordSpec}

class SimpleTest extends WordSpec with Matchers {

  "foo bar" in {
    2 shouldBe 2
  }

}
