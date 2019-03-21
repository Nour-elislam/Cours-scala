2+3
def abs(x: Double) = if(x < 0) -x else x



def isGoodEnough(guess: Double, x: Double) =
abs(guess * guess - x) /x < 0.001

def improve(guess: Double, x: Double) =
  (guess + x /guess)/2

def sqrt(x: Double) = {
  def sqrtIter(guess: Double, x: Double): Double =

    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  sqrtIter(1.0, x)

}

sqrt(2)
sqrt(3)

sqrt(1e-6)
sqrt(1e60)


def gcd(a: Int, b: Int): Int =
  if(b == 0) a else gcd(b, a%b)
gcd(14,21)


def fac(n:Int): Int=
if(n == 0) 1 else n * fac(n-1)

fac(4)
