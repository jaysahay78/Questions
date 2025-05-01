public class MaximumDepthBracket {
    static int maxDepth(String s){
        int count = 0;
        int maxCount = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            if(c == ')'){
                count--;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(maxDepth("(())(()(()))"));
    }
}
