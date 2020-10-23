import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
//import java.util.Scanner;
import java.lang.StringBuilder;
//import java.util.ArrayList;
//import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//args.length
        Carte carte = new Carte("Fratii Kar","Dost",1880,1200);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.add(carte);
        biblioteca.add(new Carte("Procesul", "Kafka",1910,350));
        biblioteca.add(new Carte("Enders' Game","Orson",1952,330));

        biblioteca.sort();
        //System.out.println(biblioteca);

        Thread thr = new MyThread();
        //System.out.println(Thread.currentThread().getName());
        thr.setName("Bobita");
        thr.start();

        try {
            thr.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<20;i++)
        {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}}
        //Scanner keyboard = new Scanner(System.in);
        //System.out.println("Introduceti int, String & float");
        //int myint = keyboard.nextInt();
        //System.out.printf("int este: %d\n", myint);
        //String myString = keyboard.next(); //de ce nextLine nu merge???
        //float myFloat = keyboard.nextFloat();
        //System.out.println(myString);
        //System.out.println(myFloat);

        //File text = new File("C:\\Users\\TheNewBuzzKill\\IdeaProjects\\test2\\src\\test.txt");
        //Scanner fileReader = null;
        //try {
         //   fileReader = new Scanner(text);
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}
        //int[] valori = new int[10];
        //int i = 0;

        //while (fileReader.hasNextInt()) {
         //   valori[i] = fileReader.nextInt();

        //    System.out.println(valori[i]);
        //    i++;  //primitive nu se modif; trimit referinte in funct, se modif// ca in c cu ref si valoare
       // } //package = namespace
    //}
//}
            /*StringBuilder builder = new StringBuilder();
            HashMap<String, String> capitalCities = new HashMap<String, String>();
            ArrayList<String> cars = new ArrayList<String>();
            LinkedList<String> list = new LinkedList<String>();

            list.add("Razvan");
            list.add("Popescu");
            list.add("Maradona");


            list.addFirst("Primul");
            list.addLast("Ultimul");
            list.add(2, "al_treilea");

            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }


            cars.add("Volvo");
            cars.add("Audi");
            System.out.println(cars);
            cars.remove("Volvo");
            System.out.println(cars);

            capitalCities.put("England", "London");
            capitalCities.put("Spain", "Madrid");

            System.out.println(capitalCities);

            System.out.println("enter an integer");

//        int[] myint = new int[5];
//        for(int i=0;i<5;i++)
//        {
//            myint[i] = keyboard.nextInt();
//            builder.append("abc  ");
//        }
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(myint[i]);
//        }

            String result = builder.toString();
            System.out.println(result);*/
        //}
    //}
//}

