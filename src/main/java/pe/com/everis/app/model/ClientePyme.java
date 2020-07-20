package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ClientePyme")
public class ClientePyme {

	@Id
	private String idPyme;
	
	private String nomPyme;
	private String telPyme;
	private String correoPyme;
	private String dirPyme;
	private String nomRepLegalPyme;
	private String apeRepLegalPyme;
	private String dniRepLegalPyme;
	private String telRepLegarPyme;
	private String correoRepLegalPyme;
	
	public ClientePyme() {
		
	}

	
	
	public ClientePyme(String idPyme, String nomPyme, String telPyme, String correoPyme, String dirPyme,
			String nomRepLegalPyme, String apeRepLegalPyme, String dniRepLegalPyme, String telRepLegarPyme,
			String correoRepLegalPyme) {
		super();
		IdPyme = idPyme;
		this.nomPyme = nomPyme;
		this.telPyme = telPyme;
		this.correoPyme = correoPyme;
		this.dirPyme = dirPyme;
		this.nomRepLegalPyme = nomRepLegalPyme;
		this.apeRepLegalPyme = apeRepLegalPyme;
		this.dniRepLegalPyme = dniRepLegalPyme;
		this.telRepLegarPyme = telRepLegarPyme;
		this.correoRepLegalPyme = correoRepLegalPyme;
	}



	public String getIdPyme() {
		return IdPyme;
	}

	public void setIdPyme(String idPyme) {
		IdPyme = idPyme;
	}

	public String getNomPyme() {
		return nomPyme;
	}

	public void setNomPyme(String nomPyme) {
		this.nomPyme = nomPyme;
	}

	public String getTelPyme() {
		return telPyme;
	}

	public void setTelPyme(String telPyme) {
		this.telPyme = telPyme;
	}

	public String getCorreoPyme() {
		return correoPyme;
	}

	public void setCorreoPyme(String correoPyme) {
		this.correoPyme = correoPyme;
	}

	public String getDirPyme() {
		return dirPyme;
	}

	public void setDirPyme(String dirPyme) {
		this.dirPyme = dirPyme;
	}

	public String getNomRepLegalPyme() {
		return nomRepLegalPyme;
	}

	public void setNomRepLegalPyme(String nomRepLegalPyme) {
		this.nomRepLegalPyme = nomRepLegalPyme;
	}

	public String getApeRepLegalPyme() {
		return apeRepLegalPyme;
	}

	public void setApeRepLegalPyme(String apeRepLegalPyme) {
		this.apeRepLegalPyme = apeRepLegalPyme;
	}

	public String getDniRepLegalPyme() {
		return dniRepLegalPyme;
	}

	public void setDniRepLegalPyme(String dniRepLegalPyme) {
		this.dniRepLegalPyme = dniRepLegalPyme;
	}

	public String getTelRepLegarPyme() {
		return telRepLegarPyme;
	}

	public void setTelRepLegarPyme(String telRepLegarPyme) {
		this.telRepLegarPyme = telRepLegarPyme;
	}

	public String getCorreoRepLegalPyme() {
		return correoRepLegalPyme;
	}

	public void setCorreoRepLegalPyme(String correoRepLegalPyme) {
		this.correoRepLegalPyme = correoRepLegalPyme;
	}
	
	
	
}
