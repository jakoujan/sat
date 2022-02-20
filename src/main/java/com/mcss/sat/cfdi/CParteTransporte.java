//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.02.19 a las 05:22:48 PM CST 
//


package com.mcss.sat.cfdi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para c_ParteTransporte.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_ParteTransporte"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="PT01"/&gt;
 *     &lt;enumeration value="PT02"/&gt;
 *     &lt;enumeration value="PT03"/&gt;
 *     &lt;enumeration value="PT04"/&gt;
 *     &lt;enumeration value="PT05"/&gt;
 *     &lt;enumeration value="PT06"/&gt;
 *     &lt;enumeration value="PT07"/&gt;
 *     &lt;enumeration value="PT08"/&gt;
 *     &lt;enumeration value="PT09"/&gt;
 *     &lt;enumeration value="PT10"/&gt;
 *     &lt;enumeration value="PT11"/&gt;
 *     &lt;enumeration value="PT12"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_ParteTransporte", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CParteTransporte {

    @XmlEnumValue("PT01")
    PT_01("PT01"),
    @XmlEnumValue("PT02")
    PT_02("PT02"),
    @XmlEnumValue("PT03")
    PT_03("PT03"),
    @XmlEnumValue("PT04")
    PT_04("PT04"),
    @XmlEnumValue("PT05")
    PT_05("PT05"),
    @XmlEnumValue("PT06")
    PT_06("PT06"),
    @XmlEnumValue("PT07")
    PT_07("PT07"),
    @XmlEnumValue("PT08")
    PT_08("PT08"),
    @XmlEnumValue("PT09")
    PT_09("PT09"),
    @XmlEnumValue("PT10")
    PT_10("PT10"),
    @XmlEnumValue("PT11")
    PT_11("PT11"),
    @XmlEnumValue("PT12")
    PT_12("PT12");
    private final String value;

    CParteTransporte(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CParteTransporte fromValue(String v) {
        for (CParteTransporte c: CParteTransporte.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
