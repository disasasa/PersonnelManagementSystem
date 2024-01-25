public class Studen extends Person{
    private Double gpa;
    public Studen(){
        super();
    }
    // Parameterized constructor
    public Studen(String Firstname, String Lastname, Double gpa){
        super(Firstname, Lastname);
        setGpa(gpa);
    }
    // Setter and getter for GPA
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    public Double getGpa() {
        return gpa;
    }
    // Implementation of the abstract method from the Payable interface
    public double getPaymentAmount() {
        if(getGpa() > 2.67){
            return 41898.00;
        }
        else{
            return 0.00;
        }
    }
    //output
    public String toString() {
        return "Student: " + getId() + ". " + getFirstname() + " " + getLastname();
    }
}