package uz.sadriddin.billcalculation.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "calculations")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Calculation {
    @Id
    private Integer id;
//TODO: need to review calculation model structure
//    private Long amount;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "debtor_id", referencedColumnName = "id")
//    @JsonBackReference
//    private Member debtor;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "creditor_id", referencedColumnName = "id")
//    @JsonBackReference
//    private Member creditor;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "bill_id", referencedColumnName = "id")
//    @JsonBackReference
//    private Bill bill;
}
