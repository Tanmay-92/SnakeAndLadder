package snake_ladder;

class Die {
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

public class SnakeAndLadderUC3 {

	public static void main(String[] args) {
		int Pos_Player = 0;
		Die Play = new Die();
		int Opt = Play.shuffle();
		int X = Play.RollingDice();
		if (Opt == 0) {
			System.out.println("NO PLAY");
		} 
		else if (Opt == 1) {
			System.out.println("BITTEN BY SNAKE");
			Pos_Player -= X;
			System.out.println("Position of Player :" + Pos_Player);
		}
		else {
			System.out.println("LADDER PULL");
		Pos_Player += X;
		System.out.println("Position of Player :" + Pos_Player);
		}

	}

}
