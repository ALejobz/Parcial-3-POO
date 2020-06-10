package Vehiculos

class motoLujosa extends Moto
{
    override var _ruedas :Int = 2
    override var _cilindraje : Int = 1000
    override var _luces : Int = 4

    override def ruedas = _ruedas
    override def cilindraje = _cilindraje
    override def luces = _luces

    override def mostrar() : Unit =
    {
        println("Se creó una moto Lujosa")
    }
 
}