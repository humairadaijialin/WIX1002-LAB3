/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author humai
 */
public class l3q6 {
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter the radius of the circle: ");
        
        double r = input.nextDouble();
        System.out.print("Enter the point (x, y): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        double distance = Math.sqrt(x * x + y * y);
        
        if (distance < r) System.out.println("Point (" + x + ", " + y +") is inside the circle");
        else if (distance == r)
            System.out.println("Point (" + x + ", " + y + ") is on the circle");
        else System.out.println("Point (" + x + ", " + y + ") is outside the circle");
    }
    
}
