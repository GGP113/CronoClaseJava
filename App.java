import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {


        String infProfesor="", nombreMateria="", momento1="", momento2="", momento3="";
        String emailProfesor="", telefonoProfesor="";

        int  plazoTres=0;
        String diaMateria="", jornadaMateria="";
        
        int diaFechaUno=0, diaFechaDos=0, diaFechaTres=0, mesFechaUno=0, mesFechaDos=0, mesFechaTres=0;
        int diaFechaUnoE=0, diaFechaDosE=0, diaFechaTresE=0, mesFechaUnoE=0, mesFechaDosE=0, mesFechaTresE=0;
        int difM1d=0, difM2d=0, difM3d=0, plazoDos=0;
        int difM1m=0, difM2m=0, difM3m=0, plazoUno=0;

        int perfil;
        Scanner sc = new Scanner(System.in);

        System.out.println(" \nIngrese 1 ó 2 de acuerdo con su perfil: \n \t1)Profesor \n \t2)Estudiante");

        perfil = sc.nextInt();
        sc.nextLine();
        
        switch (perfil) {
            case 1:

            System.out.println("\nINGRESO INFORMACIÓN PERSONAL");

            System.out.println("\nIngrese su nombre completo");
            infProfesor=sc.nextLine();

            System.out.println("\nIngrese su email");
            emailProfesor=sc.nextLine();

            System.out.println("\nIngrese su telefono");
            telefonoProfesor=sc.nextLine();

            System.out.println("\nINGRESO INFORMACIÓN MATERIA");

            System.out.println("\nIndique el nombre de la materia: ");
            nombreMateria=sc.nextLine();

            System.out.println("\nIndique el dia en el que se dicta la materia");

            diaMateria=sc.nextLine();

            System.out.println("\nIndique  la jornada de la materia: diurna o nocturna");
            jornadaMateria=sc.nextLine();

            System.out.println("\nINGRESO DE ACTIVIDADES EVALUATIVAS: ");

            System.out.println("\nMOMENTO EVALUATIVO 1");

            System.out.println("\nIngrese el tipo de evaluación del momento 1: ");
            momento1=sc.nextLine();

            System.out.println("\nIngrese la fecha de entrega del momento 1:");
            System.out.println("\nIndique el dia de la evaluación (en número): ");

            diaFechaUno=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIndique el mes de la evaluacion (en número) : ");

            mesFechaUno=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIngrese el plazo para el desarrollo de la actividad en días : ");
            plazoUno=sc.nextInt();
            sc.nextLine();

            System.out.println("\nMOMENTO EVALUATIVO 2");


            System.out.println("\nIngrese el tipo de evaluación del momento 2: ");
            momento2=sc.nextLine();

            System.out.println("\nIngrese la fecha de entrega del momento 2:");
            System.out.println("\nIndique el dia de la evaluación (en número): ");

            diaFechaDos=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIndique el mes de la evaluacion (en número) : ");

            mesFechaDos=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIngrese el plazo para el desarrollo de la actividad en días : ");
            plazoDos=sc.nextInt();
            sc.nextLine();

            System.out.println("\nMOMENTO EVALUATIVO 3");

            System.out.println("\nIngrese el tipo de evaluación del momento 3: ");
            momento3=sc.nextLine();

            System.out.println("\nIngrese la fecha de entrega del momento 3:");
            System.out.println("\nIndique el dia de la evaluación (en número): ");

            diaFechaTres=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIndique el mes de la evaluacion (en número) : ");

            mesFechaTres=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIngrese el plazo para el desarrollo de la actividad en días : ");
            plazoTres=sc.nextInt();

                System.out.println("\n****Resumen de Informacion****:\n Información del profesor: \n nombre: " + infProfesor +"\n email: " + emailProfesor + "\n telefono: " + telefonoProfesor );
                sc.nextLine();
                System.out.println("\n****Informacion de la materia****:\n Nombre de la materia: " + nombreMateria + "\n Día de la materia: " + diaMateria + "\n Jornada: " + jornadaMateria);
                System.out.println("\n****Resumen de actividades y Fechas evaluativas****\n Tipo de evaluación del Momento 1: " + momento1 + "\nFecha de evaluacion: " + diaFechaUno + "/" + mesFechaUno + "/2025" + "\n Plazo para desarrollo: " + plazoUno);
                System.out.println("\n Momento 2 \n Tipo de evaluación del Momento 2: " + momento2 + "\n Fecha de evaluacion: " + diaFechaDos + "/" + mesFechaDos + "/2025" + "\n Plazo para desarrollo: " + plazoDos);
                System.out.println("\n Momento 1 \n Tipo de evaluación del Momento 3: " + momento3 + "\n Fecha de evaluacion: " + diaFechaTres + "/" + mesFechaTres + "/2025" + "\n Plazo para desarrollo: " + plazoTres);
                break;

            case 2:

            System.out.println("\nREGISTRO DE ENTREGA DE ACTIVIDADES");

            System.out.println("\nIngrese la fecha en la que entrega la evaluación del momento 1: ");
            System.out.println("\nIndique el dia  (en número) :");
            diaFechaUnoE=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIndique el mes (en número) :");
            mesFechaUnoE=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIngrese la fecha en la que entrega la evaluación del momento 2: ");
            System.out.println("\nIndique el dia  (en número) :");
            diaFechaDosE=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIndique el mes (en número) :");
            mesFechaDosE=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIngrese la fecha en la que entrega la evaluación del momento 3: ");
            System.out.println("\nIndique el dia  (en número) :");
            diaFechaTresE=sc.nextInt();
            sc.nextLine();

            System.out.println("\nIndique el mes (en número) :");
            mesFechaTresE=sc.nextInt();
            sc.nextLine();

            difM1d= diaFechaUnoE-diaFechaUno;
            difM2d= diaFechaDosE-diaFechaDos;
            difM3d= diaFechaTresE-diaFechaTres;


            difM1m=mesFechaUnoE-mesFechaUno;
            difM2m= mesFechaDosE-mesFechaDos;
            difM3m= mesFechaTresE-mesFechaTres;






            
            break;
    
            default:
                break;
        }



        

        




    }



}