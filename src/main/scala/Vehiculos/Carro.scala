package Vehiculos

abstract class Carro
{
    var _ruedas : Int
    var _caballosFuerza : Double
    var _luces : Int

    def ruedas = _ruedas
    def caballosFuerza = _caballosFuerza
    def luces = _luces

    def mostrar() : Unit

}