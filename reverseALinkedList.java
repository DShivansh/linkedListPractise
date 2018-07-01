public class reverseALinkedList {
    public static void main(String[] args){
        LinkedListNode<Integer> t = new LinkedListNode<>(1);
        t.next = new LinkedListNode<>(2);
        t.next.next = new LinkedListNode<>(3);
        t.next.next.next = new LinkedListNode<>(4);
        t.next.next.next.next = new LinkedListNode<>(5);
        LinkedListNode<Integer> constant, j=t;
        while(j.next!=null){
            j=j.next;
        }
        constant = j;
        LinkedListNode<Integer> output = reverse(t);

    }
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> t){
        if(t.next == null){
            return t;
        }
        LinkedListNode<Integer> j = reverse(t.next);
        j.next = t;
        t.next = null;
        return t;
    }
}
