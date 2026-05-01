import java.util.LinkedList;

public class LatLinked {
    public static void main(String[] args) {
        LinkedList<Integer> listInt = new LinkedList<>();
        System.out.println(listInt);
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        System.out.println(listInt);
        listInt.add(4);
        listInt.addFirst(5);
        listInt.add(3, 6);
        listInt.remove(2);
        listInt.remove(3);
        System.out.println(listInt);
        listInt.removeAll(listInt);
        System.out.println(listInt);
    }
}
