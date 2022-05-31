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
 * <p>Clase Java para c_TipoCarro.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_TipoCarro"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="TC01"/&gt;
 *     &lt;enumeration value="TC02"/&gt;
 *     &lt;enumeration value="TC03"/&gt;
 *     &lt;enumeration value="TC04"/&gt;
 *     &lt;enumeration value="TC05"/&gt;
 *     &lt;enumeration value="TC06"/&gt;
 *     &lt;enumeration value="TC07"/&gt;
 *     &lt;enumeration value="TC08"/&gt;
 *     &lt;enumeration value="TC09"/&gt;
 *     &lt;enumeration value="TC10"/&gt;
 *     &lt;enumeration value="TC11"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_TipoCarro", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CTipoCarro {

    @XmlEnumValue("TC01")
    TC_01("TC01"),
    @XmlEnumValue("TC02")
    TC_02("TC02"),
    @XmlEnumValue("TC03")
    TC_03("TC03"),
    @XmlEnumValue("TC04")
    TC_04("TC04"),
    @XmlEnumValue("TC05")
    TC_05("TC05"),
    @XmlEnumValue("TC06")
    TC_06("TC06"),
    @XmlEnumValue("TC07")
    TC_07("TC07"),
    @XmlEnumValue("TC08")
    TC_08("TC08"),
    @XmlEnumValue("TC09")
    TC_09("TC09"),
    @XmlEnumValue("TC10")
    TC_10("TC10"),
    @XmlEnumValue("TC11")
    TC_11("TC11");
    private final String value;

    CTipoCarro(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CTipoCarro fromValue(String v) {
        for (CTipoCarro c: CTipoCarro.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
