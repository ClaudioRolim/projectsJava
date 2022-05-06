import javax.swing.JOptionPane;

public class dayWeek
{
	public static void main(String[] args)
	{
		String [] dayWeek = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		int day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day of the week [1 = Sunday]: "));;
		if(day <= 0 || day > 7)
		{
			System.out.println("\nDay of the week does not exit. Try again...\n\n");
			System.exit(0);
		}
		switch(1)
		{
			case 1:
			{
				System.out.printf("\nDay of the week: %s\n\n", dayWeek[day]);
				break;
			}
			case 2:
			{
	                         System.out.printf("\nDay of the week: %s\n\n", dayWeek[day]);
				 break;
                        }
			case 3:
			{                                
			       	  System.out.printf("\nDay of the week: %s\n\n", dayWeek[day]);
				  break;
			}
			case 4:
			{ 
				System.out.printf("\nDay of the week: %s\n\n", dayWeek[day]); 
				break;
			}
			case 5:
			{
				System.out.printf("\nDay of the week: %s\n\n", dayWeek[day]);
				break;
			}
			case 6:
			{
				System.out.printf("\nDay of the week: %s\n\n", dayWeek[day]);
				break;
			}
			case 7:
			{
				System.out.printf("\nDay of the week: %s\n\n", dayWeek[day]);
				break;
			}
			default:
			{
				System.out.println("\nError...\n\n");
				break;
			}
		}
		System.exit(0);
	}
}	
