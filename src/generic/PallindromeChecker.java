package generic;

public class PallindromeChecker<T extends CharSequence> {
    private T text;

    public PallindromeChecker(T text){
        this.text = text;
    }

    public boolean isPallindrome(){
        int length = text.length();

        for(int i = 0; i < length/2; i++){
            if(text.charAt(i) != text.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "racecar";
        PallindromeChecker<String> checker = new PallindromeChecker<>(text);
        if(checker.isPallindrome()){
            System.out.println(text + " is palindrome");
        }else{
            System.out.println(text + " is not palindrome");
        }
    }
}
