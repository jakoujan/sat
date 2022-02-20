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
 * <p>Clase Java para c_TipoDeServicio.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_TipoDeServicio"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="TS01"/&gt;
 *     &lt;enumeration value="TS02"/&gt;
 *     &lt;enumeration value="TS03"/&gt;
 *     &lt;enumeration value="TS04"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_TipoDeServicio", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CTipoDeServicio {

    @XmlEnumValue("TS01")
    TS_01("TS01"),
    @XmlEnumValue("TS02")
    TS_02("TS02"),
    @XmlEnumValue("TS03")
    TS_03("TS03"),
    @XmlEnumValue("TS04")
    TS_04("TS04");
    private final String value;

    CTipoDeServicio(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CTipoDeServicio fromValue(String v) {
        for (CTipoDeServicio c: CTipoDeServicio.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
