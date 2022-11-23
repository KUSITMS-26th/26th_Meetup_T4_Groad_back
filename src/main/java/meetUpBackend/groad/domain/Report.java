package meetUpBackend.groad.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Report {

    @Id
    @GeneratedValue
    @JsonProperty("reportId")
    @Column(name = "reportId")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private Review userId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reviewId")
    private Review reviewId;

    @Column(name = "reportTitle")
    private Integer title;
    @Column(name = "reportContent")
    private Integer content;
    @Column(name = "reportCategory")
    private Integer category;

    @Column(name = "reportCount")
    private Integer count;

    @JsonProperty("regDate")
    @CreationTimestamp
    private LocalDateTime regDate ;

    @JsonProperty("updDate")
    @UpdateTimestamp
    private LocalDateTime updDate ;

}
