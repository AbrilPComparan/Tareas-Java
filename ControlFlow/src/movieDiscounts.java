package ControlFlow;
import java.util.Scanner;

public class movieDiscounts {
    public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Introduce tu edad: "); 
		int age = value.nextInt();
		System.out.println("Introduce el número de boletos: ");
		int nTicket = value.nextInt();
		int ticket = 7;
        value.close();
		if (age>=5 && age<=60) {
			if (nTicket==1) {
				System.out.println("No hay descuento. Son 7 euros.");
			} else {
				System.out.println("Son " + ticket*nTicket*.7);
			}
		} else if (age<5) {
			System.out.println("Tienes descuento del 60%, son " + ticket*.4);
		} else {
			System.out.println("Tienes descuento del 55%, son " + ticket*.45);
		}
	}
}
