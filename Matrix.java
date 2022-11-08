public class Matrix {

    private int from;
    private int to;
    private int[][] values;
    private int[] store; // склад-поставщтк
    private int[] order; // заказы-потредитель


    //коструктор, для пользователя
    public Matrix(int[][] userMatrix, int a, int b){
        from = a;
        to = b;
        values = new int[from][to];
    }

    /*
    *   b1  b2 b3 b4
    * a1  8 14  2 10
    * a2  8 24 20 30
    * a3 16  6 10 20
    * */


    public Matrix(){ //базовая матрица, как в варианте
        int[][] matr =  {{8, 8, 16}, {14, 24, 6}, {2, 20, 10}, {10, 30, 20}}; //написаниы столбцы
        int[] store = {16, 159, 50}; //a
        int[] order = {70, 20, 40, 30}; //b

    }


    public void showMatr(){

        for(int i = 0; i < order.length; i++){
//            System.out.print(order[i]);

            for(int j = 0; j < store.length; j++){
                System.out.print(values[i][j]); //выводим значения



            }

        }
    }

    //основная функция, где храниться основной алгортм
    public void Calculate(){

        if(isOpenOrClose()){
            //задача закрыта

        }
        else{
            //задача открыта, ее нужно зактрыть
            //добавим фиктивного потредителя\отправителя


        }

    }


    public boolean isOpenOrClose(){
        int totalInStore = 0;
        int totalInOrder = 0;

        for (int s : store) {
            totalInOrder+= s;
        }

        for (int o: order) {
            totalInOrder+= o;
        }

        if (totalInOrder == totalInStore) return true;
        else{
            closeExample(totalInOrder - totalInStore);
            return false;
        }
    }

    public void closeExample(int difference){
        //difference = Math.abs(difference);

        if (difference > 0){ //значит заказов больше, нужно добавить мнимого поставщика с этой разницей
            //нужно изменить значения, а так же поставщиков
        }
        if(difference < 0 ){ //значит потребителей больше, нужно добавть мнимого потредителя с модулем этой разницы
            //нужно изменить значения массивов поставщиков-складов

        }


        System.out.print("Так выглядит таблица после ее закрытия");
        showMatr();
    }

    public void change(){ //как реализовать добавление нужного ряда?

    }



}
