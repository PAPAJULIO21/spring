package programa.servicies;

import java.util.List;
import java.util.Optional;
import programa.servicies.CountryService;
import org.springframework.stereotype.Service;
  
import programa.entidadesSpring.CountryEntity;

import programa.interfaces.CountryRepository;

@Service
public class CountryServicieImpl implements CountryService{
	
	private final CountryRepository countryRepository;
	  
    public CountryServicieImpl(CountryRepository countryRepository) {
    	this.countryRepository = countryRepository;
	}
    @Override
    public List<CountryEntity> findAll() {
        return countryRepository.findAll();
    }
    @Override 
    public Optional<CountryEntity> findById(Long id) {
        return countryRepository.findById(id);
    }
}
