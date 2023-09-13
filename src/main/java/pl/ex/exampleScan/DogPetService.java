package pl.ex.exampleScan;

import com.example.demo.repository.PetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("pet")
@Profile("dog")
public class DogPetService implements PetRepository {

    @Override
    public String checkPet() {
        return "Pies";
    }
}
