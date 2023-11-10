package arquitecturaBaseDeDatos.clases;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Usuario {
	 @JsonProperty("id_usuario")
	private long id_usuario;
	 @JsonProperty("dni_usuario")
	private String dni_usuario;
	 @JsonProperty("nombre_usuario")
	private String nombre_usuario;
	 @JsonProperty("apellidos_usuario")
	private String apellidos_usuario;
	 @JsonProperty("tlf_usuario")
	private String tlf_usuario;
	 @JsonProperty("email_usuario")
	private String email_usuario;
	 @JsonProperty("clave_usuario")
	private String clave_usuario;
	 @JsonProperty("establoqueado_usuario")
	private boolean esta_bloqueado_usuario;
	 @JsonProperty("fch_fin_bloqueo_usuario")
	private Calendar fch_fin_bloqueo_usuario;
	 @JsonProperty("fch_alta_usuario")
	private Calendar fch_alta_usuario;
	 @JsonProperty("fch_baja_usuario")
	private Calendar fch_baja_usuario;
	 @JsonProperty("acceso")
	Acceso acceso;
	
	public Usuario(long id_usuario, String dni_usuario, String nombre_usuario, String apellidos_usuario,
			String tlf_usuario, String email_usuario, String clave_usuario, boolean esta_bloqueado_usuario,
			Calendar fch_fin_bloqueo_usuario, Calendar fch_alta_usuario, Calendar fch_baja_usuario,
			arquitecturaBaseDeDatos.clases.Acceso acceso) {
		super();
		this.id_usuario = id_usuario;
		this.dni_usuario = dni_usuario;
		this.nombre_usuario = nombre_usuario;
		this.apellidos_usuario = apellidos_usuario;
		this.tlf_usuario = tlf_usuario;
		this.email_usuario = email_usuario;
		this.clave_usuario = clave_usuario;
		this.esta_bloqueado_usuario = esta_bloqueado_usuario;
		this.fch_fin_bloqueo_usuario = fch_fin_bloqueo_usuario;
		this.fch_alta_usuario = fch_alta_usuario;
		this.fch_baja_usuario = fch_baja_usuario;
		this.acceso = acceso;
	}

	public Usuario() {
		super();
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", dni_usuario=" + dni_usuario + ", nombre_usuario="
				+ nombre_usuario + ", apellidos_usuario=" + apellidos_usuario + ", tlf_usuario=" + tlf_usuario
				+ ", email_usuario=" + email_usuario + ", clave_usuario=" + clave_usuario + ", esta_bloqueado_usuario="
				+ esta_bloqueado_usuario + ", fch_fin_bloqueo_usuario=" + fch_fin_bloqueo_usuario
				+ ", fch_alta_usuario=" + fch_alta_usuario + ", fch_baja_usuario=" + fch_baja_usuario + ", acceso="
				+ acceso + "]";
	}


	public long getId_usuario() {
		return id_usuario;
	}

	public String getDni_usuario() {
		return dni_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public String getApellidos_usuario() {
		return apellidos_usuario;
	}

	public String getTlf_usuario() {
		return tlf_usuario;
	}

	public String getEmail_usuario() {
		return email_usuario;
	}

	public String getClave_usuario() {
		return clave_usuario;
	}

	public boolean isEsta_bloqueado_usuario() {
		return esta_bloqueado_usuario;
	}

	public Calendar getFch_fin_bloqueo_usuario() {
		return fch_fin_bloqueo_usuario;
	}

	public Calendar getFch_alta_usuario() {
		return fch_alta_usuario;
	}

	public Calendar getFch_baja_usuario() {
		return fch_baja_usuario;
	}

	public Acceso getAcceso() {
		return acceso;
	}

}
