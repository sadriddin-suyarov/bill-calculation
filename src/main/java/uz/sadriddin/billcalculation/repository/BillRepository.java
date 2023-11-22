package uz.sadriddin.billcalculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sadriddin.billcalculation.model.entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer> {
}
