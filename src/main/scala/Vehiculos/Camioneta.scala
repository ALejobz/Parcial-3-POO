package Vehiculos

abstract class Camioneta 
{
    var _ruedas : Int 
    var _capacidad : Int
    var _sillas : Int

    def ruedas = _ruedas
    def capacidad = _capacidad
    def sillas = _sillas

    def mostrar() : Unit
}