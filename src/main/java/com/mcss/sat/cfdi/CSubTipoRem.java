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
 * <p>Clase Java para c_SubTipoRem.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_SubTipoRem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="CTR001"/&gt;
 *     &lt;enumeration value="CTR002"/&gt;
 *     &lt;enumeration value="CTR003"/&gt;
 *     &lt;enumeration value="CTR004"/&gt;
 *     &lt;enumeration value="CTR005"/&gt;
 *     &lt;enumeration value="CTR006"/&gt;
 *     &lt;enumeration value="CTR007"/&gt;
 *     &lt;enumeration value="CTR008"/&gt;
 *     &lt;enumeration value="CTR009"/&gt;
 *     &lt;enumeration value="CTR010"/&gt;
 *     &lt;enumeration value="CTR011"/&gt;
 *     &lt;enumeration value="CTR012"/&gt;
 *     &lt;enumeration value="CTR013"/&gt;
 *     &lt;enumeration value="CTR014"/&gt;
 *     &lt;enumeration value="CTR015"/&gt;
 *     &lt;enumeration value="CTR016"/&gt;
 *     &lt;enumeration value="CTR017"/&gt;
 *     &lt;enumeration value="CTR018"/&gt;
 *     &lt;enumeration value="CTR019"/&gt;
 *     &lt;enumeration value="CTR020"/&gt;
 *     &lt;enumeration value="CTR021"/&gt;
 *     &lt;enumeration value="CTR022"/&gt;
 *     &lt;enumeration value="CTR023"/&gt;
 *     &lt;enumeration value="CTR024"/&gt;
 *     &lt;enumeration value="CTR025"/&gt;
 *     &lt;enumeration value="CTR026"/&gt;
 *     &lt;enumeration value="CTR027"/&gt;
 *     &lt;enumeration value="CTR028"/&gt;
 *     &lt;enumeration value="CTR029"/&gt;
 *     &lt;enumeration value="CTR030"/&gt;
 *     &lt;enumeration value="CTR031"/&gt;
 *     &lt;enumeration value="CTR032"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_SubTipoRem", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CSubTipoRem {

    @XmlEnumValue("CTR001")
    CTR_001("CTR001"),
    @XmlEnumValue("CTR002")
    CTR_002("CTR002"),
    @XmlEnumValue("CTR003")
    CTR_003("CTR003"),
    @XmlEnumValue("CTR004")
    CTR_004("CTR004"),
    @XmlEnumValue("CTR005")
    CTR_005("CTR005"),
    @XmlEnumValue("CTR006")
    CTR_006("CTR006"),
    @XmlEnumValue("CTR007")
    CTR_007("CTR007"),
    @XmlEnumValue("CTR008")
    CTR_008("CTR008"),
    @XmlEnumValue("CTR009")
    CTR_009("CTR009"),
    @XmlEnumValue("CTR010")
    CTR_010("CTR010"),
    @XmlEnumValue("CTR011")
    CTR_011("CTR011"),
    @XmlEnumValue("CTR012")
    CTR_012("CTR012"),
    @XmlEnumValue("CTR013")
    CTR_013("CTR013"),
    @XmlEnumValue("CTR014")
    CTR_014("CTR014"),
    @XmlEnumValue("CTR015")
    CTR_015("CTR015"),
    @XmlEnumValue("CTR016")
    CTR_016("CTR016"),
    @XmlEnumValue("CTR017")
    CTR_017("CTR017"),
    @XmlEnumValue("CTR018")
    CTR_018("CTR018"),
    @XmlEnumValue("CTR019")
    CTR_019("CTR019"),
    @XmlEnumValue("CTR020")
    CTR_020("CTR020"),
    @XmlEnumValue("CTR021")
    CTR_021("CTR021"),
    @XmlEnumValue("CTR022")
    CTR_022("CTR022"),
    @XmlEnumValue("CTR023")
    CTR_023("CTR023"),
    @XmlEnumValue("CTR024")
    CTR_024("CTR024"),
    @XmlEnumValue("CTR025")
    CTR_025("CTR025"),
    @XmlEnumValue("CTR026")
    CTR_026("CTR026"),
    @XmlEnumValue("CTR027")
    CTR_027("CTR027"),
    @XmlEnumValue("CTR028")
    CTR_028("CTR028"),
    @XmlEnumValue("CTR029")
    CTR_029("CTR029"),
    @XmlEnumValue("CTR030")
    CTR_030("CTR030"),
    @XmlEnumValue("CTR031")
    CTR_031("CTR031"),
    @XmlEnumValue("CTR032")
    CTR_032("CTR032");
    private final String value;

    CSubTipoRem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CSubTipoRem fromValue(String v) {
        for (CSubTipoRem c: CSubTipoRem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
