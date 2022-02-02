import java.util.Scanner;
public class LettersName {
    public static void main(String[] args){
      
        Scanner console = new Scanner(System.in);
        String name;
        
        System.out.print("Enter your name: ");
        name = console.nextLine();
        
        console.close();
        
        int n = name.length();
        

        
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(name.charAt(i));
        }

    }

}

