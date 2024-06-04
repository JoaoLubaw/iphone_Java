package aplicativos;

public interface Telefone {
	
	static void tocar() {
		System.out.println("Trimm Triim Triim");
	}
	
	static void ligar(String numero) {
		System.out.println("Ligando para " + numero);
	}
	
	static void atender() {
		System.out.println("Atendeu ligação");
		System.out.println("Olá, bem vindo ao centro de atendimento TIM. Atualmente você é o 145° na fila, tempo de espera: 20 horas.");
	}
	
	static void recusar() {
		System.out.println("Recusou ligação");
	}
	
	static void iniciarCorreiodeVoz() {
		System.out.println("Você tem 1 mensagem no seu correio de voz eletrônico");
		System.out.println("Olá, bem vindo ao centro de atendimento TIM. Atualmente você é o 145° na fila, tempo de espera: 20 horas.");
	}
}
