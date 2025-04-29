public class RotateString {
    static boolean rotateString(String s, String goal) {
        for(int i = 0; i<s.length()-1; i++){
            if(s.equals(goal)) return true;
            if((s.substring(i+1,s.length())+s.substring(0,i+1)).equals(goal)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
