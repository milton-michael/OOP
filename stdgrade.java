import java.util.*;

public class Stdgrade {
    public static void main(String[] args)
    {
        // Author info
        // Milton Michael
        // Date : 19/07/2025
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name=in.nextLine();
        System.out.println("Enter the mark");
        float mark=in.nextInt();
        String grade;

        if (mark>=90)
        {
        grade="S";
        }

        else if (mark>=85&&mark<90) 
        {
        grade="A+";
        }

        else if (mark>=80&&mark<85)
        {
            grade="A";    
        }

        else if (mark>=75&&mark<80) 
        {
            grade="B+";
            
        }

        else if (mark>=70&&mark<75)
        {
            grade="B";
            
        }

        else if (mark>=65&&mark<70)
        {
            grade="C+"; 
        }

        else if (mark>=60&&mark<65)
        {
            grade="C";
        }

        else if (mark>=50&&mark<60)
        {
            grade="D";
            
        }

        else if (mark>=40&&mark<50)
        {
            grade="P";
            
        }

        else
        {
            grade="F";
            
        }

        System.out.println("grade of the "+ name +" is "+ grade);


    }

// Milton Michael
    // 19/7/25
    
}