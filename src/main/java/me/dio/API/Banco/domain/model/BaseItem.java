package me.dio.API.Banco.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long news_id;

    private String icon;

    private String description;
}
