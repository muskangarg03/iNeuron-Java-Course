//Guess the number Game:

import java.util.Scanner;

class Guesser{            // to take the number from the guesser
	int guessNum;
	
	public int guesser()
	{
		Scanner g=new Scanner(System.in);   // input a number from a guesser
		guessNum=g.nextInt();
		return guessNum;
	}
}


class Player{                        
	Scanner pl=new Scanner(System.in);     // to take the no. of players that can play the games
	int num=pl.nextInt();
	int []playerNum=new int[num];      
	
	public int[] player()     // to take and store the numbers from the players
	{
		
		for(int i=0;i<playerNum.length;i++)
		{
			System.out.println("Player "+(i+1) +" guess the number:");
			playerNum[i]=pl.nextInt();
		}
		return playerNum;
	}
}


class Umpire{
	int guesserNum;   // number that is choosen by the guesser
	int n;              // no. of players
	int []Playname=new int[n];	// to store the numbers from the players in an array
	
	public void NumCheck()   // to find the winner
	{
		int round=1;
		
		System.out.println("Enter number of players that can play the game:");
		Player p=new Player();    //creating an object to get the no. of players
		n=p.num;
		
		System.out.println();
		System.out.println("----------------Round "+round+"----------------");
		
		Guesser g=new Guesser();   //creating an object from taking a no. from guesser
		System.out.println("Guesser choose the number in round "+round+":");
		guesserNum=g.guesser();
		
		System.out.println("Players choose the number in round "+round+".");
		Playname=p.player();	  // taking no.s from players 
		
		int count=n;
		while(count>1) {
			count=0;
			round++;

			for(int i=0;i<Playname.length;i++)
			{
				if(Playname[i]==guesserNum)    // to check whether no. guess by guesser and player is same or not
				{
					count++;      // to count the no. of values that match the desired condition
					System.out.print("Player "+(i+1) +", ");	
				}
				else
				{
					Playname[i]=0;   //initializing the value as 0 that does not match the condition
				}
			}
			
			if(count>1)
			{
				System.out.println("guess the correct number. They have qualified for the next round.");
				System.out.println();
				System.out.println("----------------Round "+round+"----------------");
				
				Guesser g1=new Guesser();     // to take the no. from guesser for another round
				System.out.println("Guesser choose the number in round "+round+":");
				guesserNum=g1.guesser();
			
				System.out.println("Players choose the number in round "+round+".");
				for(int i=0;i<Playname.length;i++)   // to take the no. from players for another round
				{
					if(Playname[i]!=0) {
						Scanner sc=new Scanner(System.in);
						System.out.println("Player " + (i+1) +" guess the number:");
						Playname[i]=sc.nextInt();
					}
				}

			}
		}
		
		
		int flag=0;
		for(int i=0;i<Playname.length;i++)    // to print the winner who won the game
		{
			if(Playname[i]!=0)
			{
				System.out.println("Player "+ (i+1) +" has won the game.");
				flag=1;
			}
		}
		if(flag==0)         // if no one won the game
		{
			System.out.println("No player has won the game.");
		}

	}
}


public class assignment_2 {

	public static void main(String[] args) {   
		Umpire check=new Umpire();    // create an object to call a method "numcheck" from Umpire class
		check.NumCheck();             // to find the winner
	}

}
