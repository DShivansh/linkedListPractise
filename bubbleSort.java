public class bubbleSort {
    public static void main(String[] args){
        LinkedListNode<Integer> list= new LinkedListNode<>(1);
        list.next = new LinkedListNode<>(4);
        list.next.next = new LinkedListNode<>(5);
        list.next.next.next = new LinkedListNode<>(2);
        LinkedListNode<Integer> ans = sorting(list);
        while(ans != null){
            System.out.println(ans.data);
            ans = ans.next;
        }
    }
    public static LinkedListNode<Integer> sorting(LinkedListNode<Integer> k){
        for(int i = 0; i < lengthOfLinkedList(k); i++){
            LinkedListNode<Integer> first = k;
            LinkedListNode<Integer> second = k.next;
            LinkedListNode<Integer> everyTime = k;
            if(first.data >= second.data){
                first.next = second.next;
                second.next = first;
                k = second;
                everyTime = second;
                second = first.next;
            }else{
                everyTime = first;
                first = second;
                second = second.next;
            }
            for(int j = 1; j < lengthOfLinkedList(k)-i; j++){
                if(first.data >= second.data){
                    first.next = second.next;
                    second.next = first;
                    everyTime.next = second;
                    everyTime = second;
                    second = first.next;
                    continue;
                }else{
                    everyTime = first;
                    first = second;
                    second = second.next;
                }
            }

        }
        return k;
    }
    public static int lengthOfLinkedList(LinkedListNode<Integer> findLengthOf){
        int sum = -1;
        while(findLengthOf != null){
            findLengthOf = findLengthOf.next;
            sum++;
        }
        return sum;
    }
}
