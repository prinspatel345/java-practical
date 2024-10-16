 class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;


 Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }


    public double getYearlySalary() {
        return monthlySalary * 12;
    }


    public void giveRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }
}

 class practical13{
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", "Doe", 3000.00);
        Employee emp2 = new Employee("Jane", "Smith", 4000.00);

        System.out.printf("%s %s's yearly salary: %.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s's yearly salary: %.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());


        emp1.giveRaise(10);
        emp2.giveRaise(10);

               System.out.printf("After 10%% raise, %s %s's yearly salary: %.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("After 10%% raise, %s %s's yearly salary: %.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}