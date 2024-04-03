import java.util.*;
public class LinkedL {
    Node head;
    public class Node{   // node class isliye banate hai kyuki java m jo data aur address(next pointer) ko store karna hota hai
        String data;
        Node next; // agla wala node 

        // create a node constructor 

        Node(String data){
            this.data = data;
            this.next = null;  // new node ke liye uska next by default null hoga 
        }
    }

    // add first and add last more prefer add last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){  // bcoz abhi koi LL nhi bani hai  isliye head ko hi newnode se assign karenge
            head = newNode; // head m new node ki value assign karenge
            return;
        }

        // if already LL is exist then apply this

        newNode.next = head;  
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        // linkedlist ko traverse(travel) karne ke liye ek node create karn apadta hai jise 
        Node currNode = head; // head ki value assign kar dete hai
        while( currNode.next != null){  // currentNode ko update karte rehte hai
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print the list
    public void printList(){
        if(head == null){
            System.out.println("list os null");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public void deleteFirst(){
        // deleteFirst ke andar -> head ke next wale ko head bana do pehla wala humeasa ke liye gayab ho jayega
        // deleteLast ke andar -> traverse karte hue jao aur second last element ke next ko null bana do last wala gayab ko jayega
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
    }
    
    public static void main(String[] args) {

        // use linked list when it was added in between 
        // insert ---- O(1)
        // search ---- O(n)

        LinkedL list = new LinkedL(); // apni hi class ka object banana jaruri hota hai
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.printList();
        list.addLast("last");
        list.printList();
    }
}



