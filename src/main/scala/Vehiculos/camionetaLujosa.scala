package Vehiculos

class camionetaLujosa extends Camioneta 
{
    override var _ruedas : Int = 7
    override var _capacidad : Int = 600
    override var _sillas : Int = 8

    override def ruedas = _ruedas
    override def capacidad = _capacidad
    override def sillas = _sillas

    override def mostrar() : Unit =
    {
        println("Se creó una camioneta lujosa")
    }
}