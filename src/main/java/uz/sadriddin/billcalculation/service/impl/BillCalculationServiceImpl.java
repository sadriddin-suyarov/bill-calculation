package uz.sadriddin.billcalculation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.sadriddin.billcalculation.model.dto.BillRequest;
import uz.sadriddin.billcalculation.model.dto.CalculationResponse;
import uz.sadriddin.billcalculation.model.dto.PartyRequest;
import uz.sadriddin.billcalculation.service.BillCalculationService;
import uz.sadriddin.billcalculation.service.BillService;
import uz.sadriddin.billcalculation.service.PartyService;

@Service
@RequiredArgsConstructor
public class BillCalculationServiceImpl implements BillCalculationService {
    private final PartyService partyService;
    private final BillService billService;

    @Override
    public void processParty(PartyRequest request) {
        partyService.save(request);
    }

    @Override
    public void processBill(BillRequest request) {
        var savedBill = billService.save(request);
        partyService.updateParty(request.partyId(), savedBill);
        calculatePayments(request);
    }

    @Override
    public CalculationResponse getCalculations(String partyId) {
        return null;
    }

    private void calculatePayments(BillRequest request) {
        //TODO: need to implement calculatePayments logic
    }
}
