package preparingcode;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestableCode {
    public static String[] knowsNames = {"Zeynep", "Tess", "Marina", "Jade", "Eric", "Jamal"};
    public static String[] specialNames = {"Zach", "Martin", "Noah", "Tess"};
    public String greeting;

    public String greetUser(String name) {
        LocalDateTime dateTime = LocalDateTime.now();
        if (dateTime.getHour() >= 0 && dateTime.getHour() < 6) {
            greeting += "Good night, ";
            if (Arrays.stream(knowsNames).anyMatch(name::equals)) {
                greeting += "I know you, " + name + ".";
                if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                    greeting += "You're even on our VIP list!";
                }
            } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                greeting += "I don't know you, " + name + ". But you are on our VIP lists!";
            } else {
                greeting += "stranger";
            }
        }
        if (dateTime.getHour() >= 6 && dateTime.getHour() < 12) {
            greeting += "Good morning,";
            if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                greeting += "I don't know you, " + name + ". But you are on our VIP lists!";
                if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                    greeting += "You're even on our VIP list!";
                }
            } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                greeting += "I don't know you, " + name + ". But you are on our VIP lists!";
            } else {
                greeting += "stranger";
            }
        }
        if (dateTime.getHour() >= 12 && dateTime.getHour() < 18) {
            greeting += "Good afternoon";
            if (Arrays.stream(knowsNames).anyMatch(name::equals)) {
                greeting += "I know you, " + name + ".";
                if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                    greeting += "You're even on our VIP list!";
                }
            } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                greeting += "I don't know you, " + name + ". But you are on our VIP lists!";
            } else {
                greeting += "stranger";
            }
        }
        if (dateTime.getHour() >= 18 && dateTime.getHour() <= 23) {
            greeting += "Good evening, ";
            if (Arrays.stream(knowsNames).anyMatch(name::equals)) {
                greeting += "I know you " + name + ".";
                if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                    greeting += "You're even on our VIP list!";
                }
            } else if (Arrays.stream(specialNames).anyMatch(name::equals)) {
                greeting += "I don't know you, " + name + ". But you are on our VIP lists!";
            } else {
                greeting += "stranger";
            }
        }
        System.out.println(greeting);
        return greeting;
    }
}