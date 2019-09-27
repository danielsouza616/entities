package entities;

public class Conta {
	public int numConta;
	public String nome;
	public double saldo;
	public double limite;
	
	 /* 
	  * Forma basica de se fazer uma retirada
	  * public void saque(double valor) {
		   this.saldo = this.saldo -= valor;
		*/   
		  
	//Forma adequada de retirada
	  public boolean saque(double valor) {
		  if(valor > this.saldo) {
			  System.out.println("Saldo indisponivel");
			  return true;
		  }
		  else {
			this.saldo = this.saldo -= valor;
		    return false;
	        }
	   }

	  public void dep(double valor) {
		  this.saldo = this.saldo += valor;
	  }
}
