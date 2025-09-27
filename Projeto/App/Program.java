package App;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import Entities.*;

public class Program {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Lesson> lessons = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso: ");
        int x = input.nextInt();
        int duration = 0;
        input.nextLine();

        for (int i = 0; i<x;i++){
            System.out.printf("Dados da %dº aula: %n", i+1);
            System.out.print("Conteúdo ou tarefa (c/t): ");
            char c = input.next().toLowerCase().charAt(0);
            while(c!='c' && c!='t'){
                System.out.print("Tipo de aula inválido. Digite novamente (c/t): ");
                c = input.next().toLowerCase().charAt(0);
            }
            input.nextLine();
            System.out.print("Titulo: ");
            String title = input.nextLine();
            if (c=='c'){
                System.out.print("Url do video: ");
                String url = input.nextLine();
                System.out.print("Duração em segundos: ");
                int seconds = input.nextInt();
                lessons.add(new Video(title, url, seconds));
            }
            else {
                System.out.print("Descrição: ");
                String description = input.nextLine();
                System.out.print("Quantidade de questões: ");
                int questions = input.nextInt();
                lessons.add(new Task(title,description, questions));
            }
            input.nextLine();
        }

        for (Lesson l : lessons){
            duration+=l.duration();
        }

        System.out.print("Duração total do curso: " + duration);


    }
}
