package game.monturas;

import enumeraciones.TipoMontura;
import interfaces.IMontura;

public class Caballo extends Montura {
	public Caballo(){
		super(TipoMontura.Caballo, 50.0);
	}
}
