/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author humai
 */
public class l3q3 {
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter sales volume: ");
        double sales = input.nextDouble();
        double commission;
        
        if (sales <= 100) commission = sales * 0.05;
        else if (sales <=500) commission = sales * 0.075;
        else if (sales <= 1000) commission = sales * 0.10;
        else commission = sales * 0.125;
        
        System.out.printf("Commission: %.2f%n", commission);
    }
    
}
