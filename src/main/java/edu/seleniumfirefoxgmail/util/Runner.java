package edu.seleniumfirefoxgmail.util;

import edu.seleniumfirefoxgmail.businessobject.GmailLoginBO;
import edu.seleniumfirefoxgmail.businessobject.SendLetterBO;
import edu.seleniumfirefoxgmail.businessobject.SentMailBO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    private GmailLoginBO gmailLoginBO = new GmailLoginBO();

    private void sendLetterWithDateInSubject() {
        SendLetterBO sendLetterBO = new SendLetterBO();
        gmailLoginBO.loginToGmail();
        sendLetterBO.composeLetterWithDateInSubjectAndSend();
    }

    private void showLettersSentToday() {
        SentMailBO sentMailBO = new SentMailBO();
        gmailLoginBO.loginToGmail();
        sentMailBO.showMailWithCurrentDateInSubject();
    }

    public void demonstrate() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String flow = "";
        System.out.println("To login, compose a letter with current date in the subject and send this letter press 1");
        System.out.println("To login, filter and show all sent letters with current date in the subject press 2");
        try {
            flow = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (flow.equals("1")) {
            sendLetterWithDateInSubject();
        } else if (flow.equals("2")) {
            showLettersSentToday();
        } else {
            System.out.println("Incorrect input");
            demonstrate();
        }
    }
}
