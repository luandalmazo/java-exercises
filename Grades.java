import java.util.Scanner;

public class Grades 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        float grade;
        float highest;
        float highest_grade = 0;

        /* Receives all the 4 grades of 30 students */
        /* Then print the highest grade of the student, and the highest grade of the class */
        for (int i =0; i<30; i++)
        {
            highest = 0;
            for (int j = 0; j<4; j++)
            {
                grade = input.nextFloat();
                if (grade > highest)
                    highest = grade;
            }
            if (highest > highest_grade)
                highest_grade = highest;
            System.out.println("Highest grade of student["+i+"] = "+highest);
        }

        System.out.println("highest grade of the class is: "+highest_grade);

        input.close();
    }    
}
