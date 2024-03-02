package org.example.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.Pages.OpenCart;

public class StepDefinition_AgregarCompra {

    OpenCart openCart  = new OpenCart();


    @Given("realizar la busqueda del iPhone")
    public void realizarLaBusquedaDelIPhone() {
        openCart.realizarBusquedadelIphone();
    }

    @When("escribir la palabra iPhone en el buscador")
    public void escribirLaPalabraIPhoneEnElBuscador(){
        openCart.buscariPhone();
    }

    @When("seleccionar boton buscar")
    public void seleccionarBotonBuscar(){
        openCart.seleccionarBotonBuscar();
    }

    @When("seleccionar la primera opcion")
    public void seleccionarLaPrimeraOpcion(){
        openCart.seleccionarOpcion();
    }

    @When("agregar el producto al carrito de compras")
    public void agregarElProductoAlCarritoDeCompras() {
        openCart.agregarProductoAlCarrito();
    }

    @When("ver carrito de compras")
    public void verCarritoDeCompras(){
        openCart.verCarrito();
    }

    @Then("validar que el iPhone seleccionado se encuentre en el carrito de compras")
    public void validarQueElIPhoneSeleccionadoSeEncuentreEnElCarritoDeCompras()  {
        openCart.validarIphone();
    }


    @Given("seleccionar boton Remove para quitar iPhone del carrito de compras")
    public void seleccionarBotonRemoveParaQuitarIPhoneDelCarritoDeCompras() {
        openCart.removerIphone();
    }

    @Then("validar que el iPhone ya no se encuentre en el carrito de compras")
    public void validarQueElIPhoneYaNoSeEncuentreEnElCarritoDeCompras() {
        openCart.validarIphoneNoSeEncuentraEnCarrito();
    }

}
