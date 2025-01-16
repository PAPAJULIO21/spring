package programa.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import  programa.entidadesSpring.CountryEntity;

public interface CountryRepository extends JpaRepository <CountryEntity, Long> {

}
