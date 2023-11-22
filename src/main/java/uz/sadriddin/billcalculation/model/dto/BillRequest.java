package uz.sadriddin.billcalculation.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BillRequest(@JsonProperty("party_id") Integer partyId, String description, Long amount,
                          @JsonProperty("paid_at") LocalDateTime paidAt
                          //TODO: need to add data about payers and amounts
) {
}
