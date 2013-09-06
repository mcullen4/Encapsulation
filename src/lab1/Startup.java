package lab1;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        Employee e1 = new Employee("Fred","Smith","123-4567");
        System.out.println("The employee's status is: " + e1.getOrientationStatus());
    }
    
    
}
