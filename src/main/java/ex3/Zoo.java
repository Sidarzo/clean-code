package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animalList;

    public Zoo(String nom) {
        this.nom = nom;
    }

    public void addAnimal(Animal animal) {
        if(this.animalList == null){
            this.animalList = new ArrayList<Animal>();
        }
        animalList.add(animal);
    }

    public void afficherListeAnimaux() {
        for(Animal animal : animalList) {
            System.out.println(animal.getNom() + " " + animal.getType() + " " + animal.getComportement());
        }
    }

    public int taille() {
        return animalList.size();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
