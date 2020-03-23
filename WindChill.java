
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final double NUM1= 35.74;
		final double NUM2= 0.6215;
		final double NUM3= -35.75;
		final double NUM4= 0.4275;
		

		//User input Temp
		System.out.println("Enter the temperature in Fahrenheit (must be >= -45 and <= 40):");
		Double temp = scan.nextDouble();
		
		//test if temp is in acceptable range
		if (temp > 40 || temp <-45)
		{
			System.out.println("Error! Please enter temperature inbetween -45 and 40");
		}

		//User input Wind Chill
		System.out.println("Enter the Wind Chill (must be >= 5 and <= 60):");
		double wind = scan.nextDouble();
		
		//test if wind chill is in acceptable range
		if (wind <5 || wind > 60)
		{
		System.out.println("Error! Please enter wind chill inbetween 5 and 60");
		}
		
		//Computes result
		double result = NUM1 + NUM2*temp + NUM3*Math.pow(wind, 0.16) + NUM4*temp*Math.pow(wind, 0.16);
		
		//Outputs
		System.out.println("Wind Chill temperature: " + result + " degrees Fahrenheit \n");
		
		System.out.println("Programmer: Matt Melmed");
		
	}

}
