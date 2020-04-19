public class P5_33 {
    public static void main(String[] args){
        int totalnumber = 6;
        int divider = 1;
        for(totalnumber = 6; totalnumber <= 10000; totalnumber++){
            int restNumber = totalnumber;
            for (divider = 1; divider <= ((int)(totalnumber / 2)); divider++){
                if ((totalnumber % divider) == 0){
                    restNumber = restNumber - divider;
                } else continue;
            }
            if (restNumber == 0){
                System.out.println("The totalnumber is: " + totalnumber);
            } else continue;
        }
    }
}
