package Vehiculos

abstract class Moto
{
    var _ruedas :Int
    var _cilindraje : Int
    var _luces : Int

    def ruedas = _ruedas
    def cilindraje = _cilindraje
    def luces = _luces
    
    def mostrar() : Unit =
    {
        println("Muestra normal")
    }
}