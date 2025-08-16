public class CardPoints {
    static int maxScore(int[] cardPoints, int k) {
        int max = 0, totalSum = 0, l = 0, windowSum = 0;
        for (int cardPoint : cardPoints) {
            totalSum += cardPoint;
        }
        if(cardPoints.length - k == 0) return totalSum;
        for(int r = 0; r < cardPoints.length; r++){
            windowSum += cardPoints[r];
            if(r > k-1){
                max = Math.max(max, totalSum - windowSum);
                windowSum -= cardPoints[l];
                l++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] cardPoints = {9,7,7,9,7,7,9};
        System.out.println(maxScore(cardPoints, 7));
    }
}
