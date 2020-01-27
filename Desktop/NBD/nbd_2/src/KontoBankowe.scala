

class KontoBankowe(konto:Double){
  private var stan = konto
  
  def this() = this(0)
  
  def wplata(wplata:Double){
    stan += wplata
    println("Wpłacono: "+ wplata +" Stan konta wynosi: "+stan)
  }
  
  def wyplata(wyplata:Double){
    if(wyplata <= stan){
      stan -= wyplata
      println("Wypłacono: "+ wyplata +" Stan konta wynosi: "+stan)
    }else{
      println("Za malo srodkow na koncie")
    }
  }
  
  def getStanKonta = stan
}