package com.corenetworks.modelo.presentacion;

import java.time.*;

public class fechas {
    public static void main(String[] args) {
        //1
        LocalDate inicioCurso = LocalDate.of(2023, 10, 9);
        System.out.println(inicioCurso);

        //2
        LocalDate finCurso = LocalDate.of(2024, Month.MARCH, 22);

        //3
        LocalDate InicioCursoMasCincoSemanas = inicioCurso.plusWeeks(5);


        //4
        System.out.println(finCurso.minusDays(80));

        //5
        LocalDate dia100DelAnio = LocalDate.ofYearDay(2023, 100);
        System.out.println("Dia  100 de este anio -> " + dia100DelAnio);

        //7
        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        //8
        LocalTime hora2 = LocalTime.parse("15:00:00.101");

        System.out.println(hora2);


        //9
        hora2 = hora2.plusHours(5);
        System.out.println(hora2);

        //10
        LocalDate fechaEnOchoSemanas = LocalDate.now().plusWeeks(8);

        //11
        LocalDate hace8Semanas = LocalDate.now().minusWeeks(8);

        //12

        LocalDateTime inicioCursoConAjuste = LocalDateTime.of(inicioCurso, hora2)
                .plusDays(3)
                .minusHours(2);
        //13
        LocalTime horaSalida = LocalTime.parse("20:00");
        if (LocalTime.now().isBefore(horaSalida)) {
            System.out.println("Es antes");
        } else {
            System.out.println("Es despues");
        }


        // 14Calcular los años trabajados en una empresa del un empleado que inició a trabajar el 6 de Julio de 2012
        LocalDate fechaInicioTrabajo = LocalDate.of(2012, 7, 6);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaInicioTrabajo, fechaActual);
        int añosTrabajados = periodo.getYears();
        System.out.println("El empleado ha trabajado " + añosTrabajados + " años");
        //Calcular la edad de una persona que nació el 7 de Agosto de 2007

        LocalDate fechaNacimiento = LocalDate.of(2007, 8, 7);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println("Edas es ->" + edad);
        // Se tiene una fecha de fabricación y una fecha de expiración calcular el periodo en el que se puede consumir ese producto
        LocalDate a = LocalDate.of(2023, 5, 2);
        LocalDate b = LocalDate.of(2025, 4, 2);
        Period ayb = Period.between(a, b);
        System.out.println(ayb);


        //Declarar la fecha de Navidad y declarar la fecha de Noche Vieja
        LocalDate navidad = LocalDate.of(2023, 12, 25);
        LocalDate nocheVieja = LocalDate.of(2023, 12, 31);
        System.out.println("fecha de navidad es-> " + navidad);
        System.out.println("fecha de noche vieja es ->" + nocheVieja);
        System.out.println(navidad.isBefore(nocheVieja));
        System.out.println(nocheVieja.isAfter(navidad));





    }
}
