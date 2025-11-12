
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode reverseList(ListNode head) {
        ListNode before = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode after = cur.next; // Lưu trữ nút tiếp theo
            cur.next = before;         // Đảo ngược con trỏ
            before = cur;              // Di chuyển before về trước
            cur = after;               // Di chuyển cur về trước
        }
        
        return before; // before sẽ là đầu của danh sách đảo ngược
    }
}
