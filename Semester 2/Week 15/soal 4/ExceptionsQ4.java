public class ExceptionsQ4 {
	public static void main(String[] args) {
		try {
			int[] someArray = {12, 9, 3, 11};
			int position = getPosition();
			display(someArray, position);
		} catch (NumberFormatException e) {
			System.out.println("Your input must be an integer");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Your input is exceeds the array index");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			System.out.println("End of program");
		}
	}

	static int getPosition() {
		System.out.println("Enter array position to display");
		String positionEntered = EasyScanner.nextString();
		return Integer.parseInt(positionEntered);
	}

	static void display(int[] arrayIn, int posIn) {
		System.out.println("Item at this position is: " + arrayIn[posIn]);
	}
}