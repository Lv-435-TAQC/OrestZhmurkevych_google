package edu.seleniumfirefoxgmail.businessobject;

import edu.seleniumfirefoxgmail.pageobject.SentPO;

import java.time.LocalDate;

public class SentMailBO {

    public void showMailWithCurrentDateInSubject() {
        SentPO sentPO = new SentPO();
        sentPO.showSentMail();
        sentPO.openSentMailFilter();
        sentPO.setSubjectToSentMailFilter(String.valueOf(LocalDate.now()));
        sentPO.submitFilter();
    }
}
