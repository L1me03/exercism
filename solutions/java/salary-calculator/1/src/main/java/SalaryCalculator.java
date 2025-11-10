public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {    
        
       return (daysSkipped >= 5) ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
            double baseSalary = 1000;
            double salaryAfterPenalty = baseSalary * salaryMultiplier(daysSkipped);
            double bonus = bonusForProductsSold(productsSold);

            double finalSalary = salaryAfterPenalty + bonus;

        return (finalSalary >= 2000) ? 2000 : finalSalary;
    } 
}
