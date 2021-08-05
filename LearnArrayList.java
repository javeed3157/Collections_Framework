import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LearnArrayList {
    public static void main(String[] args) {
        // ArrayList<String> studentsName= new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // System.out.println(list);
        list.add(4);
        // System.out.println(list);
        list.add(1, 10);
        // System.out.println(list);
        List<Integer> newList=new LinkedList<>();
        newList.add(20);
        newList.add(30);
        newList.add(90);
        list.addAll(newList);
        // System.out.println(list);        
        // System.out.println(list.get(1));
        list.remove(1);
        // System.out.println(list);
        list.remove(Integer.valueOf(20));
        // System.out.println(list);
        // newList.clear();
        list.set(2,1000);//It runs in O(1)
        // System.out.println(list);
        // System.out.println(list.contains(1000));
        for(int i=0;i<list.size();i++){
            // System.out.println(list.get(i));
        }
        for(Integer i:list){
            System.out.println(i);//Best way to use
        }
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
