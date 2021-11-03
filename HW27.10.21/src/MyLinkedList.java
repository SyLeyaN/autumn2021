public class MyLinkedList {
    class Node{
        double value;
        Node prev;
        Node next;

        Node(double value){
            this.value=value;
        }
    }

    Node head;

    public void firstEl(int value){
        Node n = new Node(value);
        n.next=head;
        n.prev=null;
        if (head!=null){
            head.prev=n;
        }
        head=n;
    }

    public void lastEl(int value){
        Node n=new Node(value);
        Node last=head;
        if (head==null){
            n.prev=null;
            head=n;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=n;
        n.prev=last;
    }

    public void delEl(Node d){
        if(head==null||d==null){
            return;
        }
        if(head==d){
            head=d.next;
        }
        if(d.prev!=null){
            d.prev.next=d.next;
        }
        if(d.next!=null){
            d.next.prev=d.prev;
        }
        return;
    }

    public void showEl(){
        Node help = head;
        while (help != null){
            System.out.print(help.value + " ");
            help = help.next;
        }
        System.out.printf("");
    }
}
