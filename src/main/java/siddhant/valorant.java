package siddhant;

public class valorant
{
	private String playerName;
	private int playerID;
	private String playerRank;
	private int highestScore;
	
	public valorant(String playerName, int playerID, String playerRank, int highestScore) {
		super();
		this.playerName = playerName;
		this.playerID = playerID;
		this.playerRank = playerRank;
		this.highestScore = highestScore;
	}
	public valorant(String playerName, int playerID)
	{
		this.playerName = playerName;
		this.playerID = playerID;
	}
	public valorant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "playerName=" + playerName + ", playerID=" + playerID;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerID() {
		return playerID;
	}
	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}
	public String getPlayerRank() {
		return playerRank;
	}
	public void setPlayerRank(String playerRank) {
		this.playerRank = playerRank;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
}
