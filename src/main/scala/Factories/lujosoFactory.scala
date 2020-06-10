package Factories

import Vehiculos._

class lujosoFactory extends abstractFactory
{
    def crearMoto() : motoLujosa = 
    {
        return new motoLujosa
    }
    def crearCamioneta() : camionetaLujosa = 
    {
        return new camionetaLujosa
    }    
    def crearCarro() : carroLujoso =
    {
        return new carroLujoso
    }
}
