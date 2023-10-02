public class CodeTest {

    public static void main(String string[]) throws Exception {
	double SI = 0;
	double amount = 0;
	double principal = 78137;
	double rate = 8.15;
	double fixedRate = rate / (12 * 100);
	double perMonthIncrease = 1800;
	for (int i = 1; i <= 12; i++) {
	    SI = (fixedRate * (principal + (i * perMonthIncrease)));
	    amount = SI;
	    System.out.println("value " + i + " and value " + amount);
	}

    }
}
