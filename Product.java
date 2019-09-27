package entities;

public class Product {
	public String nome;
	public double preco;
	public int quant;
	
	public double totalValueStock() {
	return preco * quant;
	}
	public void addProduct(int quant) {
		this.quant += quant; 
  }
	public void removeProduct(int quant) {
		this.quant -= quant;
	}
	
}
