package mendit

import java.util.List;
import mendit.Alerta
import mendit.Usuario
import mendit.UbicacionGeografica

class Alerta {

	List<String> organismosEstatalesResponzables = new ArrayList<String>()
	String responzableActivado  //nombre de un amigo protector o un oganizmos estatal
	Date dateInicio
	Date dateFin
	Usuario usuario
	UbicacionGeografica ubicacionGeografica
	Integer nivel
	
    static constraints = {
		organismosEstatalesResponzables(nullable: true)
		responzableActivado(nullable:true)
		dateInicio(nullable:true)
		dateFin(nullable:true)
		usuario(blank: false)
		ubicacionGeografica(nullable: true)
		nivel(nullable:true)
    }
}
