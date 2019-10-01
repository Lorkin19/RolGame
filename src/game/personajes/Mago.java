package game.personajes;

import enumeraciones.TipoPersonaje;
import game.armas.Arma;
import game.monturas.Montura;

public class Mago extends Personaje{

    public Mago(String nombre, Arma arma, Montura montura){
        super(nombre, TipoPersonaje.Mago, arma, montura);
    }


}