package practiceTasks;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public String toString() {
        return "PracticeTask{" +
                "salary=$" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }

    public double salary() {
        return (hourlyRate * weeklyHours * 52);
    }

    public double stateTax(){
        return salary()*stateTaxRate/100;
    }

    public double federalTax(){
        return salary()*federalTaxRate/100;
    }

    public double salaryAfterTax(){
        return salary()-(stateTax()+federalTax());
    }

}
