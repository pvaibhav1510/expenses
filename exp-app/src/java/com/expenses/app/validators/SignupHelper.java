package com.expenses.app.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import com.expenses.app.models.User;

import static com.expenses.app.utils.StringUtils.*;

public class SignupHelper {

    public static void validateUser(User user) {

    }

    public static String valodateNEncryptPassword(HttpServletRequest req) {
        String password1 = req.getParameter("password1");
        String password2 = req.getParameter("password2");
        if (isNUllOrEmpty(password1)) {
            throw new RuntimeException("Passwords1 cannot be empty.");
        }
        if (isNUllOrEmpty(password2)) {
            throw new RuntimeException("Passwords2 cannot be empty.");
        }
        if (!password1.equals(password2)) {
            throw new RuntimeException("Passwords does not match.");
        }

        if (password1.length() < 3 || password1.length() > 8) {
            throw new RuntimeException(
                    "Password length should be between 3-8 characters.");
        }

        String regex = "";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(password1);
        if (!matcher.matches()) {
            throw new RuntimeException(
                    "Password should contain atleast one upper or lower case charater, one special charater and one digit");
        }

        String passHash = encryptor(password1);
        req.removeAttribute("password1");
        req.removeAttribute("password2");
        return passHash;
    }

    private static String encryptor(String val) {
        return val;
    }

}
