package com.imaginnovate.user_service.model;



import org.springframework.data.geo.Point;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 80, nullable = false)
    private String name;

    @Column(name = "gender", length = 1, nullable = false)
    private Character gender;

    @Column(name = "email", length = 80, nullable = false, unique = true)
    private String email;

    @Column(name = "phone_no", nullable = false)
    private Long phoneNo;

    @Column(name = "address", nullable = false)
    private Point address;

    @Column(name = "is_admin", nullable = false)
    private Boolean isAdmin;

    @Column(name = "is_unregistered_user", nullable = false)
    private Boolean isUnRegistereduser;
}