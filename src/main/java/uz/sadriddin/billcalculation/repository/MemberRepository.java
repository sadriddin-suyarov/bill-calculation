package uz.sadriddin.billcalculation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sadriddin.billcalculation.model.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
