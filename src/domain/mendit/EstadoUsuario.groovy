package mendit

class EstadoUsuario {
	
	String nombre
	Boolean activado

    static constraints = {
		nombre(blank : false, nullable: true)
		activado(unique:false)
    }
}
