public class P5_40 {
    public static void main(String[] args){
        int numberOfHeads = 0;
        int numberOfNumbers = 0;

        for (int i = 1; i <= 1000000; i++){
            int randomNumber = (int)(Math.random() * 2);
            if (randomNumber == 1){
                numberOfHeads++;
            } else numberOfNumbers++;
        }
        System.out.println("Heads have " + numberOfHeads + " and number have " + numberOfNumbers);

    }
}
