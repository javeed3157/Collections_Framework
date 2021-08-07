import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(63);
        list.add(65);
        list.add(3);
        list.add(3);
        list.add(1);
        System.out.println("minElement is : "+Collections.min(list));
        System.out.println("maxElement is : "+Collections.max(list));
        System.out.println("frequency of 3 is : "+Collections.frequency(list, 3));
        System.out.println("minElement is : "+Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);

        //Sorting custom classes
        List<Student> li=new ArrayList<>();
        li.add(new Student("Bravo", 99));
        li.add(new Student("Jaddu", 8));
        li.add(new Student("Raina", 3));
        li.add(new Student("Msd", 7));
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        // Collections.sort(li,new Comparator<Student>(){
        //     @Override
        //     public int compare(Student o1,Student o2){
        //         return o1.name.compareTo(o2.name);
        //     }
        // });
        Collections.sort(li, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(li);
    }
}
