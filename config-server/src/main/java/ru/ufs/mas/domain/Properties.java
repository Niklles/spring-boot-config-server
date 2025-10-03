package ru.ufs.mas.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "properties")
@Data
public class Properties implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6747531716778688077L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROPERTIES")
    @SequenceGenerator(name="SEQ_PROPERTIES", schema="CONFIG", sequenceName="SEQ_PROPERTIES_ID", allocationSize=1)
    private Long id;
    private String application;
    private String profile;
    private String label;
    private String key;
    private String value;
}
