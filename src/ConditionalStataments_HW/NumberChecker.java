package ConditionalStataments_HW;

public class NumberChecker {
    public static String checkNumberInRangeAndParity(int number, int lowerBound, int upperBound)
    {
      if (number < lowerBound || number > upperBound)
      {

          return "The number " +number+ " is out of the range ["+lowerBound+ ", " +upperBound+"]";
      }
      else
      {
          if(number%2==0)
          {
              return "The number " +number+ " is within the range and is even";
          }
          else
          {
              return "The number " +number+ " is within the range and is odd";
          }
      }

    }

    public static void main(String[] args) {
        checkNumberInRangeAndParity(1,10,10);
    }
}
