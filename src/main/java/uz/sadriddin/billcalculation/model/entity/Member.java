package uz.sadriddin.billcalculation.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "members")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Member {
    @Id
    private Integer id;
    private String memberName;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "party_id", referencedColumnName = "id")
    @JsonBackReference
    private Party party;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "calculation_id", referencedColumnName = "id")
    @JsonBackReference
    private Calculation calculation;
}
