package produtos.model;

public class Videogames extends Produto {

	private String plataforma;

	public Videogames(String nome, int id, int tipo, float preco, String plataforma) {
		super(nome, id, tipo, preco);
		this.plataforma = plataforma;	
		
	}

	@Override
    public void visualizar() {
        System.out.println("Produto ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: Videogame");
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Plataforma: " + plataforma);
    }


}
