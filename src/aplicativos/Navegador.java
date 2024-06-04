package aplicativos;

public interface Navegador {

	static void exibirPagina(String url) {
		System.out.println("Exibindo página " + url);
	}
	
	static void adicionarNovaAba() {
		System.out.println("Nova aba aberta ");
	}
	
	static void atualizarPagina() {
		System.out.println("Página atualizada ");
	}
	
}
