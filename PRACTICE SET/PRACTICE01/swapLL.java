package PRACTICE01;

    class Node {
        int data;
        Node next;

        Node(int data) {
              this.data = data;
             this.next = null;
        }
    }
    public class swapLL {
        Node head; 
        public void swapNodes(int x, int y) {
            if(x == y) return;
            Node prevX = null;
            Node currX = head;
            while(currX != null && currX.data != x) {
                prevX = currX;
                currX = currX.next;
            }
            Node prevY = null;
            Node currY = head;
            while(currY != null && currY.data != y) {
                prevY = currY;
                currY = currY.next;
            }
            if(currX == null || currY == null) return;
            if(prevX != null) prevX.next = currY;
              else  head = currY;
              
              if(prevY != null) prevX.next = currX;
              else  head = currX;

              Node temp = currX.next;
              currX.next = currY.next;
              currY.next = temp;

        }
        public void push(int new_data) {
            Node new_Node = new Node(new_data);
            new_Node.next = head;
            head = new_Node;
        }
        public void printList() {
            Node tNode = head;
            while(tNode != null) {
                System.out.print(tNode.data+ " ");
                tNode = tNode.next;
            }
        }
    public static void main(String[] args) {
        swapLL ll = new swapLL();
        ll.push(7);
        ll.push(6);
        ll.push(5);
        ll.push(4);
        ll.push(3);
        ll.push(2);
        ll.push(1);
        System.out.print("\n LinkedList before :");
        ll.printList();
        ll.swapNodes(1, 3);
        System.out.print("\n LinkedList after :");
        ll.printList();
    }
}
