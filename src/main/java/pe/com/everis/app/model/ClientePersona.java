package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ClientePersona")
public class ClientePersona {

	@Id
	private String idPersona;
	
	private String nomPersona;
	private String apePersona;
	private String docPersona;
	private String telPersona;
	private String dirPersona;
	private String correoPersona;
	
	public ClientePersona() {
		
	}

	
	
	public ClientePersona(String idPersona, String nomPersona, String apePersona, String docPersona, String telPersona,
			String dirPersona, String correoPersona) {
		super();
		this.idPersona = idPersona;
		this.nomPersona = nomPersona;
		this.apePersona = apePersona;
		this.docPersona = docPersona;
		this.telPersona = telPersona;
		this.dirPersona = dirPersona;
		this.correoPersona = correoPersona;
	}



	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getNomPersona() {
		return nomPersona;
	}

	public void setNomPersona(String nomPersona) {
		this.nomPersona = nomPersona;
	}

	public String getApePersona() {
		return apePersona;
	}

	public void setApePersona(String apePersona) {
		this.apePersona = apePersona;
	}

	public String getDocPersona() {
		return docPersona;
	}

	public void setDocPersona(String docPersona) {
		this.docPersona = docPersona;
	}

	public String getTelPersona() {
		return telPersona;
	}

	public void setTelPersona(String telPersona) {
		this.telPersona = telPersona;
	}

	public String getDirPersona() {
		return dirPersona;
	}

	public void setDirPersona(String dirPersona) {
		this.dirPersona = dirPersona;
	}

	public String getCorreoPersona() {
		return correoPersona;
	}

	public void setCorreoPersona(String correoPersona) {
		this.correoPersona = correoPersona;
	}
	
	
}
