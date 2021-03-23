/**
 * COSC 210-001 Assignment 6
 * Prog6.java
 * 
 * This class reads the nfl2018.txt file and uses it to print a detailed
 * report that displays NFL players names, team, position, and other various
 * statistics relevant to their position.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		Player[] players = new Player[20];
		int numPlayers = 0;
		String fName;
		String lName;
		String team;
		String position;
		
		Scanner inFile=null;
		
		try {
			inFile = new Scanner( new File( "nfl2018.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Error: File nfl2018.txt not found");
	}
		try {
		}
		catch (Exception e) {
			System.err.println("File error "+e.getMessage());
		}
		while (inFile.hasNext()) {
			fName = inFile.next();
			lName = inFile.next();
			team = inFile.next();
			position = inFile.next();
			
			if (position.contentEquals("QB")) {
				int completions = inFile.nextInt();
				int attempts = inFile.nextInt();
				int yards = inFile.nextInt();
				Quarterback qb = new Quarterback(fName,lName,team,position,completions,attempts,yards);
				players[numPlayers] = qb;
				numPlayers++;
			}
			else {
				int receptions = inFile.nextInt();
				int yards = inFile.nextInt();
				Receiver wr = new Receiver(fName,lName,team,position,receptions,yards);
				players[numPlayers]=wr;
				numPlayers++;
			}
		}
		System.out.println("NFL 2018 Player Passing/Receiving Statistics\n");
		System.out.println("Quarterbacks\n");
		System.out.println("Player                    Team    Comp   Att   Pct    Yds  Yds/A   Yds/G");
		Arrays.sort(players);
		for(int i=0;i<numPlayers;i++) {
			Player p = players[i];
			if(p instanceof Quarterback) {
				System.out.printf("%-25s %-7s %-6d %-5d %-5.1f %-6.0f %-5.2f %-5.2f\n",
						players[i].toString(),
						players[i].getTeam(),
						((Quarterback)players[i]).getCompletions(),
						((Quarterback)players[i]).getAttempts(),
						((Quarterback)players[i]).percent(((Quarterback)players[i]).getCompletions(), ((Quarterback)players[i]).getAttempts()),
						((Quarterback)players[i]).getYards(),
						((Quarterback)players[i]).yardsPerAttempt(((Quarterback)players[i]).getYards(), ((Quarterback)players[i]).getAttempts()),
						((Quarterback)players[i]).yardsPerGame(	((Quarterback)players[i]).getYards()));
						
			}
		}
		System.out.println("\nWide Receivers");
		System.out.println("\nPlayer                    Team   Rec     Yds   Yds/R   Yds/G");
		for(int i=0;i<numPlayers;i++) {
			if (players[i] instanceof Receiver) {
				System.out.printf("%-25s %-6s %-6d %-6.0f %-7.1f %.1f\n",
						players[i].toString(),
						players[i].getTeam(),
						((Receiver)players[i]).getReceptions(),
						((Receiver)players[i]).getYards(),
						((Receiver)players[i]).yardsPerReception(((Receiver)players[i]).getYards(), ((Receiver)players[i]).getReceptions()),
						((Receiver)players[i]).yardsPerGame(((Receiver)players[i]).getYards()));
			}
		}
	}
}
