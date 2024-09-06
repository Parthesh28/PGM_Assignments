import java.util.*;

public class CN_Experiment_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean x = true;

		System.out.println("Enter the string: ");
		String input = sc.nextLine();

		System.out.println("Menu: \n1.Character Count\n2.Byte stuffing\n3.Bit Stuffing\n4.Physical Data Violation\n5.Exit");

		while (x) {
			System.out.print("Enter your choice: ");
			int option = sc.nextInt();

			switch (option) {
				case 1:
					System.out.println(input.length() + input);
					break;

				case 2:
					StringBuilder bytestuffed = new StringBuilder();
					bytestuffed.append("F");
					for (int i = 0; i < input.length(); i++) {
						if (input.charAt(i) == 'F') {
							bytestuffed.append("E");
						}
						if (input.charAt(i) == 'E') {
							bytestuffed.append("E");
						}
						bytestuffed.append(input.charAt(i));
					}
					bytestuffed.append("F");
					System.out.println(bytestuffed);
					break;

				case 3:
					StringBuilder bitstuffed = new StringBuilder();
					int count = 0;
					for (int i = 0; i < input.length(); i++) {
						bitstuffed.append(input.charAt(i));
						if (input.charAt(i) == '1') {
							count++;
						} else {
							count = 0;
						}
						if (count == 5) {
							bitstuffed.append("0");
						}
					}
					System.out.println(bitstuffed);
					break;

				case 4:
					System.out.println(input + "01");
					break;

				case 5:
					x = false;
					break;
				default:
					System.out.println("Please enter a valid option!");
					break;
			}
		}
		sc.close();
	}
}