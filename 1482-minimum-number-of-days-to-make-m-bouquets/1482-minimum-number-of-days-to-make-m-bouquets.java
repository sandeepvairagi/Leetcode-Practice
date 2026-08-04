class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Agar total required flowers hi available nahi hain
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        // Search Space
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        // Binary Search
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, mid, m, k)) {
                high = mid;      // Try smaller day
            } else {
                low = mid + 1;   // Need more days
            }
        }

        return low;
    }

    private boolean canMake(int[] bloomDay, int day, int m, int k) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;   // Flowers used, start next bouquet
                }

            } else {
                flowers = 0;       // Adjacency breaks
            }
        }

        return bouquets >= m;
    }
}