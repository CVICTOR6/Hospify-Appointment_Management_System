package com.hospify.appointment.entity;

import com.hospify.appointment.constants.BloodGroup;
import com.hospify.appointment.constants.Genotype;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "patient_profile")
public class PatientProfile extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private BloodGroup bloodGroup;

    @Column(name ="height", length = 10)
    private int height;

    @ManyToOne
    @JoinColumn(name = "medical_history_id")
    private MedicalHistory medicalHistory;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private Genotype genotype;

    @Column(name ="weight", length = 10)
    private double weight;

    @Column(name = "marriage_status")
    private String marriageStatus;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "emergency_contact_name")
    private String emergencyContactName;

    @Column(name = "emergency_contact_phone_number")
    private String emergencyContactPhoneNumber;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
