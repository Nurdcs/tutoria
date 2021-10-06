package modelo;



public class ClientesDTO {
	private String doccli;
	private String nomcli;
	private String apecli;
	private String celulra;
	private String correocli;
	private String sexo;
	private String  fechanaccli;
	public String getDoccli() {
		return doccli;
	}
	public void setDoccli(String doccli) {
		this.doccli = doccli;
	}
	public String getNomcli() {
		return nomcli;
	}
	public ClientesDTO() {
		super();
	}
	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}
	public String getApecli() {
		return apecli;
	}
	public void setApecli(String apecli) {
		this.apecli = apecli;
	}
	public String getCelulra() {
		return celulra;
	}
	public void setCelulra(String celulra) {
		this.celulra = celulra;
	}
	public String getCorreocli() {
		return correocli;
	}
	public void setCorreocli(String correocli) {
		this.correocli = correocli;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFechanaccli() {
		return fechanaccli;
	}
	public void setFechanaccli(String fechanaccli) {
		this.fechanaccli = fechanaccli;
	}
	public ClientesDTO(String doccli, String nomcli, String apecli, String celulra, String correocli, String sexo,
			String fechanaccli) {
		super();
		this.doccli = doccli;
		this.nomcli = nomcli;
		this.apecli = apecli;
		this.celulra = celulra;
		this.correocli = correocli;
		this.sexo = sexo;
		this.fechanaccli = fechanaccli;
	}
	
	
	
	
	
	
}