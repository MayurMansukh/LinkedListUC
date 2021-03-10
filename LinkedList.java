public class LinkedList<T> {

    class Node<T>{
        T data;
        Node<T> Next;

        public Node(T data){
            this.data=data;
            this.Next=null;
        }
    }

    public Node<T> head=null;
    public Node<T> tail=null;

    public void addNode(T data){ //add nodes in Linked List

        Node<T> newNode=new Node<T>(data);

        if (head==null) {

            head=newNode;
            tail=newNode;
        }
        else
            tail.Next=newNode;
            tail=newNode;

            }

    public void displayList() { // display linked List
        Node<T> current=head;

        if (head==null){

            System.out.println("list is empty");
        }
        else {
            System.out.println("singly linked list: ");
            while (current != null) {

                System.out.println(current.data + "");
                current = current.Next;
            }

        }
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.addNode(56);
        list.addNode(30);
        list.addNode(70);

        list.displayList();

    }

}
