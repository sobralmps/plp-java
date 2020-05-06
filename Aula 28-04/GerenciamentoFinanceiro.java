package aulaorientacaoobjeto.exercicio1;

public class GerenciamentoFinanceiro extends ContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numeroConta = "2180540";
		conta.nomeBanco = "Banco do Brasil";
		conta.nomeAgencia = "Águas Claras";
		conta.nomeCliente = "Marcio";
		conta.Saldo = 50000.00;

		System.out.println("O número da conta é: " + conta.numeroConta + "\nNome do cliente: "+ conta.nomeCliente + "\nCom o saldo de: " + conta.Saldo);
		System.out.printf("O nome do banco é: %s e o nome da agencia: %s", conta.nomeBanco, conta.nomeAgencia);

	}

}