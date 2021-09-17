package cal.unit.Validators


  trait Calc {
    def Fib1(i : Int): Int
  }
  class fibnacci extends Calc {
    def fib1( n : Int) : Int = n match {
      case 0 | 1 => n
      case _ => fib1( n-1 ) + fib1( n-2 )
    }

    override def Fib1(i: Int): Int = ???




}
