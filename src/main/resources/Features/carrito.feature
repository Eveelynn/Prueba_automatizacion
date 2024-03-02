Feature: OpenCart Abstracta
  Como cliente de OpenCart quiero agregar al carrito de compras un iphone

  Scenario: agregar un iphone al carrito de compras

    Given realizar la busqueda del iPhone
    When escribir la palabra iPhone en el buscador
    When seleccionar boton buscar
    When seleccionar la primera opcion
    When agregar el producto al carrito de compras
    When ver carrito de compras
    Then validar que el iPhone seleccionado se encuentre en el carrito de compras


    Given seleccionar boton Remove para quitar iPhone del carrito de compras
    Then validar que el iPhone ya no se encuentre en el carrito de compras

