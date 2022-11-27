package univlo.tp.spring_rest_api.dao;

import org.springframework.stereotype.Repository;
import univlo.tp.spring_rest_api.GazettesStaticData;
import univlo.tp.spring_rest_api.model.Gazette;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Repository
public class GazetteDAO implements IGazetteDAO{

    List<Gazette> gazetteList = GazettesStaticData.gazetteList;

    @Override
    public List<Gazette> findAll() {
        return gazetteList;
    }

    @Override
    public Gazette findOne(int id) {
        Gazette gazette = null;

        Optional<Gazette> searchResult = gazetteList.stream().filter(g -> g.getId() == id).findFirst();

        if(searchResult.isPresent()){
            gazette = searchResult.get();
        }

        return gazette;
    }

    @Override
    public void create(Gazette gazette) {
        GazettesStaticData.gazetteList.add(gazette);
        gazetteList = GazettesStaticData.gazetteList;
    }

    @Override
    public void update(int id, Gazette gazette) {
        Gazette editedGazette = findOne(id);
        if(editedGazette != null){

            GazettesStaticData.gazetteList.remove(editedGazette);

            editedGazette.setTitre(gazette.getTitre());
            editedGazette.setSections(gazette.getSections());
            editedGazette.setAuteur(gazette.getAuteur());

            GazettesStaticData.gazetteList.add(editedGazette);
            GazettesStaticData.gazetteList.sort(Comparator.comparingInt(Gazette::getId));

            //Pour éviter d'ajouter des gazettes à chaque mise à jour
            Gazette.gazettesCrees--;

            gazetteList = GazettesStaticData.gazetteList;

        }
    }

    @Override
    public void delete(int id) {
        Gazette editedGazette = findOne(id);
        GazettesStaticData.gazetteList.remove(editedGazette);

        gazetteList = GazettesStaticData.gazetteList;
    }
}
