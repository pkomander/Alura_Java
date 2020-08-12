
public class TesteIR {
	
	public static void main(String[] args) {
		
		double salario = 3751.01;
		
		if(salario == 1900 && salario <= 2800.0) {
			double deducao = (salario * 7.5) / 100;
			System.out.println(deducao);
		} if (salario == 2800.01 && salario <= 3751.0) {
			double deducao = (salario * 15) / 100;
			System.out.println(deducao);
		} if (salario == 3751.01 && salario <= 4664.00) {
			double deducao = (salario * 22.5) / 100;
			System.out.println(deducao);
		}
	}

}
