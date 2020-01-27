



object _1 {
  
  val days = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
  //2
  def reku(days: List[String]): String = {
    if(days.length==1)
      return days.head;
    days.head + ", " + reku(days.tail);
  }
  def rekuBack(days: List[String]): String = {
    if(days.length==1)
      return days.head;
    rekuBack(days.tail) + ", " + days.head
  }
  //3
  def tailrec(days: List[String], result: String): String = {
    if(days.length == 0)  return result;
    else return tailrec(days.tail,result + days.head + ", ")
  }
  def main(args: Array[String]) {
    //1
    println("zad 1")
    var day = ""
    for(x <- days)
      day += x + ", "
    println(day)
    var day_P = ""
    for(x <- days if x.startsWith("P"))
      day_P += x + ", "
    println(day_P)
    var i = 0
    var day_w = ""
    while(i<days.length){
      day_w += days(i)
      if(i<days.length-1)
        day_w += ", "
      i += 1
    }
    //4
    var foldl = days.tail.foldLeft(days.head)((m,n) => m + ", " + n)
    var foldr = days.foldRight("")((m,n) => m + ", " + n)
    var foldl_P = days.foldLeft("")((m,n) => m + (if(n.startsWith("P")) n+", " else ""))
    //5
    val products = Map("banana" -> 5,"apple" -> 2)
    val productsDiscount = products.mapValues(_*0.9)
    //6
    val krotka = ('s', "s12997", 12997)
    def wypiszDane(t: (Char,String, Int)) {
      println(t+"\n")
    }
    wypiszDane(krotka)
    //7
    //8
    val nums : List[Int] = List(0,1,2,3,4,5,6,0,7,8,9,0,0,0,0)      
    
    def wycinanieZer(list:List[Int]):List[Int]={
      return list.filter(_.!=(0))
    }
    //9
    val numbers = Map("1" -> 1,"2" -> 2, "3" -> 3, "4" -> 4, "5" -> 5, "6" -> 6, "7" -> 7, "8" -> 8, "9" -> 9)
    val numbers1 = numbers.mapValues(_+1)
    //10
    def zad10Funkcja(liczba : List[Int]):List[Int]={
      return (liczba.filter(elem => elem >= -5 && elem<= 12)).map(_.abs)
    }
    val liczby : List[Int] = List(1,2,4,556,1,0,3, -3,-6, 12);
    val odp10 = zad10Funkcja(liczby)
    
    println(day_w)
    println("zad 2")
    println(reku(days))
    println(rekuBack(days))
    println("zad 3")
    var result = "";
    println(tailrec(days, result))
    println("zad 4")
    println(foldl)
    println(foldr)
    println(foldl_P)
    println("zad 5")
    println(productsDiscount)
    println("zad 6")
    krotka.productIterator.foreach(x=>println(x))
    println("zad 7")
    println("zad 8")
    println(wycinanieZer(nums))
    println("zad 9")
    println(numbers1)
    println("zad 10")
    println(odp10)
    
  }
  
}