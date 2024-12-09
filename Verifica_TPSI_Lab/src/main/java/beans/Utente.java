package beans;

import java.io.Serializable;

public class Utente implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nome;
    private String cognome;
    private String email;
    private String password;

    public Utente(String firstName, String lastName, String email, String password) {
        this.nome = firstName;
        this.cognome = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return nome;
    }

    public void setFirstName(String firstName) {
        this.nome = firstName;
    }

    public String getLastName() {
        return cognome;
    }

    public void setLastName(String lastName) {
        this.cognome = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "firstName='" + nome + '\'' +
                ", lastName='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
