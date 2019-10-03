package edu.seleniumfirefoxgmail.businessobject;

import edu.seleniumfirefoxgmail.pageobject.LetterPO;

import java.time.LocalDate;

import static edu.seleniumfirefoxgmail.util.constants.GmailConstants.RECEIVER_ADDRESS;

public class SendLetterBO {

    public void composeLetterWithDateInSubjectAndSend() {
        LetterPO letterPO = new LetterPO();
        letterPO.openComposeLetterForm();
        letterPO.setAddress(RECEIVER_ADDRESS);
        letterPO.setSubject("This message is sent on " + LocalDate.now() + " by automated program");
        letterPO.sendLetter();
    }
}
