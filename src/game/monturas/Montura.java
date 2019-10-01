package game.monturas;

import enumeraciones.TipoMontura;
import interfaces.IMontura;

public abstract class Montura implements IMontura {
    private TipoMontura tipo;
    private double velocidad;

    public Montura(TipoMontura tipo, double velocidad){
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public double getVelocidad(){
        return this.velocidad;
    }

    @Override
    public String getTipo(){
        return this.tipo.toString();
    }

    @Override
    public double getDuracionViaje(int distancia){
        if (distancia <= 0){
            return -1;
        }
        double d = distancia;
        return ((d/1000)/velocidad) * 60;
    }
}