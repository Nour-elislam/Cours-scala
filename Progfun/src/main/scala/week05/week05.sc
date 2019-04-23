val fruit = List("Apples","oranges","pears")
val num = List(3,2,1,1)
val num2 = List(1,2,3,4)
val diag3 = List(List(1,0,0),List(0,1,0),List(0,0,1))
val empty = List()


def removeAt(n: Int, xs: List[Int])= xs take(n)


print(removeAt(2,num))

print(num)

def merge(xs: List[Int], ys: List[Int]): List[Int] = {
  xs match {
    case Nil => ys
    case x :: xs1 => ys match {
      case Nil => xs
      case y :: ys1 => if (x < y)  x :: merge(xs1, ys)
      else y :: merge(xs, ys1)
    }

  }
}

def msort(xs: List[Int]):List[Int] = {
  val n = xs.length / 2
  if (n == 0) xs
  else {
    val (fst, snd) = xs splitAt n
    merge(msort(fst), msort(snd))
  }
}

print(msort(num))
print(merge(num,num2))