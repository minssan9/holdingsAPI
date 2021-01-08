package halla.holdings.oracle.item.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "xxe_item_spec_info_tmp")
@Data
@AllArgsConstructor
public class ItemSpec {
    @Id
    private String item_number;
    private String group_id;
    private String before_number;
    private String before_compatible;
    private String before_effective_date;
    private String after_number;
    private String after_compatible;
    private String after_effective_date;
    private String ifflag;
    private String creation_date;
    private String created_by;
    private String last_update_date;
    private String last_updated_by;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;
    private String attribute8;
    private String attribute9;
    private String attribute10;

    public ItemSpec() {

    }
}
