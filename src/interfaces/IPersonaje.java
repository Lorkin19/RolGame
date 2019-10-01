package interfaces;

import enumeraciones.Direccion;
import enumeraciones.TipoArma;
import enumeraciones.TipoMontura;
import game.armas.Arma;
import game.monturas.Montura;

public interface IPersonaje {
	void eligeArma(Arma arma);
	void utilizaArma();
	void eligeMontura(Montura montura);
	void utilizaMontura(int distancia, Direccion direccion);
	void info();
}
