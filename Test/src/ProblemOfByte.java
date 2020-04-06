public class ProblemOfByte {
    public static void main(String[] args){
        /*
        Initial like this doesn't work

        byte number1 = 0010101;
        System.out.println("With 0 and 1 directly stored is like this " + number1);*/

        byte number1 = 0b1000;
        byte number2 = (byte) 8;
        int number3 = 0xFF;
        byte number4 = (byte) 0xFF;
        System.out.println("Binary must with \"0b\" initial like this :" + number1);
        System.out.println("Int to byte output like :" + Integer.toBinaryString(1));
        System.out.println("Int to byte output like :" + Integer.toBinaryString(number2));
        System.out.println("Hex to int output like :" + number3);
        System.out.println("Int to byte output like :" + Integer.toBinaryString(number4));

        /*byte ivalue = (byte)24;
        String binaryString = Integer.toBinaryString(ivalue);
        System.out.println("binaryString = " + binaryString);*/
    }
}
