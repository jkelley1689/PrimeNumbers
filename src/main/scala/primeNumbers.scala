object primeNumbers {


  val number = new PNumbers
  def main(args: Array[String]): Unit = {

    println(number.isPrime(5))
    println(number.isTwinPrime(3,5))
    println(number.twinPrimeList(50).mkString(","))
    number.goldbachsConjecture(2918)

  }

}
