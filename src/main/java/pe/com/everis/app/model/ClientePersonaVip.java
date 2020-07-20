package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ClientePersonaVip")
public class ClientePersonaVip {

	@Id
	private String idPersonaVip;
	
	private String nomPersonaVip;
	private String apePersonaVip;
	private String docPersonaVip;
	private String telPersonaVip;
	private String dirPersonaVip;
	private String correoPersonaVip;
	
	public ClientePersonaVip() {
		
	}
	
	public ClientePersonaVip(String idPersonaVip, String nomPersonaVip, String apePersonaVip, String docPersonaVip,
			String telPersonaVip, String dirPersonaVip, String correoPersonaVip) {
		super();
		IdPersonaVip = idPersonaVip;
		this.nomPersonaVip = nomPersonaVip;
		this.apePersonaVip = apePersonaVip;
		this.docPersonaVip = docPersonaVip;
		this.telPersonaVip = telPersonaVip;
		this.dirPersonaVip = dirPersonaVip;
		this.correoPersonaVip = correoPersonaVip;
	}
	public String getIdPersonaVip() {
		return IdPersonaVip;
	}
	public void setIdPersonaVip(String idPersonaVip) {
		IdPersonaVip = idPersonaVip;
	}
	public String getNomPersonaVip() {
		return nomPersonaVip;
	}
	public void setNomPersonaVip(String nomPersonaVip) {
		this.nomPersonaVip = nomPersonaVip;
	}
	public String getApePersonaVip() {
		return apePersonaVip;
	}
	public void setApePersonaVip(String apePersonaVip) {
		this.apePersonaVip = apePersonaVip;
	}
	public String getDocPersonaVip() {
		return docPersonaVip;
	}
	public void setDocPersonaVip(String docPersonaVip) {
		this.docPersonaVip = docPersonaVip;
	}
	public String getTelPersonaVip() {
		return telPersonaVip;
	}
	public void setTelPersonaVip(String telPersonaVip) {
		this.telPersonaVip = telPersonaVip;
	}
	public String getDirPersonaVip() {
		return dirPersonaVip;
	}
	public void setDirPersonaVip(String dirPersonaVip) {
		this.dirPersonaVip = dirPersonaVip;
	}
	public String getCorreoPersonaVip() {
		return correoPersonaVip;
	}
	public void setCorreoPersonaVip(String correoPersonaVip) {
		this.correoPersonaVip = correoPersonaVip;
	}
	
	
}
