class Solution {
    public int numWaterBottles(int nb, int ne) {
        int totalBottles = nb; 
        int emptyBottles = nb; 

        while (emptyBottles >= ne) {
            int newBottles = emptyBottles / ne; // New bottles we can get by exchanging empty bottles
            totalBottles += newBottles; // Add new bottles to the total count
            emptyBottles = newBottles + (emptyBottles % ne); // Update empty bottles (new bottles + remaining empty bottles)
        }

        return totalBottles;
    }

   
}