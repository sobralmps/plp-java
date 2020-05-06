package aulaorientacaoobjeto.exercicio1;

public class AlugaFacil {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Carro carro = new Carro();
		cliente.nome = "Suellen";
		cliente.cpf = "729.618.775-00";
		carro.cor = "Rosa";
		carro.fabricante = "Lamborghini";
		
		System.out.println("O nome da cliente é: " + cliente.nome + "\nSeu CPF é: " + cliente.cpf);
		
		System.out.printf("A cor do carro é: %s e o fabricante é: %s", carro.cor, carro.fabricante);
		

	}

}