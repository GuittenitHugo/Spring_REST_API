package univlo.tp.spring_rest_api.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import univlo.tp.spring_rest_api.dao.IGazetteDAO;
import univlo.tp.spring_rest_api.model.Gazette;

import java.util.List;

@Controller
public class GazetteController {

    @Autowired
    private IGazetteDAO dao;

    @ResponseBody
    @GetMapping(value="/gazette")
    public List<Gazette> findAllGazettes(){
        return dao.findAll();
    }

    @ResponseBody
    @GetMapping(value="/gazette/{id}")
    public Gazette findOneGazette(@PathVariable int id){
        return dao.findOne(id);
    }

    @ResponseBody
    @PostMapping(value="/gazette")
    public void createGazette(@RequestBody Gazette gazette){
        dao.create(gazette);
    }

    @ResponseBody
    @PutMapping(value="/gazette/{id}")
    public void editGazette(@PathVariable int id, @RequestBody Gazette gazette){
        dao.update(id, gazette);
    }

    @ResponseBody
    @DeleteMapping(value="/gazette/{id}")
    public void deleteGazette(@PathVariable int id){
        dao.delete(id);
    }
}
