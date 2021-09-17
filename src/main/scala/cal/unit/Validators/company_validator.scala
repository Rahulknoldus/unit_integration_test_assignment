package cal.unit.Validators


  import cal.unit.test.database;
  import com.test.module.company;

class company_validator {

    def companyIsValid(company: company): Boolean = {
      val cmp= new database()
      for((key,value)<-cmp.companies){
        if( key == company.name )
          return true
      }
      false
    }



}
