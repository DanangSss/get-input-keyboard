/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputsccaner;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author user
 */
public class InputSccaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int number1,number2,number3;
        double rata;
        try{
            System.out.print("Input Your Number  1 = ");
            number1 = input.nextInt();
            System.out.print("Masukkan Angka 2 = ");
            number2 = input.nextInt();
            System.out.print("Masukkan Angka 3 = ");
            number3 = input.nextInt();
            rata = (number1+number2+number3)/3;
            System.out.println("Rata-rata = " + rata);
        } catch (Exception e) {
            System.out.println("Error!");
        // TODO code application logic here
    }
    
}
}
