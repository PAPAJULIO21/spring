package programa;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import programa.servicies.CountryService;

@SpringBootApplication(scanBasePackages = {"programa"})
public class CountriesApp implements CommandLineRunner {
  
    private static final Logger logger = (Logger) LoggerFactory.getLogger(CountriesApp.class);
  
    @Autowired
    CountryService countryService;
  
    public static void main(String[] args) {
        SpringApplication.run(CountriesApp.class, args);
    }
  
    @Override
    public void run(String... arg0) {
    	 countryService
         .findAll()
         .forEach(c -> logger.info(c.toString()));
    	 countryService
         .findAll()
         .forEach(c -> System.out.println(c.toString()));
 
        
    }
  
}
