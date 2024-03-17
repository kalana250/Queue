import java.util.LinkedList;
import java.util.Queue;

public class Enqueue {

    public static void main(String[] args) {

        Queue<String> language = new LinkedList<>();

        language.add("Java");
        language.add("Python");
        language.add("C");

        System.out.println("Programming Language :-" + language);

        String top_element = language.peek();

        System.out.println("First Programming Lnaguage in list :- " + top_element);

        String removed_value = language.poll();
        System.out.println("Removed Programming Languagw :- " + removed_value);
        System.out.println("Update Programming Language :- " + language);

        language.offer("Swift");
        System.out.println("Updated Programming Language :- " + language);

    }

}
