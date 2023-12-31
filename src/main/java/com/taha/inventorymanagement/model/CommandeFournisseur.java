package com.taha.inventorymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "CommandeFournisseur")
public class CommandeFournisseur extends AbstractEntity{
    @Column(name = "code")
    private String code ;
    @Column(name = "dateCommande")
    private Date dateCommande ;
    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur ;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

}
