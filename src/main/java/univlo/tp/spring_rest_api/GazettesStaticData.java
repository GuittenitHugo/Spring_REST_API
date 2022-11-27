package univlo.tp.spring_rest_api;

import univlo.tp.spring_rest_api.model.Gazette;
import univlo.tp.spring_rest_api.model.Section;

import java.util.ArrayList;
import java.util.List;

public final class GazettesStaticData {

    private static GazettesStaticData instance = null;
    public static List<Gazette> gazetteList;

    private GazettesStaticData() {
        init();
    }

    public static GazettesStaticData getInstance(){
        if (instance == null){
            instance = new GazettesStaticData();
        }
        return instance;
    }

    private static void init(){

        gazetteList = new ArrayList<>();

        Gazette gazette1, gazette2;
        gazette1 = new Gazette();

        String titre, auteur;
        ArrayList<Section> sections = new ArrayList<>();

        titre = "Gazette 1";
        auteur = "auteur anonyme 1";

        sections.add(new Section("Section 1", "Ceci est le contenu de la section 1"));
        sections.add(new Section("Section 2", "Ceci est le contenu de la section 2"));
        sections.add(new Section("Section 3", "Ceci est le contenu de la section 3"));

        gazette1.setTitre(titre);
        gazette1.setAuteur(auteur);
        gazette1.setSections(sections);

        gazetteList.add(gazette1);


        gazette2 = new Gazette();

        titre = "Gazette 2";
        auteur = "auteur anonyme 2";

        sections.add(new Section("Section 4","Ceci est le contenu un peu plus original de la section 4"));

        gazette2.setTitre(titre);
        gazette2.setAuteur(auteur);
        gazette2.setSections(sections);

        gazetteList.add(gazette2);

    }
}
