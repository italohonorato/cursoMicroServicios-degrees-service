package cl.teamweichafe.repositories;

import cl.teamweichafe.domain.Degree;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeRepository extends MongoRepository<Degree, String> {
}
