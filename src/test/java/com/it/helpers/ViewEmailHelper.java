package com.it.helpers;

import com.it.emails.Email;
import com.it.pages.ViewEmailPage;

public class ViewEmailHelper extends ViewEmailPage {
    public Email getEmail() {
        return new Email(
                getLetterReceiverAddress(),
                getLetterSubject(),
                getLetterDescription()
        );
    }
}
