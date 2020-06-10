package Vehiculos

class carroEconomico extends Carro
{
    override var _ruedas : Int = 4
    override var _caballosFuerza : Double = 400
    override var _luces : Int = 6

    override def ruedas = _ruedas
    override def caballosFuerza = _caballosFuerza
    override def luces = _luces

    override def mostrar() : Unit =
    {
        println("Se creó un carro economico")
    }


}