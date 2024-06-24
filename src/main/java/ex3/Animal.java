package ex3;

public class Animal {

    private String type;
    private String nom;
    private String comportement;


    /**
     * Constructeur
     *
     * @param type
     * @param nom
     * @param comportement
     */
    public Animal(String type, String nom, String comportement) {
        this.type = type;
        this.nom = nom;
        this.comportement = comportement;
    }
    /**
     * Getter pour l'attribut type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }
    /**
     * Getter pour l'attribut comportement
     *
     * @return the items
     */
    public String getComportement() {
        return comportement;
    }
    /**
     * Setter pour l'attribut type
     *
     * @return the type
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Setter pour l'attribut nom
     *
     * @return the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Setter pour l'attribut comportement
     *
     * @return the comportement
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
