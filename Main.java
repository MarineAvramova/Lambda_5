
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiValueInterface piValue = () -> 3.1415;

        // Call the getPiValue() method and print the result
        System.out.println("Value of Pi = " + piValue.getPiValue());
	}

}
