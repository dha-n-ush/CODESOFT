import java.util.*;
class Task {
    public static void main(String[] args) {
        StudentGrade obj =new StudentGrade();
        obj.display();
    }
}
class StudentGrade
{
    Scanner input = new Scanner(System.in);
    private double avg;
    private int total;
    private char grade;
    boolean flag=true;
    StudentGrade()
    {
        int i=0;
        int sum=0;
        int g=0;
        String subject[] = {"Tamil","English","Maths","Science","Social"};
        check:
        while(i<=4)
        {
            System.out.print("Enter "+ subject[i]+" marks :");
            g=input.nextInt();
            if(g>100 || g<0)
            {
                System.out.println("Invalid Input");   
                continue check; 
            }
            else if(g<35)
            {
                sum+=g;
                flag = false;
            }
            else
            {
                sum+=g;
            }
            i++;
        }
        this.total = sum;
    }
    public void getGrade()
    {
        if(flag)
        {
            if(avg >= 90 )
            {
                System.out.println("Grade A");
                grade='A';
            }
            else if(avg >= 80)
            {
                System.out.println("Grade B");
                grade='B';
            }
            else if(avg >= 70)
            {
                System.out.println("Grade C");
                grade='C';
            }
            else if(avg >= 50)
            {
                System.out.println("Grade D");
                grade='D';
            }
            else if(avg >= 35) 
                System.out.println("Grade E");
                grade='E';
            else
                System.out.println("You Are Failed \" Better Luck Next Time \" ");
        }
        else 
            System.out.println("you are failed in subjects");
        
    }
    public double getTotal()
    {
        return total;   
    }
    public double getAvg()
    {
        avg=total/5.0;
        return avg;
    }
    public void display()
    {
        System.out.println("Total marks ; "+ getTotal());
        System.out.println("Total average ; "+ getAvg());
        getGrade();
        
    }
    
}