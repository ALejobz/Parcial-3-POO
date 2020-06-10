package Factories

import Vehiculos._
class economicFactory extends abstractFactory
{
    def crearMoto() : motoEconomica = 
    {
        return new motoEconomica
    }
    def crearCamioneta() : camionetaEconomica = 
    {
        return new camionetaEconomica
    }    
    def crearCarro() : carroEconomico =
    {
        return new carroEconomico
    }
}