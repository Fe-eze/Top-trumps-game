
/**
 * This is a card class with all card attributes ranked from 1 to 8.
 * 
 * Alhamzah
 * 12/04/2016
 */

public class CardClass extends DeckOfCards
{
    private int rank, suit;

	private static String[] suits = { "shooting", "accuracy", "dribbling", "acceleration", "team work", "agility", "stamina", "strength" };
	private static String[] ranks  = { "1", "2", "3", "4", "5", "6", "7", "8", };


	CardClass(int suit, int rank)
	{
		this.rank=rank;
		this.suit=suit;
    }
	public @Override String toString()
	{
		  return ranks[rank] + " of " + suits[suit];
	}

	public int getRank() {
		 return rank;
	}

	public int getSuit() {
		return suit;
	}

}



// public class DeckOfCards {
// 	private CardClass[] cards;
// 	int i;
// 
// 	DeckOfCards()
// 	{
// 		i=59;
// 		cards = new Card[60];
// 		int x=0;
// 		for (int a=0; a<=3; a++)
// 		{
// 			for (int b=0; b<=12; b++)
// 			 {
// 			   cards[x] = new Card(a,b);
// 			   x++;
// 			 }
// 		}
// 	}
// 
// 	public CardClass drawFromDeck()
// 	{
// 		Random generator = new Random();
// 		int index=0;
// 
// 		do {
// 			index = generator.nextInt( 52 );
// 		} while (cards[index] == null);
// 
// 		i--;
// 		Card temp = cards[index];
// 		cards[index]= null;
// 		return temp;
// 	}
// 
// 	public int TotalCards()
// 	{
// 		return i;
// 	}
// } 

// public class Mainloop {
// 	public static void main(String[] args)
// 	{
// 		Deck deck = new DeckOfCards();
// 		Card D;
// 
// 		System.out.println( deck.TotalCards() );
// 
// 	   while (deck.TotalCards()!= 0 )
// 	   
// 		   D = deck.drawFromDeck();
// 		   System.out.println( D.toString() );
// 		  
// 		  }
// }
// 
// 	