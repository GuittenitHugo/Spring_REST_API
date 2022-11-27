package univlo.tp.spring_rest_api.model;

public class Section {

    String titre;
    String contenu;

    public Section(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
