/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author humai
 */
public class l3q1 {
    
 static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter two integer number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("Enter the operand: ");
        char op = input.next().charAt(0);
        
        switch (op) {
            case '+' : System.out.println(a + "+" + b + "=" + (a + b)); break;
            case '-' : System.out.println(a + "-" + b + "=" + (a - b)); break;
            case '*' : System.out.println(a + "*" + b + "=" + (a * b)); break;
            case '/' :
                if (b == 0) System.out.println("Cannot divide by zero");
                else System.out.println(a + "/" + b + "=" + (a / b));
                break;
            case '%' : 
                if (b == 0) System.out.println(a + "%" + b + "=" + (a % b));
            default: System.out.println("Invalid operand");
        }
    }
    
}
