package com.scotiainterview.springbootBackend.Service;

import com.scotiainterview.springbootBackend.Entity.TODO;
import com.scotiainterview.springbootBackend.Repo.TODORepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TODOService {

    @Autowired
    private TODORepo repo;

    public void saveorUpdate(TODO todos) {
        this.repo.save(todos);
    }

    public Iterable<TODO> listAll() {
        return this.repo.findAll();
    }

    public void deleteTODO(String id) {
        repo.deleteById(id
        );
    }


    public TODO getTODOById(String id) {
        return repo.findById(id).get();
    }
}
