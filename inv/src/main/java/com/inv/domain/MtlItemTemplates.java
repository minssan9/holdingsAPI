package com.inv.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MTL_ITEM_TEMPLATES")
public class MtlItemTemplates implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "TEMPLATE_ID", nullable = false)
    private String templateId;

    @Column(name = "TEMPLATE_NAME", nullable = false)
    private String templateName;

    @Column(name = "DESCRIPTION", nullable = false)
    private String DESCRIPTION;

    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private LocalDate lastUpdateDate;

    @Column(name = "LAST_UPDATED_BY", nullable = false)
    private String lastUpdatedBy;

    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDate creationDate;

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;

    @Column(name = "LAST_UPDATE_LOGIN")
    private String lastUpdateLogin;

    @Column(name = "ATTRIBUTE_CATEGORY")
    private String attributeCategory;

    @Column(name = "ATTRIBUTE1")
    private String ATTRIBUTE1;

    @Column(name = "ATTRIBUTE2")
    private String ATTRIBUTE2;

    @Column(name = "ATTRIBUTE3")
    private String ATTRIBUTE3;

    @Column(name = "ATTRIBUTE4")
    private String ATTRIBUTE4;

    @Column(name = "ATTRIBUTE5")
    private String ATTRIBUTE5;

    @Column(name = "ATTRIBUTE6")
    private String ATTRIBUTE6;

    @Column(name = "ATTRIBUTE7")
    private String ATTRIBUTE7;

    @Column(name = "ATTRIBUTE8")
    private String ATTRIBUTE8;

    @Column(name = "ATTRIBUTE9")
    private String ATTRIBUTE9;

    @Column(name = "ATTRIBUTE10")
    private String ATTRIBUTE10;

    @Column(name = "ATTRIBUTE11")
    private String ATTRIBUTE11;

    @Column(name = "ATTRIBUTE12")
    private String ATTRIBUTE12;

    @Column(name = "ATTRIBUTE13")
    private String ATTRIBUTE13;

    @Column(name = "ATTRIBUTE14")
    private String ATTRIBUTE14;

    @Column(name = "ATTRIBUTE15")
    private String ATTRIBUTE15;

    @Column(name = "REQUEST_ID")
    private String requestId;

    @Column(name = "PROGRAM_APPLICATION_ID")
    private String programApplicationId;

    @Column(name = "PROGRAM_ID")
    private String programId;

    @Column(name = "PROGRAM_UPDATE_DATE")
    private LocalDate programUpdateDate;

    @Column(name = "CONTEXT_ORGANIZATION_ID")
    private String contextOrganizationId;

    @Column(name = "GLOBAL_ATTRIBUTE_CATEGORY")
    private String globalAttributeCategory;

    @Column(name = "GLOBAL_ATTRIBUTE1")
    private String globalAttribute1;

    @Column(name = "GLOBAL_ATTRIBUTE2")
    private String globalAttribute2;

    @Column(name = "GLOBAL_ATTRIBUTE3")
    private String globalAttribute3;

    @Column(name = "GLOBAL_ATTRIBUTE4")
    private String globalAttribute4;

    @Column(name = "GLOBAL_ATTRIBUTE5")
    private String globalAttribute5;

    @Column(name = "GLOBAL_ATTRIBUTE6")
    private String globalAttribute6;

    @Column(name = "GLOBAL_ATTRIBUTE7")
    private String globalAttribute7;

    @Column(name = "GLOBAL_ATTRIBUTE8")
    private String globalAttribute8;

    @Column(name = "GLOBAL_ATTRIBUTE9")
    private String globalAttribute9;

    @Column(name = "GLOBAL_ATTRIBUTE10")
    private String globalAttribute10;

}
