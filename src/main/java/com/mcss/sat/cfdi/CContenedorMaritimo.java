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
 * <p>Clase Java para c_ContenedorMaritimo.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_ContenedorMaritimo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="CM001"/&gt;
 *     &lt;enumeration value="CM002"/&gt;
 *     &lt;enumeration value="CM003"/&gt;
 *     &lt;enumeration value="CM004"/&gt;
 *     &lt;enumeration value="CM005"/&gt;
 *     &lt;enumeration value="CM006"/&gt;
 *     &lt;enumeration value="CM007"/&gt;
 *     &lt;enumeration value="CM008"/&gt;
 *     &lt;enumeration value="CM009"/&gt;
 *     &lt;enumeration value="CM010"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_ContenedorMaritimo", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CContenedorMaritimo {

    @XmlEnumValue("CM001")
    CM_001("CM001"),
    @XmlEnumValue("CM002")
    CM_002("CM002"),
    @XmlEnumValue("CM003")
    CM_003("CM003"),
    @XmlEnumValue("CM004")
    CM_004("CM004"),
    @XmlEnumValue("CM005")
    CM_005("CM005"),
    @XmlEnumValue("CM006")
    CM_006("CM006"),
    @XmlEnumValue("CM007")
    CM_007("CM007"),
    @XmlEnumValue("CM008")
    CM_008("CM008"),
    @XmlEnumValue("CM009")
    CM_009("CM009"),
    @XmlEnumValue("CM010")
    CM_010("CM010");
    private final String value;

    CContenedorMaritimo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CContenedorMaritimo fromValue(String v) {
        for (CContenedorMaritimo c: CContenedorMaritimo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
