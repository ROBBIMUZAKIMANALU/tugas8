
import java.util.Scanner;

public class tugas71 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan jumlah data ");
        int jumlahdata = scanner.nextInt();

        int [] data= new int [jumlahdata];

        for (int i = 0; i<jumlahdata; i++){
            System.out.print("masukan angka ke-"+i +":");
            data[i] =scanner.nextInt();
        }
        int genap =0;
        int ganjil =0;
        for(int i = 0; i< jumlahdata; i++){
            if (data[i]%2 ==0){
                System.out.println("genap");
            }else{
                System.out.println("ganjil");
            }
        }
        int total =0;
        for (int i =0; i<jumlahdata; i++){
            total = total+data[i];
        }
        System.out.println("total "+total);
        double rata = total/jumlahdata;
        System.out.println("rata-rata :"+rata);
    }
}
