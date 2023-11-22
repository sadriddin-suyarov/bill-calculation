package uz.sadriddin.billcalculation.service;

import uz.sadriddin.billcalculation.model.dto.BillRequest;
import uz.sadriddin.billcalculation.model.entity.Bill;

public interface BillService {
    Bill save(BillRequest request);
}
