package uz.sadriddin.billcalculation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import uz.sadriddin.billcalculation.model.dto.BillRequest;
import uz.sadriddin.billcalculation.model.entity.Bill;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BillMapper {

    @Mapping(target = "createdAt", source = "paidAt")
    Bill from(BillRequest request);
}
