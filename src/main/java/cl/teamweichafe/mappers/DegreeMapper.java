package cl.teamweichafe.mappers;

import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.common.mappers.MapperUtil;
import cl.teamweichafe.domain.Degree;

import java.util.List;

public interface DegreeMapper extends MapperUtil<Degree, DegreeDto> {
    DegreeDto map(Degree degree);
    Degree map(DegreeDto degreeDto);
    List<Degree> toDegreeList(List<DegreeDto> dtoList);
    List<DegreeDto> toDegreeDtoList(List<Degree> entityList);
}
