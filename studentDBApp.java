import java.util.Scanner;

public class studentDBApp {
    public static void main(String[] args) {
        
        System.out.println("Enter the number of students: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        student[] s = new student[number];
    
        //create no.of students
        for(int n=0; n<number; n++){
            s[n] = new student();
            s[n].enroll();
            s[n].payFees();
        }
        
        for(int n=0; n<number; n++){
            System.out.println(s[n].toString());
        }
    }
}