package Model;

import java.util.Objects;

public class BugReporter {

    private String email;
    private String firstName;

    private String lastName;

    public BugReporter(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Incorrect email format");
        } else {
            this.email = email;
        }
    }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName (String lastName){
            return lastName;
        }

        private void setLastName (String lastName){
            this.lastName = lastName;
        }

        @Override
        public String toString () {
            return "BugReporter{" +
                    "email='" + email + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BugReporter that = (BugReporter) o;
            return Objects.equals(email, that.email) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
        }

        @Override
        public int hashCode () {
            return Objects.hash(email, firstName, lastName);
        }
    }
