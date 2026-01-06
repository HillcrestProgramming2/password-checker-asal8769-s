package org.hillcrest.chapter6.password;

public class CriteriaChecker  {
    private static int score;

    public static int evaluateCriteria(String password) {
        if (password.length() < 8) {
            score += 1;
        }
        else {
            score = 0;
        }
        for (int i = 0; i < password.length(); i++)
        {
            char c = password.charAt(i);
            String numbers = "0123456789";
            String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
            String upperLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String specialChars = "!@#$%^&*()-_=+|[]{};:/?.>";
            if (lowerLetters.indexOf(c) >= 0)
            {
                score += 1;
            }
            else if (numbers.indexOf(c) >= 0)
            {
                score += 1;
            }
            else if (specialChars.indexOf(c) >= 0)
            {
                score += 1;
            }
            return score;
        }

        public static String determineStrength(int score) {
            if (score > 0 && score <= 2) {
                System.out.println("Weak");
            }
            else if (score == 3) {
                System.out.println("Moderate");
            }
            else if (score == 4 || score == 5) {
                System.out.println("Strong");
            }
            else {

            }
        }
    }}
