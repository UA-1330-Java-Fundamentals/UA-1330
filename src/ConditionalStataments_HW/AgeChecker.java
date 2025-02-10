package ConditionalStataments_HW;

public class AgeChecker
{
    public String checkIfAdult(int age)
    {
      if(age <=0||age >=150)
      {
          return "Invalid Age";
      }
      else if(age >=18)
      {
          return "You are an adult";
      }
      else
      {
          return "You are not an adult";
      }
    }
}
