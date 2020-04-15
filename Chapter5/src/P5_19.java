public class P5_19 {
    public static void main(String[] args){
        for(int numberOfLines = 1; numberOfLines <= 8; numberOfLines++){
            for(int numberOfColumns = 1; numberOfColumns <= 15; numberOfColumns++){
                if (((numberOfColumns <= 8) && ((numberOfColumns + numberOfLines) < 9))
                        || ((numberOfColumns > 8) && ((numberOfColumns - 7) > numberOfLines))){
                    System.out.print("    ");
                } else if ((numberOfColumns <= 8) && ((numberOfColumns + numberOfLines) >= 9)) {
                    System.out.printf("%4d" , (int)(Math.pow(2, (numberOfColumns + numberOfLines - 9))));
                } else if ((numberOfColumns > 8) && ((numberOfColumns - 7) <= numberOfLines)){
                    System.out.printf("%4d" , (int)(Math.pow(2, (16 - numberOfColumns + numberOfLines - 9))));
                }
            }
            System.out.println("");
        }
    }
}
