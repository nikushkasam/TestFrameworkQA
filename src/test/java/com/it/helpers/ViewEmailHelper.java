package com.it.helpers;

import com.it.Emails.Email;
import com.it.pages.ViewEmailPage;

public class ViewEmailHelper extends ViewEmailPage {
    public Email getEmailBody() {
        return new Email(
                getLetterReceiverAddress(),
                getLetterSubject(),
                getLetterDescription()
        );
    }
}
