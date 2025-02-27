package com.sathya.ormEx.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
private Integer proId;
private String proName;
private Double proPrice;
private LocalDateTime createAt;
private String createBy;
}
