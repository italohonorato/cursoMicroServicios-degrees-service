package cl.teamweichafe.mappers.impl;

import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.domain.Degree;
import cl.teamweichafe.mappers.DegreeMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DegreeMapperImpl implements DegreeMapper {

    private final ModelMapper modelMapper;

    public DegreeMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public DegreeDto map(Degree degree) {
        return modelMapper.map(degree, DegreeDto.class);
    }

    @Override
    public Degree map(DegreeDto degreeDto) {
        return modelMapper.map(degreeDto, Degree.class);
    }

    @Override
    public List<Degree> toDegreeList(List<DegreeDto> dtoList) {
        return this.toEntityList(dtoList, Degree.class);
    }

    @Override
    public List<DegreeDto> toDegreeDtoList(List<Degree> entityList) {
        return this.toDtoList(entityList, DegreeDto.class);
    }

    @Override
    public ModelMapper getMapper() {
        return this.modelMapper;
    }
}
