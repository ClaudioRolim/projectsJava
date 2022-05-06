import javax.swing.JOptionPane;
import java.util.Locale;

public class incomeTax 
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		double s = Double.parseDouble(JOptionPane.showInputDialog("Enter your salary: U$ ".formatted(.2f)));
		double tax;					
		if(s > 0 && s <= 2000.00)
		{
			tax = 0.00;
			System.out.println("You are exempt.");
		}
		else if(s <= 3000.00)
		{
			tax = (s - 2000.00) * 0.08;
			System.out.printf("\nThe corresponding tax rate is 8 per cent, in the amount of: U$%.2f\n", tax);
		}
		else if(s <= 4500.00) 
		{
			tax = (s - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("\nThe corresponding tax rate is 18 per cent, in the amount of: U$%.2f\n", tax);
		}		
		else if(s > 4500.00)
		{
			tax = (s - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			System.out.printf("\nThe corresponding tax rate is 28 per cent, in the amount of: U$%.2f\n", tax);
		}
		else
		{
			System.out.printf("U$%.2f\n", s);
		}
		System.exit(0);
	}
}
