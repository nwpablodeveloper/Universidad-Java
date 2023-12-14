## SECCIÓN 07
### [Ciclos en Java](./06-01-CicloWhile-CFJ.pdf)

### [1. Ciclo While](./V01_EjercicioCicloWhile.java)
El ciclo While se ejecuta mientras se cumpla la condición
```java
        var contador = 0;
        
        while( contador < 3 ){
        
            System.out.println("contador = " + contador);
            contador++;
            
        }
```

### [2. Ciclo Do While](./V02_CicloDoWhile.java)
El ciclo Do While se ejecuta como minimo 1 vez y luego ejecuta la condición
```java
        var contador = 0;
        
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while( contador < 3 );
```

### [3. Ciclo For ](./V03_CicloFor.java)
El ciclo for esta compuesto en 3 partes
```java
        for( var i = 0; i < 3; i++ ){
            System.out.println("i = " + i);
        }
```

### [4. Break y Continue](./V04_PalabrasBreakAndContinue.java)
* El BREAK se usa para dar por finalizado el ciclo y salirse del bucle.
* El CONTINUE da por finalizada la vuelta actual del bucle y continua el bucle 
mientras se cumpla la condición.

### [5. Uso de etiquetas](./V05_UsoDeEtiquetas.java)
