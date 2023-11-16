package model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data ;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
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
