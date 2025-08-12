public class FruitsInBaskets {
    static int fruitsInBaskets(int[] fruits) {
        int number = fruits[0];
        int max = 0;
        int l = 0;
        for (int r = 0; r < fruits.length; r++) {
            if(fruits[r] != fruits[l] && fruits[l] == number){
                number = fruits[r];
            }
            if(fruits[r] != fruits[l] && fruits[r] != number){
                 l= r-1;
                 number = fruits[r];
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(fruitsInBaskets(fruits));
    }
}
