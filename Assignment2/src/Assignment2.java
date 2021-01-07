import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//detail personal background of the customer
int i=0;
while(i<1){
		System.out.print("Enter your first name: ");
		String firstname = input.next();
		System.out.print("Enter your middle name: ");
		String middlename = input.next();
		System.out.print("Enter your last name: ");
		String lastname = input.next();
		System.out.println("Hello \n" + firstname + " " + middlename + " "  + lastname);

		System.out.print("enter your age: ");
		int age = input.nextInt();
		
		System.out.print("enter your gender: ");
		String gender = input.next();
		
		System.out.print("Enter your address: ");
		String address = input.next();
		
		System.out.print("Enter your phone no.: ");
		String PhoneNo = input.next();
		
		// product 
		System.out.println("Product list: ");
		System.out.println();
		System.out.println("1. White Rice		RM20 per pack");
		System.out.println("2. Brown Rice		RM25 per pack");
		System.out.println("3. Red Rice			RM45 per pack");
		System.out.println("4. Black Rice		RM46 per pack");
		System.out.println("5. Jasmine Rice		RM50 per pack");
		System.out.println("6. Basmati Rice		RM50 per pack");
		System.out.println("7. Japonica Rice	RM52 per pack");
		System.out.println("8. Glutinous Rice	RM54 per pack");
		System.out.println("9. Wild Rice		RM30 per pack");
		System.out.println();
		
	
		System.out.print("What type of rice would you like to purchase?");
		double WhiteRice = 20;
		double BrownRice = 25;
		double RedRice = 45;
		double BlackRice = 46;
		double JasmineRice = 50;
		double BasmatiRice = 50;
		double JaponicaRice = 52;
		double GlutinousRice = 54;
		double WildRice = 30;
		
		int q_item1, q_item2, q_item3, q_item4, q_item5, q_item6, q_item7, q_item8, q_item9;
		double p_item1 = 0, p_item2 = 0, p_item3 = 0, p_item4 = 0, p_item5 = 0, p_item6 = 0, p_item7 = 0, p_item8 = 0, p_item9 = 0;
		System.out.println("Enter 'y' for yes and enter 'n' for no" );
		System.out.print("Your answer is: ");
		char answer = input.next().charAt(0);
		if (answer == 'y') {
			System.out.println("How many pack of White Rice you want to buy?");
			 q_item1 = input.nextInt();
			 p_item1 = WhiteRice * q_item1;
			 System.out.println("How many pack of Brown Rice you want to buy?");
			 q_item2 = input.nextInt();
			 p_item2 = BrownRice * q_item2;
			 System.out.println("How many pack ofRed Rice you want to buy?");
			 q_item3 = input.nextInt();
			 p_item3 = RedRice * q_item3;
			 System.out.println("How many pack of Black Rice you want to buy?");
			 q_item4 = input.nextInt();
			 p_item4 = BlackRice * q_item4;
			 System.out.println("How many pack of Jasmine Rice you want to buy?");
			 q_item5 = input.nextInt();
			 p_item5 = JasmineRice * q_item5;
			 System.out.println("How many pack of Basmati Rice you want to buy?");
			 q_item6 = input.nextInt();
			 p_item6 = BasmatiRice * q_item6;
			 System.out.println("How many pack of Japonica Rice you want to buy?");
			 q_item7 = input.nextInt();
			 p_item7 = JaponicaRice * q_item7;
			 System.out.println("How many pack of Glutinous Rice you want to buy?");
			 q_item8 = input.nextInt();
			 p_item8 = GlutinousRice * q_item8;
			 System.out.println("How many pack of Wild Rice you want to buy?");
			 q_item9 = input.nextInt();
			 p_item9 = WildRice * q_item9; 
		i++;
		}else if (answer == 'n') {
					System.out.println("Thank You!");
				
		}
		double Totalprice = p_item1 + p_item2 + p_item3 + p_item4 + p_item5 + p_item6 + p_item7 + p_item8 + p_item9;
		System.out.println ("The total price is: " + Totalprice);
			//Discount
				if (Totalprice > 100) {
					double discount = Totalprice * 0.2;
					double total = (Totalprice - discount);
					System.out.println("Discount received: RM" + discount );
					System.out.println("price to be paid: RM" + total);
				}
					else {
						double discount = Totalprice * 0.1;
						double total = (Totalprice - discount);
						System.out.println("Discount received: RM" + discount );
						System.out.println("price to be paid: RM" + total);
					}
				System.out.println("Thank you very much!");
				
		} 
				

			}	

		
	}


	



		