package mendit

class UbicacionGeografica {

	String pais
	String ciudad
	String barrio
	String calle
	String calleDesde
	String calleHasta
	Integer alturaCalle
	String latitud
	String longitud
	
    static constraints = {
		pais(maxsize: 60,nullable:true)
		ciudad(maxsize: 60,nullable:true)
		barrio(maxsize: 60, nullable:true)
		calle(maxsize: 60, nullable:true)
		calleDesde(maxsize: 60, nullable:true)
		calleHasta(maxsize: 60, nullable:true)
		alturaCalle(nullable:true)
		latitud(maxsize: 10, nullable:true)
		longitud(maxsize: 10, nullable:true)
	}
}
