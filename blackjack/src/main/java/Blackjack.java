import java.util.HashMap;

public class Blackjack {
    HashMap<String, Integer> map = new HashMap<>();

    Blackjack() {
        this.map.put("ace", 11);
        this.map.put("two", 2);
        this.map.put("three", 3);
        this.map.put("four", 4);
        this.map.put("five", 5);
        this.map.put("six", 6);
        this.map.put("seven", 7);
        this.map.put("eight", 8);
        this.map.put("nine", 9);
        this.map.put("ten", 10);
        this.map.put("jack", 10);
        this.map.put("queen", 10);
        this.map.put("king", 10);
        this.map.put("other", 0);
    }

    public int parseCard(String card) {
        return this.map.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        return (this.map.get(card1) + this.map.get(card2)) == 21 ? true : false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
    }

    public String smallHand(int handScore, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the
    // cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls
    // the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
