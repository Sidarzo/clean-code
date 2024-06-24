package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private Integer poidsAccepte;

    /**
     * Constructeur
     *
     * @param nom
     * @param poidsAccepte
     */
    public Caisse(String nom, Integer poidsAccepte) {
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsAccepte = poidsAccepte;
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
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean canAcceptItem(Item item) {
        return item.getPoids() < this.poidsAccepte;
    }

    public void addItem(Item item) {
        if (canAcceptItem(item)) {
            this.items.add(item);
        }
    }
}