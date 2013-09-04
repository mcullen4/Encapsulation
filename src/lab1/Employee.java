package lab1;

import java.util.Date;
import java.util.Scanner;


/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private String orientationStatus="Orientation in Progress";
    
    Scanner keyboard = new Scanner(System.in);
    

    public Employee(String firstName, String lastName, String ssn, Date birthDate) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn=ssn;
        this.birthDate=birthDate;
        beginOrientation();
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

   
    public boolean isMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public String getOrientationStatus() {
        return orientationStatus;
    }

      
    public final void beginOrientation(){
        meetWithHrForBenefitAndSalryInfo();
    }
    
    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        meetDepartmentStaff();
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        reviewDeptPolicies();
       
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        
        reviewedDeptPolicies = true;
        setCubeId();   
    }

    private void setCubeId(){
        System.out.println("What is the employee's cube ID?");
        cubeId=keyboard.next();
        moveIntoCubicle();
    }
    // Assume this must be performed 4th
    private void moveIntoCubicle() {
        movedIn = true;
        orientationStatus="Orientation is complete";
        
        }

    }
   
