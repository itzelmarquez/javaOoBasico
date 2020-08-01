package com.testAutomationCoach.amazon;

public class HomePage {
    Imagen logoAmazon;
    TextField campoBusqueda;
    Button lupitaBusquda;
    Link devolucionesPedidos;
    Imagen[] articuloSugerido;

    public void buscarProducto(String nombreProducto) {
        campoBusqueda.ingresarTexto(nombreProducto);
        lupitaBusquda.click();

    }

    public void clickDevoluciones() {
        devolucionesPedidos.click();

    }

    public void seleccionarArticulo(String nombreArticulo) {
        //buscar en todas las imagenes, una que tenga tooltip igual al nombreArticulo
    }

}
