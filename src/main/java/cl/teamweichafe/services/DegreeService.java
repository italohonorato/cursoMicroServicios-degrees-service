package cl.teamweichafe.services;

import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.common.services.BaseService;
import cl.teamweichafe.domain.Degree;

import java.util.List;

public interface DegreeService extends BaseService<Degree, String> {
    List<DegreeDto> getAllDegrees();
    DegreeDto getDegree(String id);
    DegreeDto saveDegree(DegreeDto degreeDto);
    DegreeDto updateDegree(String id, DegreeDto degreeDto);
}
