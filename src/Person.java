public class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private int id;
    private String Firstname;
    private String Lastname;

    public Person(){
        this.id = id_gen++;
    }
    public Person(String Firstname, String Lastname){
        this.id = id_gen++;
        setFirstname(Firstname);
        setLastname(Lastname);
    }
    //getters and setters
    public int getId() {
        return id;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getFirstname() {
        return Firstname;
    }
    public String toString() {
        return getId() + ". " + getFirstname() + " " + getLastname();
    }
    public String getPosition() {
        return "Student";
    }
    //from interface
    public double getPaymentAmount() {
        return 0.00;
    }
    //comparing payment
    public int compareTo(Person person){
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}