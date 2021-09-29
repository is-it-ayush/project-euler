public class largest_prime_factor {
    public static void main(String[] args) {
        long y = (long) 600851475143.0;
        for(long i = 2; i< y; i++) {
            while(y%i == 0) {
               y = y/i;
            }
         }
         if(y>2) {
            System.out.println(y);
         }       
    }
}
