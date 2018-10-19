
public class Cards 
{
	String suit = "";
	int cardNum = 0;
	
	public Cards()
	{
		cardNum += (int) (13 * Math.random()) + 1;
		
		int suitNum = (int) (4 * Math.random()) + 1;
		
		if (suitNum == 1)
		{
			suit = "Clubs";
		}
		else if (suitNum == 2)
		{
			suit = "Diamonds";
		}
		else if (suitNum == 3)
		{
			suit = "Hearts";
		}
		else
		{
			suit = "Spades";
		}
	}
	
	public String getNum()
	{
		String result = "";
		if (cardNum <=10 && cardNum >= 2) 
		{
			result += cardNum;
		}
		else if (cardNum == 1)
		{
			result += "Ace";
		}
		else if (cardNum == 11)
		{
			result += "Jack";
		}
		else if (cardNum == 12)
		{
			result += "Queen";
		}
		else
		{
			result += "King";
		}
		return result;
	}
	
	public String getSuit()
	{
		return suit;
	}
}