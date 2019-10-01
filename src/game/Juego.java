package game;

import enumeraciones.Direccion;
import game.armas.Arco;
import game.armas.Arma;
import game.armas.Desarmado;
import game.armas.Espada;
import game.monturas.Caballo;
import game.monturas.Dragon;
import game.monturas.Montura;
import game.monturas.SinMontura;
import game.personajes.Caballero;
import game.personajes.Mago;
import game.personajes.Personaje;
import game.personajes.Soldado;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de tu personaje: ");
        String nombre = sc.nextLine();

        System.out.println("Escoge tu personaje:\n" +
                "1. Caballero\n" +
                "2. Mago\n" +
                "3. Soldado\n" +
                "Pulsa 1, 2 o 3 para escoger tu personaje.");
        int personaje = sc.nextInt();

        System.out.println("Escoge tu arma:\n" +
                "1. Espada\n" +
                "2. Arco\n" +
                "3. Desarmado\n" +
                "Pulsa 1, 2 o 3 para escoger tu arma.");
        int arma = sc.nextInt();

        System.out.println("Escoge tu montura:\n" +
                "1. Caballo\n" +
                "2. Dragon\n" +
                "3. Sin montura\n" +
                "Pulsa 1, 2 o 3 para escoger tu montura.");
        int montura = sc.nextInt();

        Montura m;
        Arma a;
        Personaje p;

        switch (arma){
            case 1:
                a = new Espada();
                break;
            case 2:
                a = new Arco();
                break;
            case 3: default:
                a = new Desarmado();
                break;
        }

        switch (montura){
            case 1:
                m = new Caballo();
                break;
            case 2:
                m = new Dragon();
                break;
            case 3: default:
                m = new SinMontura();
                break;
        }

        switch(personaje){
            case 1:
                p = new Caballero(nombre, a, m);
                break;
            case 2:
                p = new Mago(nombre, a, m);
                break;
            case 3: default:
                p = new Soldado(nombre, a, m);
                break;
        }


        p.info();
        p.utilizaMontura(5000, Direccion.NORTE);
        p.utilizaArma();

        /*System.out.println("¿Qué deseas hacer ahora?\n" +
                "1. Salir." +
                "2. Continuar.");*/

        sc.close();
    }
}
