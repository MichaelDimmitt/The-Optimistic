import java.io.File;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TheHopefulGPA {

	public static void main(String args[]) {
		MathHouse math = new MathHouse();
		math.equation();
	}//emd main()
}//end class TheHopefulGPA()

class MathHouse {
	double creditsForGraduation;
	double currentGPA;
	double creditsAtTheMoment;

	void equation() {// test every user input for
						// each time scanner happens i want it to do this..
						// if text
		// system.out.println("words are not allowed")
		boolean running = true;
		while (running) {
			Scanner sc = new Scanner(System.in);
			int b = 1;
			while (b == 1) {
				try {
					// //////////////////////////////////////////////////////////////////////
					//
					System.out.println("Hello, what amount of credit hours are required for graduation?");
					int creditsForGraduation = sc.nextInt();// 129
					if (100 < creditsForGraduation
							&& creditsForGraduation < 150) {
						b = 2;
						File output = new File("output.txt");
					
						/*allows returning customers to be remembered.
						possible added functionality to enter 
						semester grades instead of whole college parameters.*/
						if (new File("output.txt").isFile()) {

							System.out.println();
						} else {
							try {

								output.createNewFile();
								PrintWriter printer = new PrintWriter(output);
								printer.print(creditsForGraduation);
								printer.close();
								System.out.println("file made!");
							} catch (Exception e) {
								e.printStackTrace();
								System.out.println("could not make file");
							}//handling any issue where file cannot be made.
						}
						this.creditsForGraduation = creditsForGraduation;
					}
					else
						System.err.println("error, wrong input!");
				} catch (InputMismatchException e) {
					sc.next();
				}//handling input that is not an integer.
				
				while (b == 2) {
					try {
						System.out.println("Hello, what is your GPA?");
						double currentGPA = sc.nextDouble();// 3.0
						if (0 <= currentGPA && currentGPA <= 4) {
							b = 3;
							this.currentGPA = currentGPA;
						} else
							System.err.println("error, wrong input!");
					} catch (InputMismatchException e) {
						sc.next();
					}//handling input that is not an integer.
					while (b == 3) {
						try {
							System.out.println("Hello, how many credit hours are completed at the moment?");
							double creditsAtTheMoment = sc.nextInt();// 92
							if (0 <= creditsAtTheMoment
									&& creditsAtTheMoment <= creditsForGraduation) {
								b = 4;
								this.creditsAtTheMoment = creditsAtTheMoment;
							} else
								System.err.println("error, wrong input!");
						} catch (InputMismatchException e) {
							sc.next();
						}//handling input that is not an integer.
					}
				}
			}
			
			double maxAtMomentGPA = (4 * creditsAtTheMoment); //
			double currentAtMoment = (currentGPA * creditsAtTheMoment);
			double loss = maxAtMomentGPA - currentAtMoment;
			double maxGPA = (4 * creditsForGraduation); // checked
			double maxPossible = maxGPA - loss;
			double possibleGPA = maxPossible / creditsForGraduation;
			System.out.println("your possible GPA is... " + possibleGPA);
			running = false;
			sc.close();
		}//end while()
	}//end class equation()

	void input() {
		// for if i wanted to do something with the scanner

		// System.out.println("You Have moved from the Ideal ... many points per Credit hour.");
		// System.out.println("You Have moved from the Ideal ... many points per Credit hour.");
		// System.out.println("You Have moved from the Ideal ... many points per Credit hour.");
	}

}//end class MathHouse()
