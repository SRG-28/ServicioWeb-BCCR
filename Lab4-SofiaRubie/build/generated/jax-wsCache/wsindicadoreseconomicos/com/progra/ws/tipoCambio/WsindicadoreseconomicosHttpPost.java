
package com.progra.ws.tipoCambio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "wsindicadoreseconomicosHttpPost", targetNamespace = "http://ws.sdde.bccr.fi.cr")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsindicadoreseconomicosHttpPost {


    /**
     * Obtiene los valores del indicador económico deseado (DataSet) para un rango de fecha determinado con formato dd/mm/yyyy (día/mes/año). Parámetros de entrada: Indicador de tipo numérico entero positivo, Fecha de inicio de tipo string , Fecha final de tipo string, Nombre de la persona que utiliza el servicio, SubNiveles (S = Si o N = No) para indicar si desea o no obtener los subniveles del indicador a consultar, correo electrónico y token de suscripción. Retorna un DataSet con los siguientes campos: Código de la variable tipo string, fecha tipo date y el valor tipo numeric. TODOS los campos son obligatorios, de no ingresar alguno de los parámetros el valor de retorno del servicio será Nothing. 
     * 
     * @param indicador
     * @param fechaInicio
     * @param fechaFinal
     * @param subNiveles
     * @param nombre
     * @param correoElectronico
     * @param token
     * @return
     *     returns com.progra.ws.tipoCambio.DataSet
     */
    @WebMethod(operationName = "ObtenerIndicadoresEconomicos")
    @WebResult(name = "DataSet", targetNamespace = "http://ws.sdde.bccr.fi.cr", partName = "Body")
    public DataSet obtenerIndicadoresEconomicos(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Indicador")
        String indicador,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "FechaInicio")
        String fechaInicio,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "FechaFinal")
        String fechaFinal,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Nombre")
        String nombre,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "SubNiveles")
        String subNiveles,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CorreoElectronico")
        String correoElectronico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Token")
        String token);

    /**
     * Obtiene los valores del indicador económico deseado (XML) para un rango de fecha determinado con formato dd/mm/yyyy (día/mes/año). Parámetros de entrada: Indicador de tipo numérico entero positivo, Fecha de inicio de tipo string , Fecha final de tipo string, Nombre de la persona que utiliza el servicio, SubNiveles (S = Si o N = No) para indicar si desea o no obtener los subniveles del indicador a consultar, correo electrónico y token de suscripción. Retorna un XML con los siguientes campos: Código de la variable tipo string, fecha tipo date y el valor tipo numeric. TODOS los campos son obligatorios, de no ingresar alguno de los parámetros el valor de retorno del servicio será Nothing. 
     * 
     * @param indicador
     * @param fechaInicio
     * @param fechaFinal
     * @param subNiveles
     * @param nombre
     * @param correoElectronico
     * @param token
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ObtenerIndicadoresEconomicosXML")
    @WebResult(name = "string", targetNamespace = "http://ws.sdde.bccr.fi.cr", partName = "Body")
    public String obtenerIndicadoresEconomicosXML(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Indicador")
        String indicador,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "FechaInicio")
        String fechaInicio,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "FechaFinal")
        String fechaFinal,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Nombre")
        String nombre,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "SubNiveles")
        String subNiveles,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "CorreoElectronico")
        String correoElectronico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Token")
        String token);

}
