
package com.progra.ws.tipoCambio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Indicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FechaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SubNiveles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indicador",
    "fechaInicio",
    "fechaFinal",
    "nombre",
    "subNiveles",
    "correoElectronico",
    "token"
})
@XmlRootElement(name = "ObtenerIndicadoresEconomicosXML")
public class ObtenerIndicadoresEconomicosXML {

    @XmlElement(name = "Indicador")
    protected String indicador;
    @XmlElement(name = "FechaInicio")
    protected String fechaInicio;
    @XmlElement(name = "FechaFinal")
    protected String fechaFinal;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "SubNiveles")
    protected String subNiveles;
    @XmlElement(name = "CorreoElectronico")
    protected String correoElectronico;
    @XmlElement(name = "Token")
    protected String token;

    /**
     * Obtiene el valor de la propiedad indicador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * Define el valor de la propiedad indicador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicador(String value) {
        this.indicador = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicio(String value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Define el valor de la propiedad fechaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaFinal(String value) {
        this.fechaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad subNiveles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubNiveles() {
        return subNiveles;
    }

    /**
     * Define el valor de la propiedad subNiveles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubNiveles(String value) {
        this.subNiveles = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Define el valor de la propiedad correoElectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
