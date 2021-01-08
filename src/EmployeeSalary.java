public class EmployeeSalary {
    public static double yearlySalay(double NumberOfHours, double SalaryPerHour, double VacationDays) {
        if (NumberOfHours < 0) { //Invalid input
            return -1;
        }
        if (SalaryPerHour < 0) { //Invalid input
            return -1;
        }
        double total_hours = 52 * NumberOfHours; // 1 year = 52 weeks
        double unpaid_salary = 8 * VacationDays * SalaryPerHour;
        double gross_salary = total_hours * SalaryPerHour - unpaid_salary;
        return gross_salary;
    }
    public static void main(String[] args) {
        double salary = yearlySalay(40, 15, 8);
        System.out.println(salary);
    }
    
}
