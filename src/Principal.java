
public class Principal {
	
	public static void main(String[] args) {
		FolhaDePagamento folha = new FolhaDePagamento();
		double salario = folha.calcularSalario(160, 12, 32.5, 40.2);
		
		System.out.println("Salário calculado: " + salario);
	}
	
}

