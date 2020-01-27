

object _2 {
  def main(args: Array[String]) {
    //1
    def patternMatching(x: String): String = x match {
        case "Poniedzialek" => "Praca"
        case "Wtorek" => "Praca"
        case "Sroda" => "Praca"
        case "Czwarte" => "Praca"
        case "Piątek" => "Praca"
        case "Sobota" => "Weekend"
        case "Niedziela" => "Weekend"
        case _ => "Nie ma takiego dnia"
    }
    //2
    val kb = new KontoBankowe(150)
    //3
    val o1 = new Osoba("Jan","Matejko")
    val o2 = new Osoba("Jan","Nowak")
    val o3 = new Osoba("Krzysztof","Barteczko")
    def przywitanie(o: Osoba) = o match
    {
      case Osoba("Krzysztof", _) => println("Dzień dobry Panie kb")
      case Osoba(_,"Matejko") => println("Witam sławnego malarza")
      case Osoba(imie, nazwisko) => println(s"Hey, $imie $nazwisko")  
    }
    //4
    def zad4(wartosc: Integer): Integer = {
      return wartosc*2
    }


    def zad4x3(wartosc: Integer, f: (Integer) => Integer): Integer = {
      return f(f(f(wartosc)))
    }
    //5
    
    
    println("zad 1")
    println("Poniedzialek => "+patternMatching("Poniedzialek"))
    println("xD => "+patternMatching("xD"))
    println("zad 2")
    kb.wyplata(50)
    kb.wplata(150)
    println(kb.getStanKonta)
    println("zad 3")
    przywitanie(o1)
    przywitanie(o2)
    przywitanie(o3)
    println("zad 4")
    println(zad4x3(12,zad4))
    println("zad 5")
    
  }
}