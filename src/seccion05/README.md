## SECCIÓN 05
### Operadores en Java
#### [Operadores](./Operadores.pdf)
#### [Prioridad en los operadores en su ejecución](./operadores-prioridad.png)


### [1. Operadores Artimeticos ](./V01_OperadoresAritmeticosEnJava.java)
* Operador de asignación
* Operador de suma
* Operador de resta
* Operador de multiplicación
* Operador de divisiòn
* Operador del resto de una divisiòn
* Ejercicio saber si un numero es par

### [2. Operadores de Asignaciòn](./V02_OperadoresDeAsignacionEnJava.java)
El operador de asignación va a evaluar
todo lo que esta a la derehca ( = ) y se lo va 
a asignar a la variable que este a la izquierda
* =
#### [Operadores de Asignaciòn pero de composición](./V02_OperadoresDeAsignacionEnJava.java)
* +=
* -=
* *=
* /=
* %=

### [3. Operadores Unarios](./V03_OperadoresUnarios.java)
* Operador para cambiar el signo
* Operador de negación
* Operador de incremento o decremento
* Operador de incremento o decremento
* Operador de postincremento
* Operador de preincremento
* Operador de postdecremento
* Operador de predecremento

### [4. Operadores de asignaciòn relacionales](./V04_OperadoresDeAsignacionRelacionales.java)
* Operador de igualdad
* Operador de desigualdad

### [5. Operadores relacionales](./V05_OperadoresRelacionales.java)
* Operador Mayor
* Operador Menor

### [6. Operadores Condicionales](./V06_OperadoresCondicionalesJava.java)
* Operador && ( AND )
* Operador \|\| ( OR )

### [7. Operadores Ternarios](./V07_OperadorTernarioJava.java)
```java
    var resultado = ( 3 > 2 ) ? "Es mayor"
                    : ( 3 == 2 ) ? "Es igual"
                    : "Es menor;
```

### [8. Precedencia Operadores](./V08_PrecedenciaOperadoresJava.java)
```java
    var z = 4 + 5 * 7 / 3;
    // se van a ejecutar primero las multiplicaciones y divisiones
    
    var z = ( 4 + 5 ) * 7 / 3;
    // Primero se van a ejecutar los parentesis
```

### [9. Tarea rectángulo](./V09_TareaRectangulo.java)
* Calcular el área y el perimetro de un rectangulo con los datos obtenidos
por el usuario