import java.util.ArrayList;

public class ForL {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        
        for (String fruit : stringList) {
            System.out.println(fruit);
        }
    }
}

