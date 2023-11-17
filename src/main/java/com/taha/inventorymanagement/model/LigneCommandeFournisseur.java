package com.taha.inventorymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "LigneCommandeFournisseur")
public class LigneCommandeFournisseur extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article ;

    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandeFournisseur commandeFournisseur;

}
