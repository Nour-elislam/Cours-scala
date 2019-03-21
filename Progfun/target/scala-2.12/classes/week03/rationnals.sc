
class Rational(x: Int,y: Int) {
  private def gcd(a: Int ,b: Int): Int = if(b == 0) a else gcd(b,a%b)
  private val g = gcd(x,y)
  def numer = x /g
  def denom = y /g

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom, denom * that.denom)
  override def toString = numer +"/" + denom
  def neg(that: Rational) = new Rational(-numer,denom)

  def sub(that:Rational) = add(that.neg(that))
  def less(that: Rational): Boolean = numer * that.denom < that.numer * denom
  def max (that: Rational) = if(this.less(that)) that else this
}

  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  val strange = new Rational(1,0)
   strange.add(strange)


x.sub(y).sub(z)
y.toString
z.toString
y.add(y)
x.less(y)
x.max(y)