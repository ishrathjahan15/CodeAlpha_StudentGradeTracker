import java.util.ArrayList;
import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // using ArrayList for storing the names of the students and their scores.
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> maths = new ArrayList<>();
    ArrayList<Integer> java = new ArrayList<>();
    ArrayList<Integer> english = new ArrayList<>();
    int s1,s2,s3,total,high,low;
    float avg;
    String name;
    while(true)
    {
    System.out.println("==== STUDENT GRADE TRACKER ====");
    System.out.println("1.Add Students");
    System.out.println("2.Display Students grade");
    System.out.println("3.Exit");
    System.out.println("Enter your choice: ");
    int n = sc.nextInt();
    sc.nextLine();
    switch(n)
    {
        case 1 ->
        { 
            System.out.println("Enter the name of the student : ");
        name = sc.nextLine();
        names.add(name);
        System.out.println("Enter maths marks(out of 100) : ");
        s1 = sc.nextInt();
            while(s1 > 100 || s1 < 0)
        {
            System.out.println("Invalid marks!!\nPlease enter valid marks");
             System.out.println("Enter maths marks(out of 100) : ");
            s1 = sc.nextInt();
        }
        maths.add(s1);
        System.out.println("Enter java marks(out of 100) : ");
        s2 = sc.nextInt();
            while(s2 > 100 || s2 < 0)
        {
            System.out.println("Invalid marks!!\nPlease enter valid marks");
             System.out.println("Enter java marks(out of 100) : ");
            s2 = sc.nextInt();
        }
        java.add(s2);
        System.out.println("Enter english marks(out of 100) : ");
        s3 = sc.nextInt();
            while(s3 > 100 || s3 < 0)
        {
            System.out.println("Invalid marks!!\nPlease enter valid marks");
             System.out.println("Enter english marks(out of 100) : ");
            s3 = sc.nextInt();
        }
        english.add(s3);
        System.out.println("Added successfully!");
        }

        case 2 ->
        {
        System.out.printf("%-5s %-25s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "S.No", "Name of the student", "Maths", "Java", "English", "Total","Average","Highest","Lowest", "Grade");
        int c = names.size();
        for(int i=0;i<c;i++)
        {
            total = maths.get(i) + java.get(i) + english.get(i);
            char grade;
            avg = total/3.0f;

            
            // for finding grade
            if (total >= 250 && maths.get(i) >= 33 && java.get(i) >= 33 && english.get(i) >= 33)
            grade = 'A';
            else if (total >= 210 && maths.get(i) >= 33 && java.get(i) >= 33 && english.get(i) >= 33)
            grade = 'B';
            else if (total >= 180 && maths.get(i) >= 33 && java.get(i) >= 33 && english.get(i) >= 33)
            grade = 'C';
            else if (total >= 150 && maths.get(i) >= 33 && java.get(i) >= 33 && english.get(i) >= 33)
            grade = 'D';
            else if (total >= 120 && maths.get(i) >= 33 && java.get(i) >= 33 && english.get(i) >= 33)
            grade = 'E';
            else
            grade = 'F';

            // for finding highest score
             high = Math.max(maths.get(i),Math.max(java.get(i),english.get(i)));
            

            // for finding lowest score
            low = Math.min(maths.get(i),Math.min(java.get(i),english.get(i)));

            System.out.printf("%-5d %-25s %-10d %-10d %-10d %-10d %-10.2f %-10d %-10d %-10s%n",i + 1,names.get(i),maths.get(i),java.get(i),english.get(i),total,avg,high,low,grade);
        }
        }


        case 3 ->
        {  
            System.out.println("Thank you for using Student grade tracker!\nExiting from the program. Goodbye!");
            System.exit(0);
        }


        default ->
        {
             System.out.println("Enter a valid choice!!");
        }
    }
    }
    }
}
