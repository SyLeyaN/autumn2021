public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.firstEl(1);
        myLinkedList.firstEl(2);
        myLinkedList.firstEl(3);
        myLinkedList.lastEl(99);
        myLinkedList.delEl(myLinkedList.head);
        myLinkedList.showEl();
    }
}
