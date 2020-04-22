package legoset;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Weight {
    private double value;
    private String unit;

    public Weight(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public Weight() {
    }
}
