package uz.sadriddin.billcalculation.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.sadriddin.billcalculation.model.dto.BillRequest;
import uz.sadriddin.billcalculation.model.dto.CalculationResponse;
import uz.sadriddin.billcalculation.model.dto.PartyRequest;
import uz.sadriddin.billcalculation.service.BillCalculationService;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BillCalculationController {
    private final BillCalculationService billCalculationService;


    @PostMapping("/parties")
    public ResponseEntity<?> addParty(PartyRequest request) {
        billCalculationService.processParty(request);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/bills")
    public ResponseEntity<?> addBills(BillRequest request) {
        billCalculationService.processBill(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/calculations/{party_id}")
    public ResponseEntity<CalculationResponse> getCalculations(@PathVariable("party_id") String partyId) {
        CalculationResponse calculations = billCalculationService.getCalculations(partyId);
        return ResponseEntity.ok(calculations);
    }


}
