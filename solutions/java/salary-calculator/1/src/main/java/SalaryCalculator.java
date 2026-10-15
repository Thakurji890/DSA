public class SalaryCalculator {
    private double penalty = 0.15;
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ?  1 - penalty : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double calculateSalary = (1000.00 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return calculateSalary > 2000.00 ? 2000.00 : calculateSalary;
    } 
}
