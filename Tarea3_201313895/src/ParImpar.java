import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int num;
		System.out.print("Ingrese un número cualquiera: ");
		num=teclado.nextInt();
		if (num%2==0){
			System.out.print("El numero es par.");
		} else {
			System.out.print("El numero es impar.");
		}
	}
}
