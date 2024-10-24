package com.openpipe;

import hudson.Extension;
import hudson.model.RootAction;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * OpenPipePlugin es un plugin para Jenkins que permite escanear librerias
 * obsoletas, para esta primera version sera solo para el lenguaje de python, de
 * poder colocar la url de su repositorio, tambien esta plugin podra generar un
 * archivo Jenkinsfiel, si lo requiere el usuario, tendra progresbar para ver el
 * proceso de escaneo, al terminar se mostrara el reporte de las librerias
 * obsolteas y las lebrerias actuales Autor: Erwin Romeo Tiul Teni
 */
@Extension
public class OpenPipePlugin implements RootAction {
    private static final Log LOGGER = LogFactory.getLog(OpenPipePlugin.class);

    //Metodo que devuelve el icono del plugin
    @Override
    public String getIconFileName() {
        LOGGER.info("Cargando el icon del plugin");
        return "./main/resources/images/icono.png"; // Asegurate de tener el icono en esta ruta
    }

    @Override
    public String getDisplayName() {
        LOGGER.info("Se está mostrando el nombre del plugin en la UI de Jenkins.");
        return "OpenPipe"; // Nombre que se mostrara en la UI de Jenkins
    }

    @Override
    public String getUrlName() {
        LOGGER.info("Accediendo a la URL del plugin.");
        return "/openpipe"; // URL para acceder al plugin

    }

    /*
     *
     * Escanea las dependencias del proyecto para identificar bibliotecas obsoletas.
     * Este metodo implementara la logica necesaria para realizar el escaneo.
     * @return void
     */
    public void scanDependencies() {
        LOGGER.info("Iniciando el escaneo de dependencias...");
     }
}
