package uz.sadriddin.billcalculation.service;

import uz.sadriddin.billcalculation.model.dto.BillRequest;
import uz.sadriddin.billcalculation.model.dto.CalculationResponse;
import uz.sadriddin.billcalculation.model.dto.PartyRequest;

public interface BillCalculationService {
    void processParty(PartyRequest request);

    void processBill(BillRequest request);

    CalculationResponse getCalculations(String partyId);
}
