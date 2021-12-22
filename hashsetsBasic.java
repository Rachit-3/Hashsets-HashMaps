package DSA_java;
import java.util.*;
public class hashsetsBasic {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(10);
        h.add(67);
        h.add(89);
        h.add(79);
        System.out.println(h.contains(67));
        System.out.println("------------------");
        h.remove(67);
        System.out.println(h.size());
        System.out.println("------------------");
        System.out.println(h);
        System.out.println("------------------");

        h.clear();


    }
}
