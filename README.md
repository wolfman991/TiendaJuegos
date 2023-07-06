# TiendaJuegos

Proyecto que busca hacer una simulación básica para la administración de una tienda de videojuegos, actualmente solo está implementada la lógica de inventario, no se ha implementado una interacción con el usuario.

Para el testeo unitario se usó la herramienta JUnit, se hizo uso de Eclipse IDE junto a Maven para administrar el proyecto.

## Requerimientos:

-Que un usuario pueda comprar un juego con el nombre (en este caso id), y la cantidad que desea comprar.

-Que un vendendor pueda comprar más juegos, y luego venderlos.

-Ser capaz de que a medida que se realicen compras y ventas se vaya actualizando el inventario.

-Ser capaz de generar un reporte para la tienda, el cual incluya n° total de compras y ventas, y la ganancia de la tienda.

## Testeo:

-Los métodos para la compra y venta de videojuegos con la respectiva actualización de inventario, tanto por parte de los usuarios y vendedores.

-Verificar que si un cliente quiere comprar más juegos de los que quedan en stock, no podrá.

-Añadir los juegos al inventario, en donde se cuenta el número de juegos para revisar que no hubo problemas.

-En el inventario obtener los reportes de la tienda, es decir, n° compras que realizó la tienda, n° de ventas, y por último las ganancias totales.


## Uso

-Tener instalado Eclipse IDE junto a Maven

-Abrir el proyecto en Eclipse IDE

-Ejectutar cada grupo de pruebas, son InventarioTest.java y JuegoTest.Java


