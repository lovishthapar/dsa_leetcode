
import java.util.*;

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
    
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

class Solution{
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums = {9, 2, 5};
        ListNode head = new ListNode(22, new ListNode(2, new ListNode(8,new ListNode(3))));
        
        
        ListNode modifiedHead = sol.modifiedList(nums, head);
        
        // Printing the result
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    public ListNode modifiedList(int[] n, ListNode head)
     {
        ListNode g=new ListNode();
        ListNode a=g;
        ListNode b=head;
        HashSet<Integer> s = new HashSet<>();
        for (int num : n) {
            s.add(num);
        }
        while(b!=null)
        { 
           
            int val=b.val;
            
            if(!s.contains(val))
            {
                a.next=b;
                a=a.next;
            }
            b=b.next; 


        }
        a.next=null;

    return g.next;
        
    }
}
