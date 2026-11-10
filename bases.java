/*
 * Para declarar clases usamos:
 * palabra clave "class"
 * nombre de la clase
 * seguido de las llaves 
 * Todo el codigo va entre las llaves
 */


class bases{
    /*
     * Tipos de datos:
     * int -> numeros enteros (1, 10, 100, -20)
     * double -> numeros decimales (0.5, 0.950, 2.5, -3.5, 2.0)
     * boolean -> valores verdadero y falso
     * string -> cadenas de texto ("HOLA", "adios", "123", "2.0")  "123" + 4 = "1234"
     * char -> un solo caracter ('a', '2', 'C', '.', '?', '-')
     * Objeto -> variables que tienen variables diferentes adentro
     * 
     * Arreglos -> conjuntos de datos del mismo tipo
     *      nums = [1, 2, 3, 4, 5] siempre almacenan el mismo tipo de dato
     *      indices -> empiezan desde 0 y terminan en n - 1
     * 
     *      [1, 2, 3, 4, 5] = tenemos 5 valores
     *       0  1  2  3  4   
     */

    // Representan algo de una persona
    // Son variables definidas o inicializadas
    int edad = 15;
    double altura = 1.5;
    boolean estaDespierto = true;
    String nombre = "15";
    char letra = 'A';

    int edad1 = 18;
    double altura1;
    boolean estaDespierto1;
    String nombre1;
    char letra1;

    // Requisitos para declarar variables
    // 1 - No pueden declararse dos variables con el mismo nombre
    // 2 - Los nombres son sencibles a mayusculas y minusculas (nombre != NOMBRE)
    // 3 - Los nombres de las variables no pueden iniciar con numeros (1nombre X; nombre1 )

    // Estructura para declarar las variables
    /*
     *    Variable con un valor iniciado
     *    {tipo de dato} {nombre de la variable} = {valor};
     *    Variable sin un valor iniciado
     *    {tipo de dato} {nombre de la variable};
     */

    /*
     * OPERADORES ARITMETICOS
     *  + suma
     * - resta
     * * multiplicacion
     * / division
     * % modulo (el residuo de una division)
     */
    /* 
     * OPERADORES DE COMPARACION
     * < MENOR QUE
     * > MAYOR QUE
     * >= MAYOR IGUAL QUE
     * <= MENOR IGUAL QUE
     * != DISTINTO QUE (DIFERENTE QUE)
     * == IGUAL QUE (DOBLE SIGNO DE IGUAL)
     * 
     * = ES UNA ASIGNACION
     */

    // forma mas basica del if

    //  15      18
     if(edad != edad1 /* VERDADERO */){
        System.out.println("QUE LAS EDADES SON DIFERENTES");
     }else{
        System.out.println("LAS EDADES SON IGUALES");
     }

     /*
      * if(condicion){
      *  // Codigo que se desea ejecutar con condicion verdadera
      * }else{
      *  // Codigo que se desea ejecutar con condicion falsa
      * }
      */

    // if con varias condiciones
    // 23 verdadera
    if(edad > 20){
        System.out.println("Es mayor 20 de edad");
    }else if(edad > 18){
        System.out.println("Es mayor de edad");
    }else if(){
        System.out.println("La edad es justo 18");
    }
    if(edad > 18){
        System.out.println("Es mayor de edad");
    }else{
        System.out.prinln("NO es mayor de edad");
    }

    if(edad > 20){
        System.out.println("Es mayor de 20");
    }

    // funciones o metodos
    void decirHola(String nombre){
        System.out.println("Hola " + nombre);
    }

    decirHola("Pedro"); // Hola Pedro
    decirHola("Jose"); // Hola Jose

    /*
     * Estructura para declarar metodos o funciones
     * {valor que retorna} {nombre de la funcion}({parametros (opcionales)}){
     *      // Codigo que ejecuta
     * }
     * 
     * System.out.println("");
     * 
     * 
     */
     
}