
object intsets extends App {
  // Your program here

  val x = new NoEmpty(2, new Empty, new Empty)

}
  abstract class IntSet {
    def incl(x: Int): IntSet

    def contains(x: Int): Boolean
  }

  class Empty extends IntSet {
    def incl(x: Int): IntSet = new NoEmpty(x, new Empty, new Empty)

    def contains(x: Int): Boolean = false

    def ToString = "."
  }


  class NoEmpty(elem: Int, fg: IntSet, fd: IntSet) extends IntSet {
    def contains(x: Int): Boolean = if (x < elem) fg contains x
    else if (x > elem) fd.contains(x)
    else true

    def incl(x: Int): IntSet = if (x < elem) fg incl x
    else if (x > elem) fg incl x
    else this

    def ToString = "{" + fg + elem + fd + "}"
  }

