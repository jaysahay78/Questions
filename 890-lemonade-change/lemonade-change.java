class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] denom = new int[3];
        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5) denom[0]++;
            else{
                if(bills[i] == 10){
                    if(denom[0] < 1) return false;
                    denom[0]--;
                    denom[1]++;
                }
                if(bills[i] == 20){
                    if(denom[0] >= 3 && denom[1] < 1){
                        denom[0]-=3;
                        denom[2]++;
                    }
                    else if(denom[0] > 0 && denom[1] > 0){
                        denom[0]--;
                        denom[1]--;
                        denom[2]++;
                    }
                    else return false;
                    
                }
            }
        }
        return true;
    }
}