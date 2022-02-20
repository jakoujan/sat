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
 * <p>Clase Java para c_Contenedor.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_Contenedor"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="TC01"/&gt;
 *     &lt;enumeration value="TC02"/&gt;
 *     &lt;enumeration value="TC03"/&gt;
 *     &lt;enumeration value="TC04"/&gt;
 *     &lt;enumeration value="TC05"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_Contenedor", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CContenedor {

    @XmlEnumValue("TC01")
    TC_01("TC01"),
    @XmlEnumValue("TC02")
    TC_02("TC02"),
    @XmlEnumValue("TC03")
    TC_03("TC03"),
    @XmlEnumValue("TC04")
    TC_04("TC04"),
    @XmlEnumValue("TC05")
    TC_05("TC05");
    private final String value;

    CContenedor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CContenedor fromValue(String v) {
        for (CContenedor c: CContenedor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
