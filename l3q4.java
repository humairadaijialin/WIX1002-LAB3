/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author humai
 */
public class l3q4 {
static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int p1 = rollDice() + rollDice(); 
        int p2 = rollDice() + rollDice();
        
        System.out.println("Player 1 score: " + p1);
        System.out.println("Player 2 score: " + p2);
        
        if (p1 > p2) System.out.println("Player 1 wins!");
        else if (p2 > p1) System.out.println("Player 2 wins!");
        else System.out.println("It's a tie!");
    }
    static int rollDice() {
        return (int) (Math.random() * 6 + 1); //1 to 6
    }
}
