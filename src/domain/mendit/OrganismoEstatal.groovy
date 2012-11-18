package mendit

import java.util.List;
import mendit.UbicacionGeografica

class OrganismoEstatal {

	String nombre
	List<String> alertasParaSolucionar = new ArrayList<String>()
	UbicacionGeografica ubicacionGeografica
	
    static constraints = {
		nombre(size: 3..50, nullable:true)
		alertasParaSolucionar(nullable:true)
		ubicacionGeografica(nullable: true)
    }
	
	void destivarAlerta(String alerta){
		//segun las alertas para solucionar buscar la que esta activa y desactivarla
		//segun el nombre de alerta parasado por parametro
	}
}
