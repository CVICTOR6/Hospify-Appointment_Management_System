package com.hospify.appointment.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "contact_information")
public class ContactInformation extends BaseEntity{

    @Column(name = "phone", length = 17)
    private String phone;

    @Column(name = "email", unique = true, length = 100)
    private String email;

    @OneToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
}
