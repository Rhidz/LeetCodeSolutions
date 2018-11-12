
public class Solution {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode head = new ListNode(0);
	        ListNode temp = head;
	        int carry =0;
	        int sum;
	        int x, y;
	        
	        while(l1!=null || l2!=null){
	            if(l1==null){
	                x= 0;
	            }
	            else{
	                x = l1.val;
	            }
	            if(l2==null){
	                y=0;
	            }
	            else{
	                y = l2.val;
	            }
	            sum = x + y + carry;
	            carry = sum /10;
	            temp.next = new ListNode(sum %10);
	            temp = temp.next;
	            if(l1!=null)l1 = l1.next;
	            if(l2!=null)l2 = l2.next;
	        }
	        if(carry >0){
	            temp.next = new ListNode(carry);
	        }
	        return head.next;
	        
	    }
	}


