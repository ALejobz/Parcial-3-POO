package Vehiculos

class carroLujoso extends Carro
{
    override var _ruedas : Int = 5
    override var _caballosFuerza : Double = 900
    override var _luces : Int = 10

    override def ruedas = _ruedas
    override def caballosFuerza = _caballosFuerza
    override def luces = _luces

    override def mostrar() : Unit =
    {
        println("Se creó un carro lujoso")
    }
}