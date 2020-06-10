package Vehiculos

class camionetaEconomica extends Camioneta 
{
    override var _ruedas : Int = 6
    override var _capacidad : Int = 600
    override var _sillas : Int = 6

    override def ruedas = _ruedas
    override def capacidad = _capacidad
    override def sillas = _sillas

    override def mostrar() : Unit =
    {
        println("Se creó una camioneta economica")
    }


}