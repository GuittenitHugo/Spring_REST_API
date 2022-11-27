package univlo.tp.spring_rest_api.dao;

import univlo.tp.spring_rest_api.model.Gazette;

import java.util.List;

public interface IGazetteDAO {

    List<Gazette> findAll();
    Gazette findOne(int id);
    void create(Gazette gazette);
    void update(int id, Gazette gazette);
    void delete(int id);

}
