/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode fpointer = headA;
        ListNode spointer = headB;
        boolean[] fflag = {true, true};
        boolean[] sflag = {true, true};

        while(fflag[1] && sflag[1]){
            if(fpointer == spointer){
                return fpointer;
            }else{
                if(fpointer.next != null){
                    fpointer = fpointer.next;
                }else{
                    if(fflag[0]){
                        fflag[0] = false;
                        fpointer = headB;
                    }else{
                        fflag[1] = false;
                    }
                }
                if(spointer.next != null){
                    spointer = spointer.next;
                }else{
                    if(sflag[0]){
                        sflag[0] = false;
                        spointer = headA;
                    }else{
                        sflag[1] = false;
                    }
                }
            }
        }
        return null;

        /*if(headA != null && headB != null){
            ListNode tempHeadA = headA;
            while(headB != null){
                if(isListNodeIncludeIn(tempHeadA, headB)){
                    return headB;
                }else{
                    if(headB.next != null)headB = headB.next;
                    else break;
                }
            }
        }
        return null;*/
    }
/*
    public boolean isListNodeIncludeIn(ListNode head, ListNode wanted){
        do{
            if(head == wanted){
                return true;
            }
            if(head.next != null)head = head.next;
            else break;
        }while(head != null);

        return false;
    }*/
}