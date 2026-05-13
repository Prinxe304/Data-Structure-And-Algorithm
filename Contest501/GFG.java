import java.util.*;

class Solution {

    public int maxMeetings(int start[], int end[]) {
        // Your logic here
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start[] = sc.nextInt();

        int end[] = sc.nextInt();

        Solution sol = new Solution();
        int ans = sol.maxMeetings(start[], end[]);
        System.out.println(ans);

        sc.close();
    }
}
