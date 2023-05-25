import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,soma;
		
		System.out.println("Digite o primeiro número");
		a = sc.nextInt();
		System.out.println("Digite o segundo número");
		b = sc.nextInt();
		soma = a + b;
		System.out.printf("Soma = %d", soma);
		sc.close();
	}

}
