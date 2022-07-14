package MaheshSan;

public class arrayIntegers {

    public void findPairs()
    {
        int ar[]={1,2,3,4,5,6};
        int k=5,rem;

        for(int i=0 ;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]<ar[j])
                {
                    rem=((ar[i]+ar[j])%k);
                    if(rem == 0)
                    {
                        System.out.print("[" +ar[i]+ "," +ar[j]+ "]");
                    }

                }
            }
        }
    }


    public static void main(String[] args) {
        arrayIntegers a=new arrayIntegers();
        a.findPairs();
    }
}
