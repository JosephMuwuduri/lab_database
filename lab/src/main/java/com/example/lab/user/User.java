package com.example.lab.user;

import jakarta.persistence.*; // For JPA annotations
import lombok.*; // For Lombok annotations
import org.springframework.lang.Nullable; // For the Nullable annotation

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates ID values
    private Long id;

    @Column(name = "name", nullable = false) // Maps to "name" column, not null
    private String name;

    @Column(name = "surname", nullable = false) // Maps to "surname" column, not null
    private String surname;

    @Column(name = "email", nullable = false) // Maps to "email" column, not null
    private String email;

    @Column(name = "contact_number") // Maps to "contact_number" column
    @Nullable // Allows null values
    private String contactNumber;

    // Constructor for required fields
    public User(String name, String surname, String email, String contactNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.contactNumber = contactNumber;
    }
}