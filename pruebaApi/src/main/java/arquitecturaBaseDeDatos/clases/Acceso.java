package arquitecturaBaseDeDatos.clases;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Acceso {
	@JsonProperty("id_acceso")
	private long id_acceso;
	@JsonProperty("codigo_acceso")
	private String codigo_acceso;
	@JsonProperty("descripcion")
	private String descripcion;

	public Acceso(long id_acceso, String codigo_acceso, String descripcion) {
		super();
		this.id_acceso = id_acceso;
		this.codigo_acceso = codigo_acceso;
		this.descripcion = descripcion;
	}

	public Acceso() {
		super();
	}
	
	
}
