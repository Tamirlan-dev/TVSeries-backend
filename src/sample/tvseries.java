package sample;

import javafx.beans.property.StringProperty ;
import javafx.beans.property.SimpleStringProperty ;

public class tvseries {
    private final StringProperty SERIES_TITLE = new SimpleStringProperty(this, "SERIES_TITLE");
    public StringProperty SERIES_TITLEProperty() {
        return SERIES_TITLE ;
    }
    public final String getSERIES_TITLE() {
        return SERIES_TITLEProperty().get();
    }
    public final void setSERIES_TITLE(String SERIES_TITLE) {
        SERIES_TITLEProperty().set(SERIES_TITLE);
    }

    private final StringProperty lastName = new SimpleStringProperty(this, "lastName");
    public StringProperty lastNameProperty() {
        return lastName ;
    }
    public final String getLastName() {
        return lastNameProperty().get();
    }
    public final void setLastName(String lastName) {
        lastNameProperty().set(lastName);
    }

    private final StringProperty email = new SimpleStringProperty(this, "email");
    public StringProperty emailProperty() {
        return email ;
    }
    public final String getEmail() {
        return emailProperty().get();
    }
    public final void setEmail(String email) {
        emailProperty().set(email);
    }

    public Person() {}

    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

}