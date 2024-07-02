package basic;
public class SIPCalculator {
    public static void main(String[] args) {
        double monthlyInvestment = 5000;
        double expectedReturnsInPer = 12;
        int periodInYears = 10;
        calculateSIP(monthlyInvestment, expectedReturnsInPer, periodInYears);
    }
    public static void calculateSIP(double monthlyInvestment, double expectedReturnsInPer, int periodInYears) {
        double monthlyRate = (expectedReturnsInPer / 100) / 12;
        int totalMonths = periodInYears * 12;
        double principleAmount = monthlyInvestment * totalMonths;
        double futureValue = 0;
        for (int i = 0; i < totalMonths; i++) {
            futureValue = (futureValue + monthlyInvestment) * (1 + monthlyRate);
        }
        double estimatedReturns = futureValue - principleAmount;
        System.out.println("Principle Amount: " + principleAmount);
        System.out.println("Estimated Returns: " + estimatedReturns);
        System.out.println("Total Value: " + futureValue);
    }
}
