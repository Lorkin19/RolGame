package interfaces;

import enumeraciones.TipoMontura;

public interface IMontura {
	TipoMontura getTipo();
	int getDuracionViaje(int distancia);
}
