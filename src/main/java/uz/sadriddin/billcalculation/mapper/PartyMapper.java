package uz.sadriddin.billcalculation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import uz.sadriddin.billcalculation.model.dto.PartyRequest;
import uz.sadriddin.billcalculation.model.entity.Party;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = MemberMapper.class)
public interface PartyMapper {
    Party from(PartyRequest request);
}
