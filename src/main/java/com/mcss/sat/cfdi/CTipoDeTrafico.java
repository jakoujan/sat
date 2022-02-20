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
 * <p>Clase Java para c_TipoDeTrafico.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_TipoDeTrafico"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="TT01"/&gt;
 *     &lt;enumeration value="TT02"/&gt;
 *     &lt;enumeration value="TT03"/&gt;
 *     &lt;enumeration value="TT04"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_TipoDeTrafico", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CTipoDeTrafico {

    @XmlEnumValue("TT01")
    TT_01("TT01"),
    @XmlEnumValue("TT02")
    TT_02("TT02"),
    @XmlEnumValue("TT03")
    TT_03("TT03"),
    @XmlEnumValue("TT04")
    TT_04("TT04");
    private final String value;

    CTipoDeTrafico(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CTipoDeTrafico fromValue(String v) {
        for (CTipoDeTrafico c: CTipoDeTrafico.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
