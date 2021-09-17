class email_test {
  import cal.unit.Validators.email_varify;
  import org.scalatest.funsuite.AnyFunSuite
  import org.scalatestplus.mockito.MockitoSugar

  class EmailTest extends  AnyFunSuite with MockitoSugar{
    val i = new email_varify
    test("Email Testing")
    {
      val expectedResult = true;
      // Test case1
      val result = i.containsNoSpecialChars("AaBaCcD@.org");
      // Test case2
      val results = i.containsNoSpecialChars("xyz8@.com");
      assert(result == expectedResult)
      assert(results == expectedResult)
      println("Email Verified");
    }


  }
}
