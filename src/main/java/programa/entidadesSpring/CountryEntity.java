package programa.entidadesSpring;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class CountryEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Column(nullable = false, unique = true)
    private String name;
  
    @Column(nullable = false)
    private Integer population;

	@Override
	public String toString() {
		return "CountryEntity [id=" + id + ", name=" + name + ", population=" + population + "]";
	}

}


