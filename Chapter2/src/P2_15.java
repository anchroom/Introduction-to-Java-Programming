public class P2_15 {
    public static void main(String[] args){
        final double YEARLY_RATE = 1.00417;
        int STARTFINANCE = 100;
        double umsatzkapital = 0;
        umsatzkapital = (umsatzkapital + STARTFINANCE) * YEARLY_RATE;
        umsatzkapital = (umsatzkapital + STARTFINANCE) * YEARLY_RATE;
        umsatzkapital = (umsatzkapital + STARTFINANCE) * YEARLY_RATE;
        umsatzkapital = (umsatzkapital + STARTFINANCE) * YEARLY_RATE;
        umsatzkapital = (umsatzkapital + STARTFINANCE) * YEARLY_RATE;
        umsatzkapital = (umsatzkapital + STARTFINANCE) * YEARLY_RATE;

        System.out.print("finally, you got " + umsatzkapital);
    }
}
