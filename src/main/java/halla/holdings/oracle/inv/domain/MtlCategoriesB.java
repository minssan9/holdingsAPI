package halla.holdings.oracle.inv.domain;

import lombok.Data;
import oracle.sql.DATE;
import oracle.sql.NUMBER;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "MTL_CATEGORIES_B", schema = "INV", catalog = "")
@Data
@IdClass(MtlCategoriesB.class)
public class MtlCategoriesB implements Serializable {
    @Id
    @Column(name = "CATEGORY_ID", nullable = false) private double category_id;
    @Id
    @Column(name = "STRUCTURE_ID", nullable = false) private Long structure_id;
    @Column(name = "DESCRIPTION", nullable = true) private String description;
    @Column(name = "DISABLE_DATE", nullable = true) private double disable_date;
    @Column(name = "SEGMENT2", nullable = true) private String segment2;
    @Column(name = "SEGMENT3", nullable = true) private LocalDateTime segment3;
    @Column(name = "SEGMENT4", nullable = true) private String segment4;
    @Column(name = "SEGMENT5", nullable = true) private String segment5;
    @Column(name = "SEGMENT6", nullable = true) private String segment6;
    @Column(name = "SEGMENT7", nullable = true) private String segment7;
    @Column(name = "SEGMENT8", nullable = true) private String segment8;
    @Column(name = "SEGMENT9", nullable = true) private String segment9;
    @Column(name = "SEGMENT10", nullable = true) private String segment10;
    @Column(name = "SEGMENT11", nullable = true) private String segment11;
    @Column(name = "SEGMENT12", nullable = true) private String segment12;
    @Column(name = "SEGMENT13", nullable = true) private String segment13;
    @Column(name = "SEGMENT14", nullable = true) private String segment14;
    @Column(name = "SEGMENT15", nullable = true) private String segment15;
    @Column(name = "SEGMENT16", nullable = true) private String segment16;
    @Column(name = "SEGMENT17", nullable = true) private String segment17;
    @Column(name = "SEGMENT18", nullable = true) private String segment18;
    @Column(name = "SEGMENT19", nullable = true) private String segment19;
    @Column(name = "SEGMENT20", nullable = true) private String segment20;
    @Column(name = "SUMMARY_FLAG", nullable = false) private String summary_flag;
    @Column(name = "ENABLED_FLAG", nullable = false) private String enabled_flag;
    @Column(name = "START_DATE_ACTIVE", nullable = true) private String start_date_active;
    @Column(name = "ATTRIBUTE1", nullable = true) private String attribute1;
    @Column(name = "ATTRIBUTE2", nullable = true) private String attribute2;
    @Column(name = "ATTRIBUTE3", nullable = true) private LocalDateTime attribute3;
    @Column(name = "ATTRIBUTE4", nullable = true) private LocalDateTime attribute4;
    @Column(name = "ATTRIBUTE5", nullable = true) private String attribute5;
    @Column(name = "ATTRIBUTE6", nullable = true) private String attribute6;
    @Column(name = "ATTRIBUTE7", nullable = true) private String attribute7;
    @Column(name = "ATTRIBUTE8", nullable = true) private String attribute8;
    @Column(name = "ATTRIBUTE9", nullable = true) private String attribute9;
    @Column(name = "ATTRIBUTE10", nullable = true) private String attribute10;
    @Column(name = "ATTRIBUTE11", nullable = true) private String attribute11;
    @Column(name = "ATTRIBUTE12", nullable = true) private String attribute12;
    @Column(name = "ATTRIBUTE13", nullable = true) private String attribute13;
    @Column(name = "ATTRIBUTE14", nullable = true) private String attribute14;
    @Column(name = "ATTRIBUTE15", nullable = true) private String attribute15;
    @Column(name = "LAST_UPDATE_DATE", nullable = false) private String last_update_date;
    @Column(name = "SUPPLIER_ENABLED_FLAG", nullable = true) private String supplier_enabled_flag;
}
