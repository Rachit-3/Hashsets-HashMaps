package DSA_java;

import java.util.HashMap;

public class HaspMapSubArray
{
    public static void subArrayWithSum(int []arr,int s)
    {
        int start=0;
        int end=-1;
        int currSum=0;
       HashMap<Integer,Integer> a=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
           currSum+=arr[i];
           if(currSum-s==0)
           {
               end=i;
               break;
           }
               if(a.containsKey(currSum-s))
               {
                   start=a.get(currSum-s)+1;
                   end=i;
                   break;

               }
               a.put(currSum,i);

       }
       if(end!=-1)
        System.out.println(start+"-"+end);
       else
           System.out.println("not found");
    }
    public static void maxsubArrayWithSum(int []arr,int s)
    {
        int start=0;
        int end=-1;
        int currSum=0;
        int currlen=0;

        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            currSum+=arr[i];
            if(currSum-s==0)
            {
                end=i;
            currlen++;
            }
            if(a.containsKey(currSum-s))
            {   if (currlen < (i - a.get(currSum-s)))
            {start=a.get(currSum-s);
                end=i;}


            }

            a.put(currSum,i);

        }
        if(end!=-1)
            System.out.println(start+"-"+end);
        else
            System.out.println("not found");
    }


    public static void main(String[] args) {
        int [] arr={10,15,-5,15,-10,5};
        subArrayWithSum(arr,5);
        System.out.println("------------------------------");
   maxsubArrayWithSum(arr,10);

    }
}
