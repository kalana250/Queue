import java.util.LinkedList;
import java.util.Queue;

public class StudentID {

    public static void main(String[] args) {

        Queue<Integer> id = new LinkedList<Integer>();

        id.offer(25245);
        id.offer(25246);
        id.offer(25247);
        id.offer(25248);

        System.out.println("Student ID's :- " + id);

        int removedID = id.poll();

        System.out.println("Removed student ID :- " + removedID);

        System.out.println("Updated student ID :- " + id);

















    }

}
