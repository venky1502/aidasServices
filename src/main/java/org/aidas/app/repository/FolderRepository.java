package org.aidas.app.repository;

import org.aidas.app.model.FolderModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends MongoRepository<FolderModel, String> {
	

}
