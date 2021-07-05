package snake_ladder;

public class SankeAndLadder {

	public static void main(String[] args) {
		int count1 = 0;
		int count = 0;
	        int position = 0;
	        int position1 = 0;
	   while((position<=99)&&(position1<=99)) 
	   {
		System.out.println("position is " + position);
	    int die=(int) (Math.random() * 10) % 6+1;
		int die1=(int) (Math.random() * 10) % 6+1;
		position = (position + die);
		position1 = (position1 + die1);
		count =(count + 1);
		count1 =(count1 + 1);
		System.out.println("die value is " + die);
		System.out.println("die value is " + die1);
		int value=(int) (Math.random() * 10) % 3+1;
		int value1=(int) (Math.random() * 10) % 3+1;
		
		 switch(value) 
		 {
		   case 1:
		   System.out.println( "No Play You are in the same position" );
		   break;
		  
		   case 2:
		   position = (position + die);
		   if(position>100)
		   {
			   position = (position - die);
			   continue;
		   }
		   System.out.println( "Player 1 position after ladder is :" + position );
		   break;
		   
		   case 3: 
		   position = (position - die);
		  
		  if(position<0)
		  {
			  position = 0;
		  }
			 System.out.println( "Player 1 Position after snake is : " + position );
		   break;
		 }
		   //2nd player
		  switch(value1) 
		 {
		   case 1:
		   System.out.println( "No Play You are in the same position!!!" );
		   break;
		  
		   case 2:
		   position1 = (position1 + die1);
		   if(position1>100)
		   {
			   position1 = (position1 - die1);
			   continue;
		   }
		   System.out.println( "Player 2 position after ladder is::" + position1 );
		   break;
		   
		   case 3: 
		   position1 = (position1 - die1);
		  
		  if(position1<0)
		  {
			  position1 = 0;
		  }
			 System.out.println( "Player 2 Position after snake is::" + position1 );
		   break;
		 }
		  
		 }
			
			if(position == 100)
			{
			System.out.println( "Player ONE is the Winner!!!");
			System.out.println( "number of times die rolled is :: " + count );
			}
			else
			{
				System.out.println( "Player TWO is the Winner!!!" );
				System.out.println( "number of times die rolled is :: " + count1 );
			}
			System.out.println( "Die total play number is::" + (count1+count));
		
		  }
	}

			
