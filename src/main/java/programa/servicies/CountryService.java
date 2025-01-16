package programa.servicies;

import java.util.List;
import java.util.Optional;

import programa.entidadesSpring.CountryEntity;

public interface CountryService {
    List<CountryEntity> findAll();
    Optional<CountryEntity> findById(Long id);
}