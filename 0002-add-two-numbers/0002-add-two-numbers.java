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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int c=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+c;
            c=sum/10;
            ListNode node=new ListNode(sum%10);
            ans.next=node;
            ans=ans.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=l1.val+c;
            c=sum/10;
            ListNode node=new ListNode(sum%10);
            ans.next=node;
            ans=ans.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.val+c;
            c=sum/10;
            ListNode node=new ListNode(sum%10);
            ans.next=node;
            ans=ans.next;
            l2=l2.next;
        }
        if(c!=0){
            ListNode node=new ListNode(c);
            ans.next=node;
        }
        return dummy.next;
    }
}