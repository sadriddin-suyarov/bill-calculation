package uz.sadriddin.billcalculation.service;

import uz.sadriddin.billcalculation.model.dto.PartyRequest;
import uz.sadriddin.billcalculation.model.entity.Bill;

public interface PartyService {
    void save(PartyRequest request);

    void updateParty(Integer partyId, Bill savedBill);
}
