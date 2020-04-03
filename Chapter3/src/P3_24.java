public class P3_24 {
    public static void main(String[] args){
        int cardColor = (int) (Math.random() * 4);
        int cardNumber = (int) (Math.random() * 13);

        System.out.println("The card you picked is " + parseNumber(cardNumber) + " of " + parseColor(cardColor));
    }

    // To parse color of the card
    private static String parseColor (int cardColor){
        String outputColor = "";
        switch (cardColor){
            case 0: outputColor = "Clubs";break;
            case 1: outputColor = "Diamonds";break;
            case 2: outputColor = "Hearts";break;
            case 3: outputColor = "Spades";break;
            default:
                throw new IllegalStateException("Unexpected value: " + cardColor);
        }
        return outputColor;
    }

    // To parse number of the card
    private static  String parseNumber (int cardNumber){
        String outputNumber = "";
        switch (cardNumber){
            case 0: outputNumber = "Ace";break;
            case 1: outputNumber = "2";break;
            case 2: outputNumber = "3";break;
            case 3: outputNumber = "4";break;
            case 4: outputNumber = "5";break;
            case 5: outputNumber = "6";break;
            case 6: outputNumber = "7";break;
            case 7: outputNumber = "8";break;
            case 8: outputNumber = "9";break;
            case 9: outputNumber = "10";break;
            case 10: outputNumber = "Jack";break;
            case 11: outputNumber = "Queen";break;
            case 12: outputNumber = "King";break;
            default:
                throw new IllegalStateException("Unexpected value: " + cardNumber);
        }
        return outputNumber;
    }
}
