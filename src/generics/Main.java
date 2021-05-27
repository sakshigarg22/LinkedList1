package generics;

import static generics.Node.*;

public class Main {
    public static void main(String[] args){
        /*Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        Node<Integer> head = node1;
        node1.next = node2;
        node2.next = node3;
        print(head);
        takeInput();*/
        Node<Integer> head = takeInput();
        //head = insert(head,2, 80);
        //head = delete(head, 2);
        //head = addElement(head);
        System.out.println(midPoint(head));
        //increment(head);



    }
}
