package game.monturas;

import enumeraciones.TipoMontura;

public abstract class Montura{
    private TipoMontura tipo;
    private float velocidad;

    public Montura(TipoMontura tipo, float velocidad){
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public String getTipo(){
        return this.tipo.toString();
    }

    public float duracionViaje(float distancia){
        if (distancia <= 0){
            return -1;
        }
        return distancia/velocidad;
    }
}