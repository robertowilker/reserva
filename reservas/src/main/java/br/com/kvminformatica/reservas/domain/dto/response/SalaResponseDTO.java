package br.com.kvminformatica.reservas.domain.dto.response;

public class SalaResponseDTO {

	private String id;
	private String nomeDaSala;
	private String andar;
	
	public SalaResponseDTO(String id, String nomeDaSala, String andar) {
		this.id = id;
		this.nomeDaSala = nomeDaSala;
		this.andar = andar;
	}

	public String getId() {
		return id;
	}
	
	public String getNomeDaSala() {
		return nomeDaSala;
	}

	public String getAndar() {
		return andar;
	}
}
