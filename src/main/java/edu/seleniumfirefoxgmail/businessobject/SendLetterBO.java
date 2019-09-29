package edu.seleniumfirefoxgmail.businessobject;

import edu.seleniumfirefoxgmail.pageobject.LetterPO;

import java.time.LocalDate;

public class SendLetterBO {

    public void composeLetterWithDateInSubjectAndSend() {
        LetterPO letterPO = new LetterPO();
        letterPO.openComposeLetterForm();
        letterPO.setAddress("orestzm@ukr.net");
        letterPO.setSubject("This message is sent on " + LocalDate.now() + " by automated program");
        letterPO.sendLetter();
    }
}
