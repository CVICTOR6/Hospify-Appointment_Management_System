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

    @ManyToMany(mappedBy = "appointment")
    private Set<Doctor> doctor = new HashSet<>();

    @ManyToMany(mappedBy = "appointment")
    private Set<Patient> patient = new HashSet<>();

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private AppointmentStatus status;

    private String reason;


}
