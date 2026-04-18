class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. 결과 리스트를 만들기 위한 가상 노드 생성
        ListNode dummy = new ListNode(-1);
        // 2. 현재 노드를 추적할 포인터
        ListNode current = dummy;

        // 3. 두 리스트가 모두 존재할 때까지 비교하며 전진
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next; // list1 포인터 이동
            } else {
                current.next = list2;
                list2 = list2.next; // list2 포인터 이동
            }
            current = current.next; // 결과 리스트 포인터 이동
        }

        // 4. 한쪽 리스트가 끝났다면, 남은 다른 쪽 리스트를 그대로 연결
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // 5. 가상 노드의 다음 노드가 진짜 시작점
        return dummy.next;
    }
}