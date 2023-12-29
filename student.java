import java.util.Scanner;
public class student {
    
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int balance=0;
    private int courseCost = 6000;
    private static int id = 2596; //whenever new stu created this id is constant

    //prompt to enter student details
    public student(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nEnter the first name: ");
        this.firstName = in.nextLine();

        System.out.println("\nEnter the last name: ");
        this.lastName = in.nextLine();

        System.out.println("\nEnter the class year: ");
        System.out.println("\n1 - 1st year \n2 - 2nd year \n3 - 3rd year \n4 - 4th year\n ");
        this.gradeYear = in.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " +studentID);
    }

    //generate an id
    private void setStudentID(){
        // id is represented as year + static id
        id++;
        this.studentID = gradeYear + "" +id;

    }

    //enroll in courses
    public void enroll(){

        //loop till user enters 0 to get out
         do{
                System.out.println("Enter your enrolled course (Type Q to quit)");
                Scanner in = new Scanner(System.in);
                String course = in.nextLine();
                
                if(!course.equals("Q")){
                    courses = courses + "\n" + course;
                    balance = balance + courseCost;
                }
                else {
                    System.out.println("\nBREAK");
                    break;
                }
          } while (1 != 0);
          courses.toString();
        System.out.println("\nEnrolled courses are: " + courses);
        
    }

    //view balance 
    public void viewBalance(){
        System.out.println("\nYour amount to be paid is: \n" +balance);
    }

    // pay fees
    public void payFees(){
        viewBalance();
        System.out.println("\nEnter the amount you want to pay now: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        balance = balance - payment;
        
        while (payment <= 0 || payment > balance) {
            System.out.println("Invalid input. Please enter a valid payment amount: ");
            payment = in.nextInt();
        }

        System.out.println("\nThanks for payment of \nRs." + payment);
        viewBalance();
    }

    //status of the student
    public String showInfo(){
        return "Student Information:\n" +
        "Name: " + firstName + " " + lastName +
        "\nCourses Enrolled: " + courses +
        "\nBalance: " + balance;
    }

}
