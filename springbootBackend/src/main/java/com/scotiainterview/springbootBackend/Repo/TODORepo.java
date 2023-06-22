package com.scotiainterview.springbootBackend.Repo;

import com.scotiainterview.springbootBackend.Entity.TODO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TODORepo extends MongoRepository<TODO, String> {
}
