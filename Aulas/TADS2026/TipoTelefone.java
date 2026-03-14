package TADS2026;

public enum TipoTelefone {

	CELULAR("Telefone Celular"),
	FIXO("Telefone fixo"),
	PUBLICO("Telefone Publico");
	
	private final String descricao;
	
	TipoTelefone(String descricao) {
        this.descricao = descricao;
    }

	public String getDescricao() {
		return descricao;
	}
	
	
}
