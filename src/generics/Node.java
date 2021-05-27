package generics;
import java.util.*;
public class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        next = null;
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node<Integer> takeInput() {
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null)
                head = newNode;
            else {
                Node<Integer> temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        Node<Integer> newNode = new Node<>(data);
        Node<Integer> temp = head;
        int i = 0;
        if(pos == 0){
            newNode.next = head;
            return newNode;
        }
        while(i < pos - 1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;

    }
    public static Node<Integer> delete(Node<Integer> head, int pos){
        Node<Integer> temp = head;
        int i = 0;
        if(pos == 0){
            temp = temp.next;
            return temp;
        }
        while(i < pos-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static Node<Integer> addElement(Node<Integer> head) {
        Node<Integer> temp = head;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> newNode = new Node<>(data);
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
        return head;

    }
    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static int midPoint(Node<Integer> head) {
        Node<Integer> temp = head;
        int i = 0;
        while (temp.next != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }


}
