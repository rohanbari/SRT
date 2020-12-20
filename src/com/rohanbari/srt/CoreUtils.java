package com.rohanbari.srt;

import java.util.Locale;

/**
 * Container of all the fundamental methods which are required
 * through the runtime of the application.
 *
 * @author rohanbari
 * @since v1.0
 */
public class CoreUtils {

    public CoreUtils() {
        super();
    }

    /**
     * Displays the banner.
     */
    public static void showBanner() {
        String[] banner = new String[]{
                "+ ------------------------------------------------------- +",
                "| WELCOME TO S.R.T.!                                 v1.0 |",
                "| ------------------------------------------------------- |",
                "| The System Repair Toolkit  attempts to solve various    |",
                "| kinds of systematic problems faced by the users.        |",
                "|                                                         |",
                "| ======================================================= |",
                "| Created By: Rohan Bari (rohanbari4@gmail.com)           |",
                "| GitHub: github.com/rohanbari/SRT                        |",
                "| Originated: 20th Dec 2020, tested in 1.8                |",
                "+ ------------------------------------------------------- +",
        };

        for (String line : banner) {
            System.out.println(line);
        }
        System.out.println();
    }

    /**
     * Prints a log in the console.
     *
     * @param descriptor Short information about the log
     * @param message    Full description
     */
    public static void putLog(String descriptor, String message) {
        String composeMsg = descriptor + ": " + message;
        System.out.printf(Locale.ENGLISH, "%s\n", composeMsg);
    }
}
