import java.util.Scanner;

public class RandomGuess {
	
	public static void main(String[] args){
		int guess, rand;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a random number between 0 - 10: ");
		guess = input.nextInt();
		
		rand = (int)Math.round(Math.random()*11);
		System.out.println("You picked: " + guess);
		System.out.println("The computer picked: " + rand);
		
		
		if(guess == rand){
			
			System.out.println("You guessed correctly!");
		}
		else if(guess > rand){
			System.out.println("Your guess was too high!");
		}
		else if(guess < rand){
			System.out.println("Your guess was too low!");
		}
		
		
		
		
		
		
	}
	
}