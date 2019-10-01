package game.monturas;

import enumeraciones.TipoMontura;
import interfaces.IMontura;

public class Dragon implements IMontura {

	@Override
	public TipoMontura getTipo() {
		// TODO Auto-generated method stub
		return TipoMontura.Dragon;
	}

	@Override
	public int getDuracionViaje(int distancia) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
