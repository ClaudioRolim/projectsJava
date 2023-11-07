import java.util.Locale;
import javax.swing.JOptionPane;

public class hourJob
{	
	public static void main(String[] args)
	{
		int ID = Integer.parseInt(JOptionPane.showInputDialog("Enter employee ID: "));	
		String name = JOptionPane.showInputDialog("Enter employee name: ");
		String nameCo = JOptionPane.showInputDialog("Enter company name: ");
		double hourWork = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked: "));
		double hourPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the hourly rate: "));
		Locale.setDefault(Locale.US);
		System.out.printf("\nEmployee number %d, %s, at company %s, earns %.2f per hour of work.\nThis month, the total hours worked were %.2f, in the amount of U$ %.2f.\n\n", ID, name, nameCo, hourPrice, hourWork, hourPrice * hourWork);	

	}
}
