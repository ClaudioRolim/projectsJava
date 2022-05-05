import java.util.Locale;
import javax.swing.JOptionPane;


public class snackOrder
{
      	 public static void main(String[] args)
	 {
		 Locale.setDefault(Locale.US);
		 String[] item = {"empty order", "hot-dog", "x-bacon", "toast", "soda"};
		 Double[] price = {0.00, 5.50, 9.99, 7.25, 3.90};
 		 int x = 1; 	
		 int code = Integer.parseInt(JOptionPane.showInputDialog("Enter the product code: "));
		 int quant = Integer.parseInt(JOptionPane.showInputDialog("Enter the product quantity: "));
		 if (code == 0 || code >= 5)
		 {
			 System.out.println("\nOrder cannot be processed. Choose an item...");
		 }
		 else
		 {
		 	System.out.printf("\nOder: %d || code: %d || Type: %s || Quant: %d un. || Price: U$%.2f || Total: U$%.2f\n\n", x, code, item[code], quant, price[code], quant * price[code]);
	         }  	
	}
}
