package br.com.treinamento;

public class Principal {

	public static void main(String[] args) {

		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Ailton");
		cliente1.setNome("123456");
		
		Conta conta1 = new Conta();
		conta1.setAgencia("778-9");
		conta1.setNumeroConta(456987);
		conta1.setSaldo(100.00);
		conta1.setTitular(cliente1);
		
	//******************************************
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("josé");
		cliente2.setCpf("789466");
		
/*		Conta conta2 = new Conta();
		conta2.agencia = "0058-9";
		conta2.numeroConta = 334455;
		conta2.saldo= 100.00;
		conta2.titular= cliente2;
*/	
		Conta conta2 = new Conta();
		conta2.setAgencia("0058-9");
		conta2.setNumeroConta("334455");
		conta2.setSaldo("100.00");
		conta2.titular= cliente2;
		//************************************
		
		System.out.println("Valor da conta1 antes do depósito:" + conta1.getSaldo());
		conta1.depositar(30.00);
		
		System.out.println("Saldo atual : R$" +conta1.getSaldo());
		
		//*************************************
		
		System.out.println("Valor da conta1 antes do depósito:" + conta1.getSaldo());
		conta1.sacar(20.00);
		
		System.out.println("Saldo atual conta 1 : R$" +conta1.getSaldo());
		
		//*************************************
		
		conta1.tranferir(conta2,23);
		System.out.println("Saldo da conta 1 : R$ " +conta1.getSaldo());
		System.out.println("Saldo da conta 2 ; R$" + conta2.getSaldo());
		
		// execução conta e cliente
		System.out.println("Nome do cliente conta 1 "+ conta1.getTitular().getNome() );
		System.out.println("Nome do cliente conta 2 "+ conta2.getTitular().getNome() );
		
		
		
		
	}

}
