package cal.unit.request
import com.test.module.company;
import cal.unit.Validators.company_validator
class comany_implementation {

  class CompanyImpl(companyValidator: company_validator) {
    def createCompany(company: company): Option[String] = {
      if (companyValidator.companyIsValid(company)) Option(company.name)
      else None
    }
  }

}
