//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.30 a las 07:05:33 PM CDT 
//


package com.mcss.sat.cfdi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para c_ConfigMaritima.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_ConfigMaritima"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="B01"/&gt;
 *     &lt;enumeration value="B02"/&gt;
 *     &lt;enumeration value="B03"/&gt;
 *     &lt;enumeration value="B04"/&gt;
 *     &lt;enumeration value="B05"/&gt;
 *     &lt;enumeration value="B06"/&gt;
 *     &lt;enumeration value="B07"/&gt;
 *     &lt;enumeration value="B08"/&gt;
 *     &lt;enumeration value="B09"/&gt;
 *     &lt;enumeration value="B10"/&gt;
 *     &lt;enumeration value="B11"/&gt;
 *     &lt;enumeration value="B12"/&gt;
 *     &lt;enumeration value="B13"/&gt;
 *     &lt;enumeration value="B14"/&gt;
 *     &lt;enumeration value="B15"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_ConfigMaritima", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CConfigMaritima {

    @XmlEnumValue("B01")
    B_01("B01"),
    @XmlEnumValue("B02")
    B_02("B02"),
    @XmlEnumValue("B03")
    B_03("B03"),
    @XmlEnumValue("B04")
    B_04("B04"),
    @XmlEnumValue("B05")
    B_05("B05"),
    @XmlEnumValue("B06")
    B_06("B06"),
    @XmlEnumValue("B07")
    B_07("B07"),
    @XmlEnumValue("B08")
    B_08("B08"),
    @XmlEnumValue("B09")
    B_09("B09"),
    @XmlEnumValue("B10")
    B_10("B10"),
    @XmlEnumValue("B11")
    B_11("B11"),
    @XmlEnumValue("B12")
    B_12("B12"),
    @XmlEnumValue("B13")
    B_13("B13"),
    @XmlEnumValue("B14")
    B_14("B14"),
    @XmlEnumValue("B15")
    B_15("B15");
    private final String value;

    CConfigMaritima(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CConfigMaritima fromValue(String v) {
        for (CConfigMaritima c: CConfigMaritima.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
