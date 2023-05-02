package com.hospify.appointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "medical_history")
public class MedicalHistory extends BaseEntity{

        @OneToMany(mappedBy = "medicalHistory")
        private Set<PatientProfile> patientProfiles = new HashSet<>();
}
