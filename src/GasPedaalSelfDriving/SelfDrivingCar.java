package GasPedaalSelfDriving;

public class SelfDrivingCar {
	//check if the car exceeds the borders or can make car accident with another car
	static boolean notApplicable=false;
	//check if the new position will be equal to another car so if it is equal the car will make an accident
	public static boolean checkCarAccident(int x,int y,Car landingCar)
	{
		if(x==landingCar.getX() && y==landingCar.getY())
			return true;
		return false;
	}
	/*move forward based on the direction
	 * 1- N
	 * if the direction N so Y will be increased and if that we need to 
	 * check if Y is smaller than the max Y and check if that move will make accident with another car
	 * 
	 * 2- S
	 * if the direction S so Y will be decreased and if that we need to 
	 * check if Y is greater than the min Y and check if that move will make accident with another car
	 * 
	 * 3- E
	 * if the direction E so X will be increased and if that we need to 
	 * check if X is smaller than the max X and check if that move will make accident with another car
	 * 
	 * 4- W
	 * if the direction W so X will be decreased and if that we need to 
	 * check if X is greater than the min X and check if that move will make accident with another car
	 */
	public static Car moveForwardCar(Car movingCar,Car landingCar,int maxX,int maxY)
	{
		notApplicable=false;
		if(movingCar.getDirection()=='N')
		{
			int y = movingCar.getY();
			if(y<maxY&&!checkCarAccident(movingCar.getX(),y+1,landingCar))
			{
				movingCar.setY(y+1);
			}
			else notApplicable=true;
		}
		else if(movingCar.getDirection()=='S')
		{ 
			int y = movingCar.getY();
			if(y>0&&!checkCarAccident(movingCar.getX(),y-1,landingCar))
			{
				movingCar.setY(y-1);
				
			}
			else notApplicable=true;
		}
		else if(movingCar.getDirection()=='E')
		{
			int x = movingCar.getX();
			if(movingCar.getX()<maxX&&!checkCarAccident(x+1,movingCar.getY(),landingCar))
			{
				movingCar.setX(x+1);
				
			}
			else notApplicable=true;
		}
		else if(movingCar.getDirection()=='W')
		{
			int x = movingCar.getX();
			 if(movingCar.getX()>0&&!checkCarAccident(x-1,movingCar.getY(),landingCar))
			 {
				movingCar.setX(x-1);
				
			 }
			 else notApplicable=true;
		}
		
		return movingCar;
	}
	/*change the direction based on the direction to the left position (counter clockwise)
	 * 1- N
	 * change to W
	 * 
	 * 2- S
	 * change to E
	 *
	 * 3- E
	 * change to N
	 * 
	 * 4- W
	 * change to S
	 */
	public static Car changeDirectionLeft(Car movingCar)
	{
		if(movingCar.getDirection()=='N')
		{
			movingCar.setDirection('W');
		}
		else if(movingCar.getDirection()=='W')
		{
			movingCar.setDirection('S');
		}
		else if(movingCar.getDirection()=='S')
		{
			movingCar.setDirection('E');
		}
		else if(movingCar.getDirection()=='E')
		{
			movingCar.setDirection('N');
		}
		return movingCar;
	}
	/*change the direction based on the direction to the right position (clockwise)
	 * 1- N
	 * change to E
	 * 
	 * 2- S
	 * change to W
	 *
	 * 3- E
	 * change to S
	 * 
	 * 4- W
	 * change to N
	 */
	public static Car changeDirectionRight(Car movingCar)
	{
		if(movingCar.getDirection()=='N')
		{
			movingCar.setDirection('E');
		}
		else if(movingCar.getDirection()=='E')
		{
			movingCar.setDirection('S');
		}
		else if(movingCar.getDirection()=='S')
		{
			movingCar.setDirection('W');
		}
		else if(movingCar.getDirection()=='W')
		{
			movingCar.setDirection('N');
		}
		return movingCar;
	}
	/* loop for the instructions
	 * 1- F
	 * move the car based on the direction 
	 * but if the car exceeds the borders or makes accident with another car , the car will not be moved 
	 * and we can't proceed with the other instructions so the car will be stopped at this position. 
	 * we will break from the loop at this point.
	 * 
	 * 2- L
	 * change the direction based on the direction to the left position (counter clockwise)
	 * 
	 * 3- R		
	 * 
	 * change the direction based on the direction to the left position (counter clockwise)
	 *
	 */
	public static Car movingCar(Car movingCar,String instruction,Car landingCar,int maxX,int maxY)
	{
		char [] instructions = instruction.toCharArray();
		for(int i=0;i<instructions.length;i++)
		{
			if (instructions[i]=='F')
			{
				movingCar = moveForwardCar(movingCar,landingCar,maxX,maxY);
				if(notApplicable) break;			
			}
			else if (instructions[i]=='L')
			{
				movingCar = changeDirectionLeft(movingCar);
			}
			else if (instructions[i]=='R')
			{
				movingCar = changeDirectionRight(movingCar);
			}
		}
		return movingCar;
	}
	public static void main(String[] args) {
		
		//20 20 0 0 N 12 9 E FFFFFRFFRFLFF FFRFRFLFFLFFR
		
		int maxX = Integer.parseInt(args[0]);
		int maxY= Integer.parseInt(args[1]);
		/// for car 1
		Car firstCar=new Car();
		firstCar.setX(Integer.parseInt(args[2]));
		firstCar.setY(Integer.parseInt(args[3]));
		firstCar.setDirection((args[4].charAt(0)));
		
		///////// for car 2
		Car secondCar=new Car();
		secondCar.setX(Integer.parseInt(args[5]));
		secondCar.setY(Integer.parseInt(args[6]));
		secondCar.setDirection((args[7].charAt(0)));
		
		/////instruction of the cars 
		String firstInstruction = args[8];
		String secondInstruction = args[9];
		
		
		firstCar = movingCar(firstCar,firstInstruction,secondCar,maxX,maxY);
		secondCar = movingCar(secondCar,secondInstruction,firstCar,maxX,maxY);
		
		System.out.println(firstCar.getX()+ " "+firstCar.getY()+" "+firstCar.getDirection());
		System.out.println(secondCar.getX()+ " "+secondCar.getY()+" "+secondCar.getDirection());
	}

}
