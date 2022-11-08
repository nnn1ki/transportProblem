import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int choice = 0;

        System.out.println("1 - решить данную задачу" + '\n' + "2 - решить собственную задачу");

        Scanner userChoice = new Scanner(System.in);
        choice = userChoice.nextInt();

        switch (choice){
            case 1:
                baseExample();
            case 2:
                userExample();
        }

    }


    public static void baseExample(){
        //тут нам нужно вызвать конструктор с базовым заданием
        Matrix example = new Matrix();

        example.Calculate(); //она должна вывести итоговою матрицу

    }


    public static  void userExample(){
        int placeFrom = 0; //количество строк
        int placeTo = 0; // количество столбцов

        System.out.println("Введите количество пунктов отправления: ");
        Scanner from = new Scanner(System.in);
        placeFrom = from.nextInt();

        System.out.println("Введите количество пунктов назначения: ");
        Scanner to = new Scanner(System.in);
        placeTo = to.nextInt();
    }
}
