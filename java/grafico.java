public class grafico {

    public static void barras (int [] v) {
        for (int i=0; i < v.length; i++) {
            for (int j=0;j<v[i]; j++){

                 System.out.print('\u2588');
            }
            
            System.out.println();
        }
    }

    public static void main(String args []){
int [] a = {3,4,2,1};
int [] b = {9,4,7};
barras (a);

       
        System.out.println();
        
        barras(b);
    }
}

    