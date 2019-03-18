package recfun


object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      def fact(n: Int): Int = {

        def loop(acc: Int, n: Int): Int =
          if (n == 0) acc
          else loop(acc * n, n - 1)

        loop(1, n)
      }
      fact(r)/(r-c)*fact(c)

  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanced(chars: List[Char],open: Int): Boolean = {
        if (chars.isEmpty) open == 0
        else if (chars.head == '(') balanced(chars.tail, open + 1)
        else if (chars.head == ')') open > 0 && balanced(chars.tail, open - 1)
        else balanced (chars.tail, open)


      }
      balanced(chars,0)
    }
  
  /**
   * Exercise 3
    */
    def countChange(money: Int, coins: List[Int]): Int = {
      def loop(money: Int,coins : List[Int]): Int ={
        if (money < 0 || coins.isEmpty) 0
        else if (money == 0) 1
        else loop(money,coins.tail) + loop(money - coins.head, coins)
      }
      loop(money,coins)
    }

  }
