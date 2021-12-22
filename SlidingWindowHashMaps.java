package DSA_java;

import java.util.ArrayList;
import java.util.HashMap;

public class SlidingWindowHashMaps {
    public static ArrayList<Integer> countDistinct(int []arr,int k)
    {
        HashMap <Integer,Integer> a=new HashMap<>();
        ArrayList<Integer> aa=new ArrayList<>();

        for(int i=0;i<k;i++)
        {
            a.put(arr[i],a.getOrDefault(arr[i],0)+1);
        }
        aa.add(a.size());
        for(int i=k;i<arr.length;i++)
        {
            if(a.get(arr[i-k])==1)
                a.remove(arr[i-k]);
            else
                a.put(arr[i-k],a.get(arr[i-k])-1);
            a.put(arr[i],a.getOrDefault(arr[i],0)+1);
            aa.add(a.size());
        }
        return aa;
    }
    public static void main(String[] args) {
int []arr={1,2,2,1,3,1,1,3};
        System.out.println(countDistinct(arr,4));

    }
}
