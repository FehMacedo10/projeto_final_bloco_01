package produtos.model;

public abstract class Produto {
	private String nome;
	private String id;
	private int tipo;
	private float preco;
	
	
	public Produto(String nome, String id, int tipo, float preco) {
		this.nome = nome;
		this.id = id;
		this.tipo = tipo;
		this.preco = preco;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public abstract void visualizar();

}

