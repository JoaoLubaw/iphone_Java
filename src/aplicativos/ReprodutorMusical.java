package aplicativos;

public interface ReprodutorMusical {
	static void reproduzir() {
		System.out.println("Tocando música");
	}	
	
	static void pausar() {
		System.out.println("Música pausada");
	}
	
	static void selecionarMusica(String Nome) {
		System.out.println("Música selecionada: " + Nome);
	}
	
}
