package uz.sadriddin.billcalculation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import uz.sadriddin.billcalculation.model.dto.PartyRequest;
import uz.sadriddin.billcalculation.model.entity.Member;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MemberMapper {
    Member from(PartyRequest.MemberRequest request);
}
