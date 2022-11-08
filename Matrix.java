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

    }




}
