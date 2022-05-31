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
 * <p>Clase Java para c_ConfigAutotransporte.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_ConfigAutotransporte"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="C2"/&gt;
 *     &lt;enumeration value="C3"/&gt;
 *     &lt;enumeration value="C2R2"/&gt;
 *     &lt;enumeration value="C3R2"/&gt;
 *     &lt;enumeration value="C2R3"/&gt;
 *     &lt;enumeration value="C3R3"/&gt;
 *     &lt;enumeration value="T2S1"/&gt;
 *     &lt;enumeration value="T2S2"/&gt;
 *     &lt;enumeration value="T2S3"/&gt;
 *     &lt;enumeration value="T3S1"/&gt;
 *     &lt;enumeration value="T3S2"/&gt;
 *     &lt;enumeration value="T3S3"/&gt;
 *     &lt;enumeration value="T2S1R2"/&gt;
 *     &lt;enumeration value="T2S2R2"/&gt;
 *     &lt;enumeration value="T2S1R3"/&gt;
 *     &lt;enumeration value="T3S1R2"/&gt;
 *     &lt;enumeration value="T3S1R3"/&gt;
 *     &lt;enumeration value="T3S2R2"/&gt;
 *     &lt;enumeration value="T3S2R3"/&gt;
 *     &lt;enumeration value="T3S2R4"/&gt;
 *     &lt;enumeration value="T2S2S2"/&gt;
 *     &lt;enumeration value="T3S2S2"/&gt;
 *     &lt;enumeration value="T3S3S2"/&gt;
 *     &lt;enumeration value="OTROEV"/&gt;
 *     &lt;enumeration value="OTROEGP"/&gt;
 *     &lt;enumeration value="OTROSG"/&gt;
 *     &lt;enumeration value="VL"/&gt;
 *     &lt;enumeration value="OTROEVGP"/&gt;
 *     &lt;enumeration value="GPLUTA"/&gt;
 *     &lt;enumeration value="GPLUTB"/&gt;
 *     &lt;enumeration value="GPLUTC"/&gt;
 *     &lt;enumeration value="GPLUTD"/&gt;
 *     &lt;enumeration value="GPLATA"/&gt;
 *     &lt;enumeration value="GPLATB"/&gt;
 *     &lt;enumeration value="GPLATC"/&gt;
 *     &lt;enumeration value="GPLATD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_ConfigAutotransporte", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CConfigAutotransporte {

    @XmlEnumValue("C2")
    C_2("C2"),
    @XmlEnumValue("C3")
    C_3("C3"),
    @XmlEnumValue("C2R2")
    C_2_R_2("C2R2"),
    @XmlEnumValue("C3R2")
    C_3_R_2("C3R2"),
    @XmlEnumValue("C2R3")
    C_2_R_3("C2R3"),
    @XmlEnumValue("C3R3")
    C_3_R_3("C3R3"),
    @XmlEnumValue("T2S1")
    T_2_S_1("T2S1"),
    @XmlEnumValue("T2S2")
    T_2_S_2("T2S2"),
    @XmlEnumValue("T2S3")
    T_2_S_3("T2S3"),
    @XmlEnumValue("T3S1")
    T_3_S_1("T3S1"),
    @XmlEnumValue("T3S2")
    T_3_S_2("T3S2"),
    @XmlEnumValue("T3S3")
    T_3_S_3("T3S3"),
    @XmlEnumValue("T2S1R2")
    T_2_S_1_R_2("T2S1R2"),
    @XmlEnumValue("T2S2R2")
    T_2_S_2_R_2("T2S2R2"),
    @XmlEnumValue("T2S1R3")
    T_2_S_1_R_3("T2S1R3"),
    @XmlEnumValue("T3S1R2")
    T_3_S_1_R_2("T3S1R2"),
    @XmlEnumValue("T3S1R3")
    T_3_S_1_R_3("T3S1R3"),
    @XmlEnumValue("T3S2R2")
    T_3_S_2_R_2("T3S2R2"),
    @XmlEnumValue("T3S2R3")
    T_3_S_2_R_3("T3S2R3"),
    @XmlEnumValue("T3S2R4")
    T_3_S_2_R_4("T3S2R4"),
    @XmlEnumValue("T2S2S2")
    T_2_S_2_S_2("T2S2S2"),
    @XmlEnumValue("T3S2S2")
    T_3_S_2_S_2("T3S2S2"),
    @XmlEnumValue("T3S3S2")
    T_3_S_3_S_2("T3S3S2"),
    OTROEV("OTROEV"),
    OTROEGP("OTROEGP"),
    OTROSG("OTROSG"),
    VL("VL"),
    OTROEVGP("OTROEVGP"),
    GPLUTA("GPLUTA"),
    GPLUTB("GPLUTB"),
    GPLUTC("GPLUTC"),
    GPLUTD("GPLUTD"),
    GPLATA("GPLATA"),
    GPLATB("GPLATB"),
    GPLATC("GPLATC"),
    GPLATD("GPLATD");
    private final String value;

    CConfigAutotransporte(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CConfigAutotransporte fromValue(String v) {
        for (CConfigAutotransporte c: CConfigAutotransporte.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
