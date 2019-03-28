
class Rational(x: Int,y: Int) {
  def this(x: Int) = this(x,1)
  require(y !=0 ,"denominator must be zero")
  private def gcd(a: Int ,b: Int): Int = if(b == 0) a else gcd(b,a%b)

  def numer = x
  def denom = y

  def + (that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom, denom * that.denom)

  override def toString = {
  val g = gcd(x, y)
    numer / g + "/" + denom / g
  }
  def neg(that: Rational) = new Rational(-(this.numer),denom)

  //def - (that: Rational) = this + that.neg(that)

  def sub(that:Rational) =this + that.neg(that)
  def < (that: Rational): Boolean = numer * that.denom < that.numer * denom
  def max (that: Rational) = if(this.<(that)) that else this
}

  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)


val e = x.sub(y).sub(z)

y.toString
z.toString
y + (y)
x<(y)
x.max(y)
def l = new Rational(2,4)
def total = x.sub(x)

l.toString
x.toString
total.toString

