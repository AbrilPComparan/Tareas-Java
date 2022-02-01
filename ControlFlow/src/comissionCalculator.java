package ControlFlow;
import java.util.Scanner;

public class comissionCalculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa tu venta ");
        int sales = s.nextInt();
        s.close();

        if (sales>0 && sales <= 1000){
            System.out.println("La comision es de 0");
        }
        else if (sales>1000 && sales<=5000){
            System.out.println("La comision es de " + sales*0.1);
        }
        else if (sales>5000 && sales<=10000) {
            System.out.println("La comision es de " + sales*.2);
        }
        else{
            System.out.println("La comision es de " + sales*.3);
        }
    }
    
}
