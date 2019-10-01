package game.personajes;

import enumeraciones.Direccion;
import enumeraciones.TipoArma;
import enumeraciones.TipoMontura;
import enumeraciones.TipoPersonaje;
import game.armas.Arma;
import game.monturas.Montura;
import interfaces.IPersonaje;

public abstract class Personaje implements IPersonaje {
	String nombre;
	TipoPersonaje tipo;
	Arma arma;
	Montura montura;

	public Personaje(String nombre, TipoPersonaje tipo, Arma arma, Montura montura){
		this.nombre = nombre;
		this.tipo = tipo;
		this.arma = arma;
		this.montura = montura;
		if (tipo.equals(TipoPersonaje.Mago)){
			arma.setPuntosDanyo(50);
		}
	}
	
	@Override
	public void eligeArma(Arma arma) {
		// TODO Auto-generated method stub
		this.arma = arma;
	}

	@Override
	public void utilizaArma(){
		System.out.println("Arma: " + this.arma.getTipo() + ". Danyo: " + this.arma.getPuntosDanyo()+".");
	}

	@Override
	public void eligeMontura(Montura montura) {
		// TODO Auto-generated method stub
		this.montura = montura;
	}

	@Override
	public void utilizaMontura(int distancia, Direccion direccion) {
		// TODO Auto-generated method stub
		System.out.println("Te has desplazado " + distancia + " metros en " + montura.getDuracionViaje(distancia) +
				" minutos en direccion " + direccion.toString() + ".");
	}

	@Override
	public void info(){
		System.out.println("Tipo personaje: " + this.tipo + ". Nombre: " + this.nombre + ".\n" +
				"Arma: " + this.arma.getTipo() + ". Puntos danyo: " + this.arma.getPuntosDanyo() + ".\n" +
				"Montura: " + this.montura.getTipo() + ". Velocidad de desplazamiento: " + montura.getVelocidad() + " km/h.");
	}

}
