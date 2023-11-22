package uz.sadriddin.billcalculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sadriddin.billcalculation.model.entity.Calculation;

public interface CalculationRepository extends JpaRepository<Calculation, Integer> {
}
