public class appendLastNToFirst {
    public static void main(String[] args){
        LinkedListNode<Integer> t = new LinkedListNode<>(1);
        t.next = new LinkedListNode<>(2);
        t.next.next = new LinkedListNode<>(3);
        t.next.next.next = new LinkedListNode<>(4);
        t.next.next.next.next = new LinkedListNode<>(5);
        int len = gettingTheLength(t);
        LinkedListNode<Integer> j = appendToLast(t, 5, len);
        while(j != null){
            System.out.println(j.data);
            j=j.next;
        }
    }
    public static int gettingTheLength(LinkedListNode<Integer> t){
        int sum = -1;
        while(t != null){
            t = t.next;
            sum++;
        }
        return sum;
    }
    public static LinkedListNode<Integer> appendToLast(LinkedListNode<Integer> t, int nth, int lengthLL){
        if(nth == lengthLL+1){
            return t;
        }
        int toBeNull = lengthLL - nth;
        LinkedListNode<Integer> constant = t;
        LinkedListNode<Integer> k = t;
        while(t != null){
            if(toBeNull == 0){
                 k = t.next;
                t.next = null;
            }
            toBeNull--;
            t=t.next;
        }
        LinkedListNode<Integer> returnable = k;
        while(k.next != null){
            k=k.next;
        }
        k.next=constant;
        return returnable;
    }
}
