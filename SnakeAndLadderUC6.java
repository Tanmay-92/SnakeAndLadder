package snake_ladder;
public class Die {
	String Project = "Snake And Ladder Simulator";

	public int RollingDice() {
		int Dice = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Ur Dice Number is :" + Dice);
		return Dice;
	}

	public int shuffle() {
		int Play_opt = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Ur Playing option :" + Play_opt);
		return Play_opt;
	}
}

public class SnakeAndLadderUC6 {

	public static void main(String[] args) {
		int Pos_Player = 0, counter=0 ;
		Die Play = new Die();
		while (Pos_Player < 100) {

			int Opt = Play.shuffle();
			int X = Play.RollingDice();
			counter+=1;
			if (Opt == 0) {
				System.out.println("NO PLAY");
			} else if (Opt == 1) {
				System.out.println("BITTEN BY SNAKE");
				Pos_Player -= X;
				if (Pos_Player < 0) {
					Pos_Player = 0;
				}
				System.out.println("Position of Player :" + Pos_Player);
			} else {
				System.out.println("LADDER PULL");
				if(Pos_Player+X<=100) {
				Pos_Player += X;
			}
				System.out.println("Position of Player :" + Pos_Player);
			}
			System.out.println("No.Of Times Dice Thrown:" +counter);
		}
	  }
	}

