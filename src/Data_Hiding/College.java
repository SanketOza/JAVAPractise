package Data_Hiding;

import java.util.*;
import java.lang.*;

class Student{

    private int roll_n0;
    private String name;
    private String course;

    private double m1,m2,m3;

    public String getName()
    {
        return name;
    }
    public int getRoll_no()
    {
        return roll_n0;
    }
    public String getCourse()
    {
        return course;
    }
    public double getM1() {
        return m1;
    }
    public double getM2()
    {
        return m2;
    }
    public double getM3()
    {
        return m3;
    }

    public void setName(String n)
    {
        name = n;
    }
    public void setRoll_n0(int r)
    {
        roll_n0 = r;
    }
    public void setCourse(String c)
    {
        course = c;
    }
    public void setM1(double p)
    {
        m1 = p;
    }
    public void setM2(double c)
    {
        m2 = c;
    }
    public void setM3(double m)
    {
        m3 = m;
    }
    public double total()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return total()/3;
    }
    public char grade()
    {

        if(average()>80)
            return 'A';
        else if (average()>70 && average()<=80) {
            return 'B';
        }
        else if (average()>55 && average()<=70) {
            return 'C';
        }
        else if (average()>35 && average()<=55)
        {
            return 'D';
        }
        else
        {
            return 'E';
        }

    }
    public String details()
    {
        return "Name : "+getName()+"\nRoll no : "+getRoll_no()+"\nCourse : "+getCourse()+"\nTotal Marks : "+total()+
                "\nAverage : "+average()+"\nGrade : "+grade();
    }

}
public class College {

    public static void main(String args[])
    {

        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        s.setName(name);


        System.out.println("Enter Course : ");
        String subject = sc.nextLine();
        s.setCourse(subject);

        System.out.println("Enter Roll no : ");
        int roll_n0 = sc.nextInt();
        s.setRoll_n0(roll_n0);


        System.out.println("Enter Marks of three subjects : ");
        int m4 = sc.nextInt();
        s.setM1(m4);
        int m5 = sc.nextInt();
        s.setM2(m5);
        int m6 = sc.nextInt();
        s.setM3(m6);

        System.out.println("Details of student are : \n\n"+s.details());

    }

}
