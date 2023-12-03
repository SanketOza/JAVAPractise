package Constructors;


class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;

    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}

    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }

    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }

    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }

    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }

}


public class Student {

    public static void main(String args[])
    {
        Subject sub[] = new Subject[3];
        sub[0] = new Subject("101","Physics",96);
        sub[1] = new Subject("102","Chemistry",98);
        sub[2] = new Subject("103","Maths",100);


        for(Subject s : sub)
        {
            System.out.println(s);
        }



    }


}
