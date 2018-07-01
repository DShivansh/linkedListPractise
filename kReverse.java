public class kReverse {
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,8,9,10,11};
        LinkedListNode<Integer> workable = new LinkedListNode<>(2);
        LinkedListNode<Integer> constant = workable;
        for(int i: arr){
            workable.next = new LinkedListNode<>(i);
            workable = workable.next;
        }
        LinkedListNode<Integer> answer= reverse(constant,2);
    }

    public static LinkedListNode<Integer> reversing(LinkedListNode<Integer> t){
        if(t.next == null){
            return t;
        }
        LinkedListNode<Integer> j = reversing(t.next);
        j.next = t;
        t.next = null;
        return t;
    }

    public static LinkedListNode<Integer>  reverse(LinkedListNode<Integer> head, int reverse){
       LinkedListNode<Integer> previouslyReturned = null;
       LinkedListNode<Integer> returned = null;
       LinkedListNode<Integer> current = head;
       LinkedListNode<Integer> returnable = null;
       LinkedListNode<Integer> t = null;
       int flag = 0;
       int counter = 1;
       while(head != null){
           if(counter == reverse || head.next == null){
               counter = 0;
               t = head.next;
               if(flag == 0){
                   returnable = head;
                   flag++;
               }
               head.next = null;
               returned = reversing(current);
               if(previouslyReturned != null){
                previouslyReturned.next = head;
               }
               previouslyReturned = returned;
               returned.next = t;
               head = returned;
               current = head.next;
           }
           counter++;
           head = head.next;
       }
        return returnable;
    }
}
