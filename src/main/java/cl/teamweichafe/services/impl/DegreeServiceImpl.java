package cl.teamweichafe.services.impl;

import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.domain.Degree;
import cl.teamweichafe.mappers.DegreeMapper;
import cl.teamweichafe.repositories.DegreeRepository;
import cl.teamweichafe.services.DegreeService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeServiceImpl implements DegreeService {

    private final DegreeRepository degreeRepository;
    private final DegreeMapper degreeMapper;

    public DegreeServiceImpl(DegreeRepository degreeRepository, DegreeMapper degreeMapper) {
        this.degreeRepository = degreeRepository;
        this.degreeMapper = degreeMapper;
    }

    @Override
    public MongoRepository<Degree, String> getRepository() {
        return this.degreeRepository;
    }

    @Override
    public List<DegreeDto> getAllDegrees() {
        return degreeMapper.toDegreeDtoList(this.getAll());
    }

    @Override
    public DegreeDto getDegree(String id) {
        return degreeMapper.map(this.get(id));
    }

    @Override
    public DegreeDto saveDegree(DegreeDto degreeDto) {
        Degree degree = degreeMapper.map(degreeDto);
        return degreeMapper.map(this.save(degree));
    }

    @Override
    public DegreeDto updateDegree(String id, DegreeDto degreeDto) {
        Degree degree = this.get(id);
        degree.setDesc(degreeDto.getDesc());
        degree.setName(degreeDto.getName());

        return degreeMapper.map(this.save(degree));
    }
}
