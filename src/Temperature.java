
/**
 * @MelissaLiao 
 *
 *To store and retrieve the temperature in degrees Fahrenheit.
 *It also converts its temperature to degrees Celsius.
 *
 */
public class Temperature {
	
	private double degrees;
	
	public Temperature(double f) {
		this.degrees = f;
	}
	
	public double getFahrenheit() {
		return this.degrees;
		
	}
	
	public double getCelsius() {
		//returns formula to convert temperature from Fahrenheit to Celsius
		return (5*(this.degrees-32)/9);
	}
	
	public static void main(String[] args) {
		Temperature t1 = new Temperature(20);
		System.out.println("The Fahrenheit temperature of thermometer1 is " + t1.getFahrenheit() + " degrees.");
		System.out.println("The Celsius temperature of thermometer1 is " + t1.getCelsius() + " degrees.");
		
		Temperature t2 = new Temperature(98.6);
		System.out.println("The Fahrenheit temperature of thermometer2 is " + t2.getFahrenheit() + " degrees.");
		System.out.println("The Celsius temperature of thermometer2 is " + t2.getCelsius() + " degrees.");
		
	}

}
