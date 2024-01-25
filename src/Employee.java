public class Employee extends Person {
    private String position;
    private Double salary;

    public Employee(){
        super();
    }
    // Parameterized constructor initializing both superclass and Employee-specific fields
    public Employee(String Firstname, String Lastname, String position, Double salary){
        super(Firstname, Lastname);
        setPosition(position);
        setSalary(salary);
    }
    //getters amd setters others inherited from Person
    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public double getPaymentAmount() {
        return getSalary();
    }

    public String getPosition() {
        return position;
    }
    // toString method to represent the Employee object as a string
    public String toString() {
        return "Employee: " + getId() +
                ". " + getFirstname() + " " + getLastname();
    }
}