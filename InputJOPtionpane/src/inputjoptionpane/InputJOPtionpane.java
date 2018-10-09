/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputjoptionpane;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class InputJOPtionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1, number2,number3;
        double rata;
        try {
            number1 = Integer.parseInt(JOptionPane.showInputDialog("Number 1 = "));
            number2 = Integer.parseInt(JOptionPane.showInputDialog("Number 2 = "));
            number3 = Integer.parseInt(JOptionPane.showInputDialog("Number 3 = "));
            rata = (number1+number2+number3)/3;
            String msg = "Rata-rata = " + rata;
                JOptionPane.showMessageDialog(null,msg);
        }catch(HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error!");
        }
        // TODO code application logic here
    }
    
}
