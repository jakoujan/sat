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
 * <p>Clase Java para c_TipoPermiso.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_TipoPermiso"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="TPAF01"/&gt;
 *     &lt;enumeration value="TPAF02"/&gt;
 *     &lt;enumeration value="TPAF03"/&gt;
 *     &lt;enumeration value="TPAF04"/&gt;
 *     &lt;enumeration value="TPAF05"/&gt;
 *     &lt;enumeration value="TPAF06"/&gt;
 *     &lt;enumeration value="TPAF07"/&gt;
 *     &lt;enumeration value="TPAF08"/&gt;
 *     &lt;enumeration value="TPAF09"/&gt;
 *     &lt;enumeration value="TPAF10"/&gt;
 *     &lt;enumeration value="TPAF11"/&gt;
 *     &lt;enumeration value="TPAF12"/&gt;
 *     &lt;enumeration value="TPAF13"/&gt;
 *     &lt;enumeration value="TPAF14"/&gt;
 *     &lt;enumeration value="TPAF15"/&gt;
 *     &lt;enumeration value="TPAF16"/&gt;
 *     &lt;enumeration value="TPAF17"/&gt;
 *     &lt;enumeration value="TPAF18"/&gt;
 *     &lt;enumeration value="TPAF19"/&gt;
 *     &lt;enumeration value="TPAF20"/&gt;
 *     &lt;enumeration value="TPTM01"/&gt;
 *     &lt;enumeration value="TPTA01"/&gt;
 *     &lt;enumeration value="TPTA02"/&gt;
 *     &lt;enumeration value="TPTA03"/&gt;
 *     &lt;enumeration value="TPTA04"/&gt;
 *     &lt;enumeration value="TPXX00"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_TipoPermiso", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CTipoPermiso {

    @XmlEnumValue("TPAF01")
    TPAF_01("TPAF01"),
    @XmlEnumValue("TPAF02")
    TPAF_02("TPAF02"),
    @XmlEnumValue("TPAF03")
    TPAF_03("TPAF03"),
    @XmlEnumValue("TPAF04")
    TPAF_04("TPAF04"),
    @XmlEnumValue("TPAF05")
    TPAF_05("TPAF05"),
    @XmlEnumValue("TPAF06")
    TPAF_06("TPAF06"),
    @XmlEnumValue("TPAF07")
    TPAF_07("TPAF07"),
    @XmlEnumValue("TPAF08")
    TPAF_08("TPAF08"),
    @XmlEnumValue("TPAF09")
    TPAF_09("TPAF09"),
    @XmlEnumValue("TPAF10")
    TPAF_10("TPAF10"),
    @XmlEnumValue("TPAF11")
    TPAF_11("TPAF11"),
    @XmlEnumValue("TPAF12")
    TPAF_12("TPAF12"),
    @XmlEnumValue("TPAF13")
    TPAF_13("TPAF13"),
    @XmlEnumValue("TPAF14")
    TPAF_14("TPAF14"),
    @XmlEnumValue("TPAF15")
    TPAF_15("TPAF15"),
    @XmlEnumValue("TPAF16")
    TPAF_16("TPAF16"),
    @XmlEnumValue("TPAF17")
    TPAF_17("TPAF17"),
    @XmlEnumValue("TPAF18")
    TPAF_18("TPAF18"),
    @XmlEnumValue("TPAF19")
    TPAF_19("TPAF19"),
    @XmlEnumValue("TPAF20")
    TPAF_20("TPAF20"),
    @XmlEnumValue("TPTM01")
    TPTM_01("TPTM01"),
    @XmlEnumValue("TPTA01")
    TPTA_01("TPTA01"),
    @XmlEnumValue("TPTA02")
    TPTA_02("TPTA02"),
    @XmlEnumValue("TPTA03")
    TPTA_03("TPTA03"),
    @XmlEnumValue("TPTA04")
    TPTA_04("TPTA04"),
    @XmlEnumValue("TPXX00")
    TPXX_00("TPXX00");
    private final String value;

    CTipoPermiso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CTipoPermiso fromValue(String v) {
        for (CTipoPermiso c: CTipoPermiso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
