package cal.unit.Validators

class email_varify {

  def containsNoSpecialChars(string: String): Boolean = {
    val pattern = "^[a-zA-Z0-9@.]*$".r
    val w = pattern.findAllIn(string).mkString.length == string.length
    val x = string.contains("@");
    val segments = string.split("@")
    // Grab the last segment
    val document = segments(segments.length - 1)
    val y = pattern.findAllIn(document).mkString.length == document.length
    val z = string.contains(".com") | string.contains(".net") | string.contains(".org");
    println(z);
    val a =  w & x & y;
    return a;
  }


}
