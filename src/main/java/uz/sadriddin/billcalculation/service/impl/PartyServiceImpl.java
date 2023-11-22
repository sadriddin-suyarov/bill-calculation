package uz.sadriddin.billcalculation.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.sadriddin.billcalculation.mapper.PartyMapper;
import uz.sadriddin.billcalculation.model.dto.PartyRequest;
import uz.sadriddin.billcalculation.model.entity.Bill;
import uz.sadriddin.billcalculation.repository.PartyRepository;
import uz.sadriddin.billcalculation.service.PartyService;

@Service
@RequiredArgsConstructor
public class PartyServiceImpl implements PartyService {
    private final PartyMapper partyMapper;
    private final PartyRepository partyRepository;


    @Override
    @Transactional
    public void save(PartyRequest request) {
        var party = partyMapper.from(request);
        partyRepository.save(party);
    }

    @Override
    @Transactional
    public void updateParty(Integer partyId, Bill savedBill) {
        var party = partyRepository.getReferenceById(partyId);
        party.getBills().add(savedBill);
    }
}
