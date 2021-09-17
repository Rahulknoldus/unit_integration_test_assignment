package cal.unit.request


  import com.test.module.employee;
  import cal.unit.Validators.emplyee_validator

class employee_implementation {

  class EmployeeImpl(employeeValidator: emplyee_validator) {

    def createEmployee(Employee: employee): Option[String] = {
      if (employeeValidator.employeeIsValid(Employee)) Option(Employee.emailId)
      else None
    }
  }


}
