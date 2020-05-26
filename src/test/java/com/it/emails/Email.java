package com.it.emails;

import java.util.Objects;

public class Email {
    public String letterEmail;
    public String letterSubject;
    public String letterDescription;

    public Email(String letterEmail, String letterSubject, String letterDecription) {
        this.letterEmail = letterEmail;
        this.letterSubject = letterSubject;
        this.letterDescription = letterDecription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(letterEmail, email.letterEmail) &&
                Objects.equals(letterSubject, email.letterSubject) &&
                Objects.equals(letterDescription, email.letterDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letterEmail, letterSubject, letterDescription);
    }

    @Override
    public String toString() {
        return "Email{" +
                "letterEmail='" + letterEmail + '\'' +
                ", letterSubject='" + letterSubject + '\'' +
                ", letterDecriprion='" + letterDescription + '\'' +
                '}' +"\n" ;
    }
}
