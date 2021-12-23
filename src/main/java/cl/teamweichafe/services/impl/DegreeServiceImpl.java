package cl.teamweichafe.services.impl;

import cl.teamweichafe.domain.Degree;
import cl.teamweichafe.repositories.DegreeRepository;
import cl.teamweichafe.services.DegreeService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class DegreeServiceImpl implements DegreeService {

    private final DegreeRepository degreeRepository;

    public DegreeServiceImpl(DegreeRepository degreeRepository) {
        this.degreeRepository = degreeRepository;
    }

    @Override
    public MongoRepository<Degree, String> getRepository() {
        return this.degreeRepository;
    }
}
