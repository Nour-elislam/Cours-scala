
abstract class IntSet {
  def incl(elem: Int): IntSet
  def contains(elem: Int): Boolean
}

class Empty extends IntSet{
  def incl(x: Int): IntSet = new NoEmpty(new Empty,x,new Empty)
  def contains(x: Int): Boolean = false
  def ToString = "."
}


class NoEmpty(fg: IntSet, elem: Int, fd: IntSet) extends IntSet {
  def contains(x: Int): Boolean = if (x < elem) fg contains x
  else if (x > elem) fd.contains(x)
  else true

  def incl(x: Int): IntSet = if (x < elem) fg incl (x)
  else if (x > elem) fg.incl(x)
  else this

  def ToString = "{" + fg + elem + fd + "}"
}

object ntSets {
  val x = new NoEmpty(new Empty, 2, new Empty)

}