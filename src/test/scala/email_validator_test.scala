
  import cal.unit.Validators.email_validators
  import org.scalatest.flatspec.AnyFlatSpec

  class email_validator_test extends AnyFlatSpec {
    "Company Name" should "exits" in{
      val obj =new email_validators()
      // Checks that Email is valid or not valid
      // Test case1
      assert(obj.isValid("abc@gmail.com")==true)
      // Test case2
      assert(obj.isValid("philips123@gmail.com")==true)
      // Test case3
      assert(obj.isValid("knoldus@gmail.com")==true)
      // Test case4


        assert(obj.existInDb("xyz@gmail.com")==false)
    }
  }