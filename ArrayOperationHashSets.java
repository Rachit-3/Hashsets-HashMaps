package DSA_java;

import java.util.HashSet;

public class ArrayOperationHashSets {
    public static HashSet<Integer> FindUnion(int []arr,int []arr2)
    {   HashSet<Integer> a=new HashSet<>();
        for (int k : arr) a.add(k);
        for(int j=0;j<arr2.length;j++)
            a.add(arr[2]);
        return a;

    }
    public static int  countDistinct(int [] arr)
    {
        HashSet<Integer> a=new HashSet<>();
        for (int k : arr) a.add(k);
        return a.size();

    }
   public static int countIntersection(int []arr,int [] arr2)
   {
       HashSet<Integer> h=new HashSet<>();
       int count=0;
       for (int k: arr)
           h.add(k);
       for (int i : arr2) {

           if (h.contains(i)) {

               count++;
               h.remove(i);
           }
       }
       return count;
   }
    public static void main(String[] args) {
        int [] arr={1,3,7,2,4,3,8,9,3,9};
        int [] arr2={2,7,4,8,0,9};
        HashSet<Integer> h=FindUnion(arr,arr2);
        System.out.print(h);
        System.out.println();
        System.out.println("---------------");
        System.out.println(countDistinct(arr));
        System.out.println("---------------");
        System.out.println(countIntersection(arr,arr2));
    }
}
