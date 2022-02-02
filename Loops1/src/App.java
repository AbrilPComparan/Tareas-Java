import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num;
        int i = 1;
        
    
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        console.close(); 
        System.out.println("Multiplication Table of " + num);
        
        while (i<=10){
                System.out.println(num*i);
                i ++;
                

        }


    }
}
