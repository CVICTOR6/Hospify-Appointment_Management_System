package com.hospify.appointment.entity;

import com.hospify.appointment.constants.AppointmentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "appointment")
public class Appointment extends BaseEntity{

    @Column(name = "appointment_date")
    private LocalDate appointmentDate;

    @ManyToMany
    @JoinTable(name = "doctor_appointment",
            joinColumns = @JoinColumn(name = "appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id"))
    private Set<Doctor> doctors = new HashSet<>();


    @ManyToMany
    @JoinTable(name = "appointment_patient",
            joinColumns = @JoinColumn(name = "appointment_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private Set<Patient> patients = new HashSet<>();


    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private AppointmentStatus status;

    private String reason;


}
