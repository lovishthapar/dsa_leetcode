/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
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