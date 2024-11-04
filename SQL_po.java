public class SQL_po{



    // nos sirve para introducir productos desde sql
//INSERT INTO productos (proveedor,precio,cantidad,descripcion)
   // VALUS('fernado',52.26,45,'gallina')





    //seleccionamos los registros que cumplan la condiccion de cantidad
    //SELECT*FROM productos WHERE cantidad >=10;





    //ordenamos por cantidad en forma ascendente
    //SELECT * FROM productos ORDER BY cantidad DESC;






    //busquedas
    //SELECT*FROM productos WHERE descripcion LIKE '%co%';






    /*la siguiente sentencia modifica el registo cuyo id es igual al 1*/
   // UPDATE productos SET descricion"azucár rubia",cantidad=100,proveedor="pomalca"WHERE id=1;






    /* Eliminar cuyo id es igual al número que quieres eliminar */
    //DELETE FROM productos WHERE id=8;



    /*esta sentencia SQL selecciona todos los registros de la tabla "productos" */
   // SELECT * FROM productos;

    /*filtros : */
    /* selecciona los registros  que cumplen  la condicion de la cantidad */
   //SELECT * FROM productos WHERE cantidad>=10;

    /*filtros : */
    /* selecciona los registros  que cumplen  la condicion de la cantidad */
   // SELECT * FROM productos WHERE proveedor="tottus";

    /*ordenamos por cantidad  en forma  ASCEBDENTE */
   // SELECT * FROM `productos`ORDER BY cantidad;

    /*ordenamos por cantidad  en forma  DESCENDENTE */
   // SELECT * FROM `productos`ORDER BY cantidad DESC;

//en la siguiente sentencia ordenamos por precio del prodcuto/
  //  SELECT * FROM `productos`ORDER BY precio;

//la siguiente sentencia ordena por descripción y es en orden alfabetico/
   // SELECT * FROM `productos`ORDER BY descricion;

//la siguiente sentencia busca productos  en cuya descripción se encuentra la silaba "co"/
   // SELECT * FROM productos
   // WHERE descricion LIKE '%CO%';

    /* busquedas*/
  //  SELECT * FROM productos
   // WHERE descricion like 'f%';

//la siguiente sentencia modifica  el registro cuyo id es 1/
  //  UPDATE productos SET descricion="azucar blanca x 50k",
           // cantidad=100, proveedor="pomalca - lima" WHERE id=1;

    /* esta instancia elimina el producto con id 4*/
    //DELETE FROM productos id =4;



























}
