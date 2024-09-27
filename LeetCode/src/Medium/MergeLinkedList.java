package Medium;

public class MergeLinkedList {
   
       //check below second approach  Recursion
	
	 //*Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	    public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
	      
	      ListNode temp=new ListNode(-1);
	      while (list1 != null && list2 != null) {
	            // Compare the values of the current nodes in list1 and list2
	            if (list1.val <= list2.val) {
	                // If list1's node is smaller or equal, attach it to the merged list
	                temp.next = list1;
	                // Move list1's pointer to the next node
	                list1 = list1.next;
	            } else {
	                // If list2's node is smaller, attach it to the merged list
	                temp.next = list2;
	                // Move list2's pointer to the next node
	                list2 = list2.next;
	            }
	            // Move the current pointer in the merged list to the next node
	            temp = temp.next;
	        }
	      if(list1==null && list2==null){
	        return temp;
	      }

	         if (list1 != null) {
	            temp.next = list1;
	        } else {
	            temp.next = list2;
	        }

	        return temp.next;
	    }
	
	    
	    //this is best way
	    /*
	     if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
        
        */
	
	
}
