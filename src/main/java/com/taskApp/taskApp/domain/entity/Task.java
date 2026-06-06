package com.taskApp.taskApp.domain.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "tasks")
public class Task {
    @GeneratedValue(strategy = GenerationType.UUID )
    private UUID ID;
}
