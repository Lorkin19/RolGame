package game.personajes;

import enumeraciones.TipoPersonaje;
import game.armas.Arma;
import game.monturas.Montura;

public class Caballero extends Personaje{
    public Caballero(String nombre, Arma arma, Montura montura){
        super(nombre, TipoPersonaje.Caballero, arma, montura);
    }
}