package uz.sadriddin.billcalculation.model.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "parties")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Party {
    @Id
    private Integer id;
    private String partyName;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
    private List<Member> members;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "party")
    private List<Bill> bills;
}
