package cal.unit.Validators

  trait Calculation {
    def divide(i : Int , j : Int): Int
  }
  class Divide extends Calculation {
    def divide(i: Int, j: Int): Int = try {
      i / j
    }
    catch {
      case ex: ArithmeticException =>
        ex.printStackTrace()
        0
    }




}
