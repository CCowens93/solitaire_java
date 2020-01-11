import java.util.Scanner;

public class Card{
    public static void main(String[] args){
        String[] suit = {
            "Spade", 
            "Diamonds", 
            "Clubs", 
            "Hearts"
            };
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
         
        
        for(int i = 0; i < rank.length; i ++){
            for(int j = 0; j < suit.length; j ++){
                int r = rank.length;
                int s = suit.length;
                int randomRank = (int) (Math.random() * r);
                int randomSuit = (int) (Math.random() * s);
                String randomCard = rank[randomRank] + " of " + suit[randomSuit];
                System.out.println(randomCard);
            }
        }

        
   
    }
}