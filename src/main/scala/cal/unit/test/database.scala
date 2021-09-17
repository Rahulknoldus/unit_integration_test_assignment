package cal.unit.test
  import com.test.module.company

  import scala.collection.immutable.HashMap

  class database {

    val knoldusCompany: company = company("Knoldus", "knoldus@gmail.com", "Noida")
    val samsungCompany: company = company("Samsung", "samsung@gmail.com", "Noida")
    val companies: HashMap[String, company] = HashMap("Knoldus" -> knoldusCompany, "Samsung" -> samsungCompany)

    def getCompanyByName(name: String): Option[company] = companies.get(name)




}
