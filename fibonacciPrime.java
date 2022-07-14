package MaheshSan;

public class fibonacciPrime {
int primeCount=0;
int number1=1;
int number2=1;
int sum;

boolean flag=false;

public boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
        if (n % i == 0) {
            flag =false;
            break;
        }
        else
        {
            flag=true;

        }
    }
    return flag;
}

    public void fibonacci()
    {
        flag=false;
        while(primeCount<10)
        {
         sum=number1+number2;
         number1=number2;
         number2=sum;

         if(isPrime(sum))
         {
             System.out.println(sum);
             ++primeCount;
         }

       }
    }

    public static void main(String[] args) {

        fibonacciPrime fp =new fibonacciPrime();
        fp.fibonacci();
        System.out.println("First 10 Fibonacci prime numbers");
    }
}
