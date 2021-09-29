class even_fibbonacii
{
    public static void main(String[] args) {
        int sum=2;
        int f=1,s=2,t=f+s;
        while(t<4000000)
        {
            
            f=s;
            s=t;
            t=f+s;
            if(t%2==0)
                sum+=t;
        }    
        System.out.print("Sum = " + sum);
    }
}