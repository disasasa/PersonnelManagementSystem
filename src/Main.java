// Importing necessary libraries
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        // Creating an ArrayList to store instances of Person (Employee and Student)
        ArrayList<Person> personArray = new ArrayList<>();
        // Adding data to the ArrayList
        personArray.add(new Employee("Steve", "Jobs", "Softare Engineer", 1000000.00));
        personArray.add(new Employee("Michal", "Jordan", "Basketballer", 5000000.99));
        personArray.add(new Studen("Balasy", "Zhurttyn", 2.66));
        personArray.add(new Studen("Almas", "Satybaldy",  3.6));
        // Sorting the ArrayList based on payment (using Comparable)
        Collections.sort(personArray);
        // Outputting the sorted data
        printData(personArray);
    }
    //output method
    public static void printData(Iterable<Person> personArray){
        for(Person person : personArray) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge" + " Position: "+person.getPosition());
        }
    }
}