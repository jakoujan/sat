//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.30 a las 07:05:33 PM CDT 
//


package com.mcss.sat.cfdi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para c_ClaveTipoCarga.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_ClaveTipoCarga"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="CGS"/&gt;
 *     &lt;enumeration value="CGC"/&gt;
 *     &lt;enumeration value="GMN"/&gt;
 *     &lt;enumeration value="GAG"/&gt;
 *     &lt;enumeration value="OFL"/&gt;
 *     &lt;enumeration value="PYD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_ClaveTipoCarga", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/CartaPorte")
@XmlEnum
public enum CClaveTipoCarga {

    CGS,
    CGC,
    GMN,
    GAG,
    OFL,
    PYD;

    public String value() {
        return name();
    }

    public static CClaveTipoCarga fromValue(String v) {
        return valueOf(v);
    }

}
