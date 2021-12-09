// @author Loeinskaya Ekaterina

package java2lesson3;
import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {

        String [] words = {"apple", "tea", "orange", "kitchen", "cat", "pen", "morning", "dream", "coffee", "tea"};
        Set<String> list = new HashSet<>(Arrays.asList(words));
        System.out.println(list);

        HashMap<String, Integer> list2 = new HashMap<>();
        for(String word: words){
            list2.put(word, list2.getOrDefault(word, 0) + 1);
        }
        System.out.println(list2);
        System.out.println("\n");

        PhoneBook myBook = new PhoneBook();

        myBook.addRecord("Ivanov","7378292");
        myBook.addRecord("Petrov", "57389827");
        myBook.addRecord("Smirnov", "748394739");
        myBook.addRecord("Ogurtsov", "43787268");
        myBook.addRecord("Nedelko", "6758937");
        myBook.addRecord("Kuzin", "6768937");
        myBook.addRecord("Ogurtsov", "6748930");

        System.out.println("My Phone Book: ");
        myBook.infoMyBook();

        System.out.println("Number you was looking for: ");
        System.out.println(myBook.getPhone("Ogurtsov"));
    }
}
