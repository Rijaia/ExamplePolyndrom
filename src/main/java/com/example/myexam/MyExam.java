package com.example.myexam;

public class MyExam {

    public Boolean isStringThePolyndrom(String string) {

        char[] isPolyndrom = new char[string.charAt(string.length()-1)];
        for (int i = 0; i <= isPolyndrom.length / 2; i++) {
            if (isPolyndrom[i] == isPolyndrom[isPolyndrom.length - i]) {
                return true;
            }
        }
        return false;
    }
}
