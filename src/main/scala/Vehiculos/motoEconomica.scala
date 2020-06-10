package Vehiculos

class motoEconomica extends Moto
{
    override var _ruedas :Int = 2
    override var _cilindraje : Int = 150
    override var _luces : Int = 2

    override def ruedas = _ruedas
    override def cilindraje = _cilindraje
    override def luces = _luces

    override def mostrar() : Unit =
    {
        println("Se creó una moto economica")
    }
 
}