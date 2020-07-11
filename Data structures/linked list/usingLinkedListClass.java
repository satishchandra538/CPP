import java.util.LinkedList;

public class usingLinkedListClass {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();

        list.add("my");
        list.add(" name");
        list.add(" is");
        list.add(" satish");
        list.add(" Chandra");
        list.add(" Gupta");
        for (String str : list) {
            System.out.print(str);
        }
        System.out.println();
        list.remove(2);
        for (String str : list) {
            System.out.print(str);
        }
    }
}