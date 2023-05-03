package com.hospify.appointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "insurance_information")
public class InsuranceInformation extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
