import java.util.Scanner;

public class CTQuestao1 {

	public static void main(String[] args) {
		
		//variável que instancia Scanner
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Digite a sua idade para consulta eleitoral");
		//idade capturada pelo scanner e armazenada na variável idade
		int idade = in.nextInt();
		
		if(idade < 0) {
			idade = idade * (-1);
		}
		
		if(idade < 16) {
			System.out.println("Você não possui permissão para participar nas eleições!");
		}else if(idade <= 17 || idade >= 65) {
			System.out.println("Seu voto é facultativo nessas eleições "
					+ "mas, não deixe de exercer seu dever como cidadão!");
		}else {
			System.out.println("Seu voto é obrigatório!");	
		}
	}

}
