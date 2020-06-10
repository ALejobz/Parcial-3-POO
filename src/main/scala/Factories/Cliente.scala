package Factories

object client extends App
{
    def encontrarFactory(fact : String) : abstractFactory =
    {
        fact match{
            case "Lujoso" => return new lujosoFactory
            case "Economico" => return new economicFactory
        } 
    }

    var fabricaEconomica : abstractFactory = encontrarFactory("Economico")
    var fabricaLujosa : abstractFactory = encontrarFactory("Lujoso")
    
    var MotoDucati = fabricaLujosa.crearMoto()
    MotoDucati.mostrar()

    
    var MotoEco = fabricaEconomica.crearMoto()
    MotoEco.mostrar()

    var carroFerrari = fabricaLujosa.crearCarro()
    carroFerrari.mostrar()

    var carroEco = fabricaEconomica.crearCarro()
    carroEco.mostrar()

    println("El auto lujoso tiene " + carroFerrari._ruedas+ " ruedas")
    println("El auto Economico tiene " +carroEco._ruedas + " ruedas")

    var camioneta = encontrarFactory("Economico").crearCamioneta()
    camioneta.mostrar()
}