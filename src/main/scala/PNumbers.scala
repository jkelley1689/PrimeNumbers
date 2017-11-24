class PNumbers {

  def isPrime(n: Int) = (n > 1) && ((2 until n) forall (n % _ != 0))

  def isTwinPrime(n1 : Int, n2 : Int) = {
    ((n2 - n1 == 2) || (n1 - n2 == 2)) &&
      isPrime(n1) &&
      isPrime(n2)
  }

  def twinPrimeList(n : Int) : List[Int] = {
    n match{
      case x if x < 3 => Nil
      case _ => if(isTwinPrime(n - 2, n) || isTwinPrime(n + 2,n))
        n :: twinPrimeList(n - 1).reverse
      else twinPrimeList(n - 1).reverse
    }
  }
  def goldbachsConjecture(n : Int) = {
    val primes : List[Int] = (1 to n).toList.filter(x => isPrime(x))
    isEven(n) && (n > 2) match{
      case false => println("number must be even and greater than 2")
      case true => goldbach(n,primes)
    }

  }


  def goldbach(n :Int, primes : List[Int]) : Unit = {
    primes match {
      case head :: _ => if(primes.contains(n - head))
        println(n - head + " + " + head + " = " + n)
      else goldbach(n,primes.tail)
      case _ =>
    }

  }

  def isEven(n : Int) = {
    n % 2 match{
      case 0 => true
      case _ => false
    }
  }

}
