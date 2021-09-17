
  import cal.unit.Validators.Divide
  import org.scalatest.funsuite.AnyFunSuite

  class DivideTest extends  AnyFunSuite{
    val someOperation = new Divide
    // methods for validating Division
    test("Divide Testing")
    {
      val expectedResult = 2
      val expectedResults = 4
      val result = {
        someOperation.divide(4, 2);
      }
      val results = {
        someOperation.divide(8, 2);
      }
      assert(result == expectedResult)
      assert(results == expectedResults)
      println("Both Equal");
    }


}
