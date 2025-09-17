public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double mul = daysSkipped < 5 ? 1.00 : 0.85;
        return mul;
    }

    public int bonusMultiplier(int productsSold) {
        int bonus = productsSold >=20 ? 13 : 10;
        return bonus;
        
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
        
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double sal = salaryMultiplier(daysSkipped) * 1000.00 + bonusForProductsSold(productsSold) ;
            return sal > 2000.00 ? 2000.00 : sal;
    } 
}
