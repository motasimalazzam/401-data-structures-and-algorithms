/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

public class App {

    public static void main(String[] args) {

       HashTable<String, Integer> clubs = new HashTable<String, Integer>();

        clubs.add("Real Madrid",100);
        clubs.add("Barcelona", 200);
        clubs.add("Man United", 300);
        clubs.add("Alhilal", 100);

        System.out.println("The size is => " + clubs.getSize());
        System.out.println(clubs.get("Real Madrid"));
        System.out.println("Delete Barcelona => " + clubs.remove("Barcelona"));
        System.out.println("The size is => " + clubs.getSize());
        System.out.println(clubs.contains("ss"));
        System.out.println(clubs.contains("Real Madrid"));

    }
}

