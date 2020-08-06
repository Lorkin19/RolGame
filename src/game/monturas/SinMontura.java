package game.monturas;

import enumeraciones.TipoMontura;
import interfaces.IMontura;

public class SinMontura extends Montura {
	public SinMontura(){
		super(TipoMontura.SinMontura, 3);
	}
}
