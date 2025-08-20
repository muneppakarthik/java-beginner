import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegExJava{
    public static void main(String args[]){
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean isMatched = matcher.find();

        if(isMatched){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }
    }
}