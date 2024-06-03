package xactly;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentSanitizer {
    private static final String [] SWEAR_WORDS = {"crap","cretin"};
    private static String replaceEmailAddress(String comment){
        String emailRegex = "[a-zA-Z0-9._%+-]+[a-zA-Z0-9.-]+\\.[a-zA-Z{2,6}]";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(comment);
        return emailMatcher.replaceAll("<email_address>");
    }
    private static String replaceSwearWords(String comment){
        for(String swearWord : SWEAR_WORDS){
            String swearWordRegex = "\\b" + Pattern.quote(swearWord) + "\\b";
            Pattern swearWordPattern = Pattern.compile(swearWordRegex,Pattern.CASE_INSENSITIVE);
            Matcher swearWordMatcher = swearWordPattern.matcher(comment);

            String replacement = "*".repeat(SWEAR_WORDS.length);
            comment = swearWordMatcher.replaceAll(replacement);
        }
        return comment;
    }
    private static String sanitizeComment(String comment){
        comment = replaceEmailAddress(comment);
        comment = replaceSwearWords(comment);
        return comment;
    }

    public static void main(String[] args) {
        String comment = "James was a crap builder and generally a cretin. Send him your complaints on james@jollycleverbuilders.com.";
        String sanitizeComment = sanitizeComment(comment);
        System.out.println(sanitizeComment);
    }
}
