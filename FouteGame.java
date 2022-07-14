package MaheshSan;

public class FouteGame {
    int num1=0;int num2=0;
    int num3=0;int num4=0;
    int outCome=0;
    int result =8;
    boolean flag=false;

    public void generateAlgorithm() {

        if(additionPossibilty(num1,num2,num3,num4))
        {
            System.out.println("Correct");
        }

       else if (multiplicationPossibilty(num1,num2,num3,num4))
            {
                System.out.println("Correct");
            }

        else if(addMulPossibilty(num1,num2,num3,num4))
        {

        }


    }

    public boolean additionPossibilty(int num1,int num2,int num3,int num4)
    {

        outCome= num1+num2+num3+num4;
        if(outCome==result)
        {
            System.out.println("Correct Answer");
            flag=true;
        }
        return flag;
    }

    public boolean addMulPossibilty(int num1,int num2,int num3,int num4)
    {

        outCome= num1*num2+num3*num4;
        if(outCome==result)
        {
            System.out.println("Correct Answer");
            flag=true;
        }
        outCome= num1*num2+num3*num4;
        if(outCome==result)
        {
            System.out.println("Correct Answer");
            flag=true;
        }
        outCome= num1*(num2+num3)*num4;
       // if(outCo)
        return flag;
    }

    public boolean multiplicationPossibilty(int num1,int num2,int num3,int num4)
    {

        outCome= num1*num2*num3*num4;
        if(outCome==result)
        {
        System.out.println("Correct Answer");
        flag=true;
         }
        return flag;

    }

    public static void main(String[] args) {
        FouteGame f = new FouteGame();
        f.generateAlgorithm();
    }
}

