import java.util.Date;

public class MyFirstFile {
    private String nom;
    private String prenom;
    private Date date;

    public MyFirstFile(String nom, String prenom, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
