/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @student Graham MacLean - MacleaGr - 991770586
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        int min1 = 0; int max1 = 3;
        int min2 = 1; int max2 =13;
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)Math.floor(Math.random() * (max2 - min2 +1) + min2));
            int suitValue = (int)Math.floor(Math.random() * (max1 - min1 +1) + min1);
            c.setSuit(Card.SUITS[suitValue]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        /* CODE REMOVED - REPLACED WITH LUCKY CARD
        Scanner user = new Scanner(System.in);
        System.out.println("Select a Suit - Hearts, Diamonds, Spades, Clubs :");
        String userSuitString = user.next();
        userSuitString = userSuitString.toLowerCase();
        int userSuit = 0;
        if(userSuitString.equals("hearts")){userSuit = 0;}
        else if (userSuitString.equals("diamonds")){userSuit = 1;}
        else if (userSuitString.equals("spades")){userSuit = 2;}
        else if (userSuitString.equals("clubs")){userSuit = 3;}
        System.out.println("Select a Card Value - 1=A, ... 11=J, 12=Q, 13=K");
        int userValue = user.nextInt();
        user.close();
        */
        //LUCKY CARD CODE
        int userSuit = 2;
        int userValue = 2;
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[2]);
        
        magicHand[2] = luckyCard;
        // and search magicHand here
        int matching = 0;
        for (int i=0; i<magicHand.length; i++)
        {
            String progSuitString = magicHand[i].getSuit();
            int cardSuit = 0;
            if(userSuitString.equals("hearts")){cardSuit = 0;}
            else if (progSuitString.equals("diamonds")){cardSuit = 1;}
            else if (progSuitString.equals("spades")){cardSuit = 2;}
            else if (progSuitString.equals("clubs")){cardSuit = 3;}
            int cardValue = magicHand[i].getValue();
            
            if (userSuit == cardSuit && userValue == cardValue)
            {
                matching++;
            }
        }
        //Then report the result here
        if (matching == 0)
        {
            System.out.println("Sorry, your card does not match");
        }else
        {
            System.out.println("Wow! Your card matched a random card, thats Lucky");
        }
        // add one luckcard hard code 2,clubs (DONE)
    }
}
