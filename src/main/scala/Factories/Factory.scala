package Factories

import Vehiculos._

trait abstractFactory
{
    def crearMoto() : Moto
    def crearCamioneta() : Camioneta    
    def crearCarro() : Carro
    

}

