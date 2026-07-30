class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Search Space
        for (int weight : weights) {
            low = Math.max(low, weight); // largest weight
            high += weight;              // total weight
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                high = mid;      // try smaller capacity
            } else {
                low = mid + 1;   // increase capacity
            }
        }

        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {

        int currentWeight = 0;
        int requiredDays = 1;

        for (int weight : weights) {

            if (currentWeight + weight > capacity) {
                requiredDays++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }

        return requiredDays <= days;
    }
}