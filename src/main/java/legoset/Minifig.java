package legoset;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Minifig {
    @XmlAttribute
    private int count;
    @XmlValue
    private String minifig;

    public Minifig(int count, String minifig) {
        this.count = count;
        this.minifig = minifig;
    }

    public Minifig() {
    }
}
