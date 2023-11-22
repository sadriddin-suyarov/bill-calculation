package uz.sadriddin.billcalculation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.sadriddin.billcalculation.mapper.BillMapper;
import uz.sadriddin.billcalculation.model.dto.BillRequest;
import uz.sadriddin.billcalculation.model.entity.Bill;
import uz.sadriddin.billcalculation.repository.BillRepository;
import uz.sadriddin.billcalculation.service.BillService;

@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService {
    private final BillMapper billMapper;
    private final BillRepository billRepository;

    @Override
    @Transactional
    public Bill save(BillRequest request) {
        var bill = billMapper.from(request);
        return billRepository.save(bill);
    }
}
