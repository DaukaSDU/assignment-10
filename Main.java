
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        ListNode current = head;
        boolean isCircular = hasCycle(head);
        if(isCircular){
            System.out.println("Circular Linked List");
            while(current != node3){
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.print(node3.val);
        }
        else {
            System.out.println("Not circular Linked List");
            while(current != null){
                System.out.print(current.val + " ");
                current = current.next;
            }
        }
    }
    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println(slow.val);
                return true;
            }
        }
        return false;
    }

}
class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
