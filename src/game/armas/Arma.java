package game.armas;

import enumeraciones.TipoArma;

public abstract class Arma{
    private TipoArma tipo;
    private int puntosDanyo;

    public Arma(TipoArma tipo, int puntosDanyo){
        this.tipo = tipo;
        this.puntosDanyo = puntosDanyo;
    }

    public int getPuntosDanyo(){
        return this.puntosDanyo;
    }

    public String getTipo(){
        return this.tipo.toString();
    }

    public void setPuntosDanyo(int puntosDanyo){
        this.puntosDanyo += puntosDanyo;
    }
}