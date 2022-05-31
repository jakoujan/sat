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
 * <p>Clase Java para c_INCOTERM.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="c_INCOTERM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;whiteSpace value="collapse"/&gt;
 *     &lt;enumeration value="CFR"/&gt;
 *     &lt;enumeration value="CIF"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="CIP"/&gt;
 *     &lt;enumeration value="DAF"/&gt;
 *     &lt;enumeration value="DAP"/&gt;
 *     &lt;enumeration value="DAT"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="DEQ"/&gt;
 *     &lt;enumeration value="DDU"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="EXW"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="DPU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "c_INCOTERM", namespace = "http://www.sat.gob.mx/sitio_internet/cfd/catalogos/ComExt")
@XmlEnum
public enum CINCOTERM {

    CFR,
    CIF,
    CPT,
    CIP,
    DAF,
    DAP,
    DAT,
    DES,
    DEQ,
    DDU,
    DDP,
    EXW,
    FCA,
    FAS,
    FOB,
    DPU;

    public String value() {
        return name();
    }

    public static CINCOTERM fromValue(String v) {
        return valueOf(v);
    }

}
