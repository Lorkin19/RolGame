package game.personajes;

import enumeraciones.TipoPersonaje;
import game.armas.Arma;
import game.monturas.Montura;

public class Soldado extends Personaje{

    public Soldado(String nombre, Arma arma, Montura montura){
        super(nombre, TipoPersonaje.Soldado, arma, montura);
    }
}