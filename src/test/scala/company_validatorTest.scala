import cal.unit.Validators.company_validator
import com.test.module.company
import org.scalatest.flatspec.AnyFlatSpec

import scala.Console.in

class company_validatorTest extends AnyFlatSpec {
    "Company Name" should "exits" in{
      // Company should not already exist in the Database
      val companyObject = new company_validator()
      val company =new company("Nokia","abc@gmail.com","noida");
      val companys =new company("Oppo","abc@gmail.com","UP");
      // Compare that company already exists in Database
      // Test case1
      assert(companyObject.companyIsValid(company)==false)
      // Test case2
      assert(companyObject.companyIsValid(companys)==false)
    }


}
