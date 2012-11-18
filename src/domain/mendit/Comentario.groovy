package mendit

import mendit.Alerta
import mendit.Usuario

class Comentario {

	String mensaje
	Integer puntuacion
	Date date
	Usuario usuario
	Alerta alerta
	
    static constraints = {
		mensaje (nullable: true)
		puntuacion(nullable:true)
		date(nullable:true)
		usuario(blank: false)
		alerta(blank: false)
    }
}
