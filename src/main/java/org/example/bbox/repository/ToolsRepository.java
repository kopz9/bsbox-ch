package org.example.bbox.repository;

import org.example.bbox.entities.Tools;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ToolsRepository extends MongoRepository<Tools, String> {

  List<Tools> findByTags(List<String> title);

}
