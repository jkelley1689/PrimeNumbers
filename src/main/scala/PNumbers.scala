class PNumbers {

  var twinPrimeList = List[Int]()

  def isPrime(n: Int) = !((2 until n-1) forall (n % _ == 0))

  def isTwinPrime(n1 : Int, n2 : Int) = {
    (n1 > 1) && (n2 > 1) && (n2 - n1 == 2) &&
    isPrime(n1) &&
    isPrime(n2)
  }

  def twinPrimeList(n : Int) : List[Int] = {


  }

}
