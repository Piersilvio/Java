package com.patternMail;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMail {
    public static void main(String[] args)
    {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("p.spicoli@studenti.uniba.it");
        emails.add("..@domain.");
        emails.add("user.name@domain.com");
        emails.add("@dom.it");
        emails.add("username11@yahoo.corporate.in");

        String R = "((\\w[\\w\\.]?)*\\w)@((\\w[\\w\\.]?)*\\w\\.\\w+)";

        System.out.println("Stringhe accettate");
        Pattern p = Pattern.compile(R);
        for(String email : emails){
            Matcher match = p.matcher(email);
            System.out.println(email +" : "+ match.matches());
        }
    }
}
