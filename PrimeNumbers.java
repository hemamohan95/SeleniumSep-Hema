package week1.assignments;

public class PrimeNumbers {

	public static void main(String[] args) {

        int Input = 13;
        boolean flag = false;
        for(int i = 2; i <= Input/2; ++i)
        {
            if(Input % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("It is a prime number.");
        else
            System.out.println("It is not a prime number.");
    }

}

