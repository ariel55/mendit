Modelo de Dominio
=================

El domino del problema se trata de una aplicación web que interactua con el usuario así
como lo hacen las redes sociales como por ejemplo Facebook, pero en esta oportunidad 
ese tipo de interacción tendrá como tema principal, tema publicación, etc a la 
seguridad de los habitantes de un determinado barrio o villa. A esta interacción se 
le agregara organismos estatales de seguridad vial, social, etc. Se tendrá casi la 
misma interacción que el usuario tiene con Facebook, pero pudiendo agregar funcionalidad
innovadora, como por ejemplo la localización rápida de estos organismos estatales
antes nombrados mediante dispositivos que un ciudadano acostumbra utilizar. Tal 
localización se hará a través de un mapa gps.
Se contara con la incorporación practica y pedagógica de sistemas de educación
pudiendo así incorporar una cultura de "Nos cuidamos entre todos". Para que la
interacción sea muy bien aceptada y incorporada en la vida de las personas, se
agregara en el sitio de la aplicación uno o mas personajes que tendrán los rostros
de las personas que lo están cuidando(de manera confiable).


## Modelo de clases resultante

### Comentario ###
- [String]: [Nombre Atributo]
- [Date]: 	[date]
- [Usuario]:[usuario]
- [Alerta]: [alerta]
- [String]: [nivelDeAlerta]

### UbicacionGeografica ###
- [String]: [ciudad]
- [String]: [barrio]
- [String]: [calle]
- [String]: [latitud]
- [String]: [longitud]

### Usuario ###
- [String]: [nombre]
- [String]: [password]
- [byte[]]: [foto]
- [String]: [email]
- [String]: [telefono]
- [String]: [celular]
- [List de EstadoUsuario]: [estados]
- [List<Alerta>]: [alertas]
- [List<Comentario>]: [comentariosResividos]
- [List<Comentario>]: [comentariosEnviados]
- [List<UbicacionGeografica>]: [comentariosEnviados]

### Alerta ###
- [List<String>]: [recibidoresDeAlerta]
- [Date]: 	[date]
- [Usuario]:[usuario]
- [UbicacionGeografica]: [ubicacionGeografica]

### EstadoUsuario ###
- [String]: [nombre]
- [bool]: [activado]

