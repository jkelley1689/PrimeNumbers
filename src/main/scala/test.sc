

def isPrime(n: Int) = (n > 1) && ((2 until n) forall (n % _ != 0))

isPrime(1)
isPrime(2)
isPrime(3)
isPrime(4)
isPrime(5)
isPrime(111)
isPrime(137)
isPrime(47)
isPrime(139)
isPrime(1)
isPrime(0)
isPrime(6)


def isTwinPrime(n1 : Int, n2 : Int) = {
  ((n2 - n1 == 2) || (n1 - n2 == 2)) &&
    isPrime(n1) &&
    isPrime(n2)
}
isTwinPrime(137,139)
isTwinPrime(5,8)
isTwinPrime(6,8)
isTwinPrime(0,2)


def twinPrimeList(n : Int) : List[Int] = {
  n match{
    case x if x < 3 => Nil
    case _ => if(isTwinPrime(n - 2, n) || isTwinPrime(n + 2,n))
      n :: twinPrimeList(n - 1).reverse
    else twinPrimeList(n - 1).reverse
  }
}
twinPrimeList(50)

def goldbachsConjecture(n : Int) = {
  isEven(n) && (n > 2) match{
    case false => "number must be even and greater than 2"
    case true => goldbach(n)
  }

}


def goldbach(n :Int) = {
  val primes : List[Int] = (1 to n).toList.filter(x => isPrime(x))
  primes match {
    case head :: _ => if(primes.contains(n - head))
      println(n - head + " + " + head + "=" + n)
    case _ => "empty"
  }

}

def isEven(n : Int) = {
  n % 2 match{
    case 0 => true
    case _ => false
  }
}

goldbachsConjecture(28)






















