public class largest_palindrome_3_digit {
    public static void main(String[] args) {
        int mx=0;
        for(int i=100;i<=999;i++)
        {
            for(int j=100;j<999;j++)
            {
                if(check_palin(i*j))
                {
                    mx = Math.max(mx, i*j);
                }
            }
        }
        System.out.println(mx);
    }

    static boolean check_palin(int x)
    {
        int rev=x%10,t=x;
        x=x/10;
        while(x!=0)
        {
            rev=(rev*10)+(x%10);
            x=x/10;
        }
        if(rev==t)
            return true;
        return false;
    }
}
