package entities;

public class Aluno {
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double NotaMedia() {
		return n1 + n2 + n3;
	}
    public double Aprovation() {
    	if (NotaMedia() < 60) {
    	    return 60 - NotaMedia();
    	}
    	else {
    		return 0;
    	}
    }
	
	
}
