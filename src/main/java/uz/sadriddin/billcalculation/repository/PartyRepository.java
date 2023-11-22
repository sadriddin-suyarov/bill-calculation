package uz.sadriddin.billcalculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sadriddin.billcalculation.model.entity.Party;

public interface PartyRepository extends JpaRepository<Party, Integer> {
}
