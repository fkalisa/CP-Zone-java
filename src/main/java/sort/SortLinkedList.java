package sort;

public class SortLinkedList {

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(){
        }
    }
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode previous = null;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = null;
        return merge(sortList(head), sortList(slow));


    }

    public ListNode merge(ListNode left, ListNode right){

        ListNode dummy = new ListNode();
        ListNode current = dummy;


        while(left != null && right!= null){
            if(left.val > right.val ){
                current.next = right;
                right = right.next;
            }else{
                current.next = left;
                left = left.next;
            }
            current= current.next;
        }

        if(right!= null){
            current.next = right;
        }
        if(left!= null){
            current.next = left;
        }
        return dummy.next;
    }
}
