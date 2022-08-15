import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome = "Walter de Castro";
		int idade = 27;
		double salario = 1690;
		/*o output abaixo forma uma string com os valores das respectivas variáveis */
		System.out.printf("Olá, meu nome é %s, tenho %d anos e ganho R$ %.2f reais por mês%n",
				nome, idade, salario);

	}

}
