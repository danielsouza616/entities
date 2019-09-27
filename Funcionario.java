package entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double tax;
	
	public double DescSalario() {
		return salario - tax;
	}
	public void AumSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}

}
