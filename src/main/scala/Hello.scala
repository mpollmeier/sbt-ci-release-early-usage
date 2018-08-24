class A(val i: Int)
class Z(val z: String)

object Example extends App {
  val a0 = new A(5)
  val z0 = new Z("z0")

  (Some(a0), 5) match {
    case (a: Option[A], b) if a.isDefined =>
      println(a.get.i * b)
  }
}
