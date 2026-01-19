import java.util.*;
class AttendanceStatusEvaluator{
  public Static void main(String[]args)
  {
    Scanner s= new Scanner(System.in);
    int Attendance =s.nextInt();
    if(Attendance>85)
    {
      System.out.println("Excellent");
    }
    else if(Attendance>=60 && Attendance<=85)
    {
      System.out.println("Satisfactory");
    }
    else if(Attendance<60)
    {
      System.out.println("Poor");
    }}}
