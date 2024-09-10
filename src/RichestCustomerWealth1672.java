public class RichestCustomerWealth1672 {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int max = 0;
            for(int i = 0; i < accounts.length; i++) {
                int maxPerPerson = 0;
                for(int j = 0; j < accounts[i].length; j++) {
                    maxPerPerson += accounts[i][j];
                }
                if(max < maxPerPerson) {
                    max = maxPerPerson;
                }
            }
            return max;
        }
    }
}