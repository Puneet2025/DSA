public class LLprac{
    Node head;
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next; 
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.print("List is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next; 
        }
        System.out.println(" ");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is already null");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        
    }
    public static void main(String[] args) {
        LLprac list = new LLprac();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        list.addLast("list");
        list.printList();
    }
}