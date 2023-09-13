package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("The amount of money that you start with: ");
		int startAmount = scan.nextInt();
		int a = startAmount;
		System.out.println("The probability that you win a single play: ");
		double winChance = scan.nextDouble();
		System.out.println("The win limit is: ");
		int winLimit = scan.nextInt();
		System.out.println("The number of days: ");
		int totalSimulations = scan.nextInt();
		int count = 0;
		while (totalSimulations > 0)
		{
			while (startAmount < winLimit && startAmount > 0)
			{
				double actualChance = Math.random();
				System.out.println("The actual chance of winning is " + actualChance);
				if (actualChance < winChance)
				{	
					startAmount = startAmount + 1;
				}
				else
				{
					startAmount = startAmount - 1 ;
				}
				count++;
				System.out.println(count);
				System.out.println(startAmount);
				if (startAmount == winLimit)
				{
					String b = "win";
				}
				else
				{
					String b = "lose";
				}
			}
			totalSimulations-- ;
			startAmount = a;
			System.out.println("simulation:" + count + b);
		}
	}
}
