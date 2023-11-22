package uz.sadriddin.billcalculation.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PartyRequest(@JsonProperty("party_name") String partyName, List<MemberRequest> members) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record MemberRequest(@JsonProperty("member_name") String memberName) {
    }
}
