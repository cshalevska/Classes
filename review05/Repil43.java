import java.util.Scanner;
class Main { 

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
  
		System.out.println("Please enter your favorite car make");
		String carOrigin=input.nextLine();
				
	
		switch(carOrigin.toUpperCase()) {
		
		case "BMW":
			carOrigin="german car";
			break;
		case "Toyota":
			carOrigin="japanese car";
			break;
		case "Maserati":
			carOrigin="italian car";
		break;
			default:
				carOrigin="Unknown";
				
		}
    
		input.close();
				System.out.println("Your favorite car is " +carOrigin);
		}
}



