package univlo.tp.spring_rest_api.model;

import java.util.ArrayList;
import java.util.List;

public class Gazette {

    public static int gazettesCrees = 0;

    int id;
    String titre;
    List<Section> sections;
    String auteur;

    public Gazette(String titre, List<Section> sections, String auteur) {
        this.id=++gazettesCrees;
        this.titre = titre;
        this.sections = sections;
        this.auteur = auteur;
    }

    public Gazette(){
        this.id=++gazettesCrees;
        this.titre = "";
        this.sections = new ArrayList<>();
        this.auteur = "";
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections.clear();
        this.sections.addAll(sections);
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
