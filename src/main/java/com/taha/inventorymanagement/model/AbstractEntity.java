package com.taha.inventorymanagement.model;


import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data ;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @CreatedDate
    @Column (name ="creationDate", nullable = false)
    @JsonIgnore
    private Date creationDate ;

    @LastModifiedDate
    @Column (name ="lastModifiedDate", nullable = false)
    @JsonIgnore
    private Date lastUpdateDate;

}
