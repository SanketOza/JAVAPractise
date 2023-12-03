package Class;


import java.lang.*;
import java.util.*;


class Student{

    public String name;
    public int roll_no;

    public String course;

    public int m1,m2,m3;

    public int total_marks()
    {
        return m1+m2+m3;
    }

    public float average()
    {
        return total_marks()/3;
    }

    public char grade()
    {
        if(average()>70)
        {
            return 'A';
        }
        else if (average()>60 && average()<70)
        {
           return 'B';
        }
        else if (average()>50 && average()<60)
        {
            return 'C';
        }
        else if (average()>40 && average()<50)
        {
            return 'D';
        }
        return 0;
    }

    public String details()
    {
        return "Name : "+name+"\nRoll no : "+roll_no+"\nCourse : "+course+"\nTotal Marks : "+total_marks()+"\nAverage : "+average()+"\nGrade : "+grade();
    }

}


public class College {

    public static void main(String args[])
    {
        Student s = new Student();
        s.name = "Sanket Oza";
        s.roll_no = 36;
        s.course = "B.E Computer";
        s.m1=80;
        s.m2=80;
        s.m3=80;
        System.out.println(s.details());

    }


}
