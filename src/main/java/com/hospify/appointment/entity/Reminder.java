package com.hospify.appointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "reminder")
public class Reminder extends BaseEntity{

    private String message;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
}
