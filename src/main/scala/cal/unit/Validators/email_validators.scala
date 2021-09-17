package cal.unit.Validators


  import java.util.regex.Pattern;
  import cal.unit.test.database;

class email_validators {
    def isValid(email: String): Boolean = {
      val emailRegex = "^[a-zA-Z0-9_+&-]+(?:\\." + "[a-zA-Z0-9_+&-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"
      val pat = Pattern.compile(emailRegex)
      if (email == null) return false
      pat.matcher(email).matches
    }

    def existInDb(emailId: String): Boolean = {
      val cmp = new database()
      for ((key, value) <- cmp.companies) {
        if (value.emailId == emailId)
          return true
      }
      false
    }


  object Main{
    def main(args:Array[String]):Unit={
      val obj = new email_validators()
      println(obj.isValid("pqrsxyz21@gmail.com"))
      println(obj.existInDb("xyzert55@gmail.com"))
    }
  }


}
