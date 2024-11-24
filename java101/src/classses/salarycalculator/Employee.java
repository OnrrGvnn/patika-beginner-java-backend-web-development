package classses.salarycalculator;

public class Employee {
    String name;
    int salary;
    int workingHours;
    int hireYear;

    public Employee(String name, int salary, int workingHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
        this.hireYear = hireYear;
    }


    double tax() {
        double tax = 0.0;

        if (this.salary > 1000) {
            tax = this.salary * 0.03;
        }

        return tax;

    }

    int bonus() {
        int bonusMoney = 0;
        int perWorkHoursMoney = 30;

        if (this.workingHours > 40) {
            bonusMoney = (this.workingHours - 40) * perWorkHoursMoney;
        }

        return bonusMoney;

    }

    double raiseSalary() {
        double raise = 0.0;
        int currentYear = 2024;

        if (currentYear - this.hireYear < 10) {
            raise = this.salary * 0.05;
        } else if ((currentYear - this.hireYear >= 10) && (currentYear - this.hireYear < 20)) {
            raise = this.salary * 0.10;
        } else {
            raise = this.salary * 0.15;
        }

        return raise;

    }

    void infoWorker() {
        double total;

        total = this.salary + bonus() + raiseSalary() - tax();

        System.out.println("\nWorker's Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Weekly Working Hours : " + this.workingHours);
        System.out.println("Hire Year : " + this.hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Salary Increase : " + raiseSalary());
        System.out.println("Salary With Tax And Bonus : " + (this.salary + bonus() - tax()));
        System.out.println("Total Salary: " + total);

    }

}