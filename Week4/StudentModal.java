public class StudentModal {
    private String name;
    private String StudentID;
    private int marks;
    public StudentModal( String name, String StudentID,int marks) {
        this.name = name;
        this.StudentID = StudentID;
        this.marks = marks;
    }
    public String GetName()
    {
        return name;  
    }
    public int GetMarks() 
    {
        return marks;
    }
    public boolean SetMarks(int m)
    {
        if(m > 100 || m < 0)
        {
            return false;
        }
        else
        {
            this.marks = m;
            return true;
        }
    }
    public String GetStudentID()
    {
        return StudentID;
    }
    public boolean SetStudentID(String id)
    {
        if(id == null || id.length()!=10)   
        {
            return false;
        }
        else{
            this.StudentID=id;
            return true;
        }
    }
    public boolean HasPassed()
    {
        if (GetMarks()>=40)
        {
            System.out.println("Has Passed");
            return true;
        }
        else
        {
            System.out.println("Has Failed");
            return false;
        }
        
    }
    public String Classification(String cs)
    {
if(GetMarks()>=90)
{
    return " A+";
}
else if(GetMarks()>=80)
{
    return "A";
}
else if(GetMarks()>=70)
{
    return " B+";
}
else if(GetMarks()>=60)
{
    return " B";
}
else if(GetMarks()>=50)
{
    return "C+";
}
else
{
    return "F";
} 
}
public String toString()
{
    return name + StudentID + marks;

}



    }


    






    


    
    
