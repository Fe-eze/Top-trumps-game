
/**
 * Write a description of class DeckOfCards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeckOfCards
{
  private CardClass[] cards;
	int i;

	DeckOfCards()
	{
		i=59;
		cards = new Card[60];
		int x=0;
		for (int a=0; a<=3; a++)
		{
			for (int b=0; b<=12; b++)
			 {
			   cards[x] = new Card(a,b);
			   x++;
			 }
		}

}


	public CardClass drawFromDeck()
	{
		Random generator = new Random();
		int index=0;

		do {
			index = generator.nextInt( 52 );
		} while (cards[index] == null);

		i--;
		Card temp = cards[index];
		cards[index]= null;
		return temp;
	}

	public int TotalCards()
	{
		return i;
	}

}
