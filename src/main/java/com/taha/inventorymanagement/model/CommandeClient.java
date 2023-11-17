package com.taha.inventorymanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "commandeClient")
public class CommandeClient extends AbstractEntity{

    @Column(name = "code")
    private String code ;
    @Column(name = "dateCommande")
    private Date dateCommande;

    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client ;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;

}
