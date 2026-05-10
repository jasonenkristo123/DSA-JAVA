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


class Main {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}