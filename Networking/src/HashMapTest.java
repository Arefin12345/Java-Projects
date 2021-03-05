import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer,String> student = new HashMap<Integer,String>();
        student.put(54,"Arefin");
        student.put(54,"tasin");


        System.out.println(student.get(54));
    }



}