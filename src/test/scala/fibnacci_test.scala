
  import cal.unit.Validators.fibnacci
  import org.scalatest.funsuite.AnyFunSuite

  class fibnacci_test extends AnyFunSuite {
    val r = new fibnacci
    test("Fibonacci Testing")
    {
      val ExpectedResult = 21
      val ExpectedResults = 34
      val result = r.fib1(8)
      val results = r.fib1(9)
      // Test case1
      assert(result == ExpectedResult)
      // Test case2
      assert(results == ExpectedResults)
      println("Both Equal");
    }



}
