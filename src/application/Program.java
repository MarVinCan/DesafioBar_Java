package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Character sexo;
		Double totalAPagar, consumo, convert, ingresso, quantCerveja, quantRefri, quantEspeti;
		String convertInf;
		
		System.out.print("Sexo: ");
		sexo = sc.nextLine().charAt(0);
		while(sexo != 'F' && sexo != 'M') {
			System.out.print("Por favor digite F ou M: ");
			sexo = sc.nextLine().charAt(0);
		}
		System.out.print("Quantidade de cervejas: ");
		quantCerveja = sc.nextDouble();
		System.out.print("Quantidade de refrigerantes: ");
		quantRefri = sc.nextDouble();
		System.out.print("Quantidade de espetinhos: ");
		quantEspeti = sc.nextDouble();
		
		
		if(sexo == 'F') {
			ingresso = 8.00;
		}else {
			ingresso = 10.00;
		}
		consumo = (quantCerveja * 5) + (quantRefri * 3) + (quantEspeti * 7);
		if(consumo < 30) {
			convert = 4.00;
			convertInf = String.format("Couvert = R$ %.2f", convert);
		}else {
			convert = 0.0;
			convertInf = "Isento de Couvert";
		}
		totalAPagar = ingresso + consumo + convert;
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f %n", consumo);
		System.out.println(convertInf);
		System.out.printf("Ingresso = R$ %.2f %n%n", ingresso);
		System.out.printf("Valor a pagar = R$ %.2f", totalAPagar);
		
		sc.close();
	}	
	
}
