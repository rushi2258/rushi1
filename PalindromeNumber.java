public class PalindromeNumber
{
    public static void main (String[]args)
    {
        int  num=14241, reverse =0, rem, temp;
        temp = num;
            while (temp != 0)
            {
                rem =temp % 10;
                reverse = reverse * 10 + rem;
                temp /= 10;
            };
            if (reverse == num)
                System.out.println(num+ "is a palindrome");
            else
                System.out.println(num+ " is not a palindrome");
    }
}
