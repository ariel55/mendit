package mendit

import mendit.EstadoUsuario
import mendit.Alerta
import mendit.Comentario
import mendit.UbicacionGeografica

class Usuario {
	String nombre
	String password
	byte[] foto
	String homepage
	String email
	String telefonoCasa
	String telefonoTrabajo
	String celular
	List<EstadoUsuario> estados = new ArrayList<EstadoUsuario>()
	List<Alerta> alertas = new ArrayList<Alerta>()
	List<Comentario> comentariosRecibidos = new ArrayList<Comentario>()
	List<Comentario> comentariosEnviados = new ArrayList<Comentario>()
	List<Comentario> comentariosEliminados = new ArrayList<Comentario>()
	UbicacionGeografica ubicacionGeograficaCasa
	Boolean alertaActivada //es activada por el usuario y desactivada por el organizmos estatal
	
    static constraints = {
		nombre(size: 3..50, nullable:true)
		password(size: 3..15, nullable:true)
		foto(nullable: true)
		homepage(url: true, nullable: true)
		email(email: true, nullable: true)
		telefonoCasa(nullable: true)
		telefonoTrabajo(nullable: false)
		celular(nullable: true)
		estados(nullable: true)
		alertas(nullable: true)
		comentariosRecibidos(nullable: true)
		comentariosEnviados(nullable:true)
		comentariosEliminados(nullable:true)
		ubicacionGeograficaCasa(nullable: true)
		alertaActivada(nullable:true)
    }
	
	void activarAlerta(){
	
	}
}
