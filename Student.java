import java.util.Objects;

public class Student {
    String name;
    int roll;
    public Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    @Override
    public String toString() {
        return "Student{"+"name='"+name+'\''+", rollNo="+roll+'}';
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Student student=(Student)obj;
        return roll==student.roll;
    }
    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
