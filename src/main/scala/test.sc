

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



def isTwinPrime(n1 : Int, n2 : Int) = {
  ((n2 - n1 == 2) || (n1 - n2 == 2)) &&
    isPrime(n1) &&
    isPrime(n2)
}
isTwinPrime(137,139)
isTwinPrime(5,8)
isTwinPrime(6,8)
isTwinPrime(0,2)


var res = Boolean


var twinPrimeList = List[Int]()

5 to 14 by 3
(5 until 14).toList




/*def twinPrimeList(n : Int) : List[Int] = {
  (2 until n).toList

  var i = 2
  var j = i + 2

  isTwinPrime(i,j) match{
    case true => i :: j :: twinPrimeList
    case false

  }*/

  def twinPrime(n : Int) : List[Int] = {

    for(i <- 0 until n){
      val j = i + 2
      isTwinPrime(i,j) match{
        case true => i :: j :: twinPrimeList
        case false => twinPrimeList ::: twinPrime(n)
      }
    }
    twinPrimeList
  }
twinPrime(10)














