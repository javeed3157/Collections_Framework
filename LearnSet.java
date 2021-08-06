import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        //HashSet is Unordered and time complexity of O(1)
        set.add(10);
        set.add(9);
        set.add(205);
        set.add(7);
        set.add(15);
        set.add(9);
        System.out.println(set);
        set.remove(15);
        System.out.println(set);
        System.out.println(set.contains(10));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        // set.clear();
        // System.out.println(set);

        Set<Integer> se=new LinkedHashSet<>();
        //LinkedHashSet is ordered
        se.add(10);
        se.add(9);
        se.add(205);
        se.add(7);
        se.add(15);
        se.add(9);
        System.out.println(se);
        se.remove(15);
        System.out.println(se);
        System.out.println(se.contains(10));
        System.out.println(se.isEmpty());
        System.out.println(se.size());
        // se.clear();
        // System.out.println(se);

        Set<Integer> s=new TreeSet<>();
        //LinkedHashSet is ordered and time complexity of O(logN)
        s.add(10);
        s.add(9);
        s.add(205);
        s.add(7);
        s.add(15);
        s.add(9);
        System.out.println(s);
        s.remove(15);
        System.out.println(s);
        System.out.println(s.contains(10));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        // s.clear();
        // System.out.println(s);

        Set<Student> so=new HashSet<>();
        so.add(new Student("sam",1));
        so.add(new Student("tom",2));
        so.add(new Student("pal",3));
        so.add(new Student("bot",2));
        System.out.println(so);

    }
}
