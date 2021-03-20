package gamblingGame;
public class Player {
	private String playerName;   //declared player name as private 
	private int playerAge;		//declared player age private 
	
	 //getters and setters 
	public void setPlayerName(String playerName)
	{
		this.playerName = playerName;		
	}
	
	public void setPlayerAge(int playerAge)
	{
		this.playerAge = playerAge;		
	}
	
	public String getPlayerName()
	{
		return playerName;	
	}
	public int getPlayerAge()
	{
		return playerAge;	
	}
}
