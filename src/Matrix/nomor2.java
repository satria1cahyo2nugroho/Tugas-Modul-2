/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

/**
 *
 * @author User
 */
public class nomor2 {
     public static void main(String[] args) {
        int[][] N = {
            {4,5},
            {6,7},
            {8,9}
        };
        int [][] M = {
            {31,32},
            {33,34},
            {35,36}
        };
        int baris_x =N.length;
        int kolom_x =N[0].length;
        int [][] Hasil = new int [baris_x][kolom_x];
        for (int i=0; i<baris_x; i++){
            for (int j=0; j<kolom_x; j++){
                Hasil [i][j] = M[i][j] - N[i][j];
                System.out.print(Hasil[i][j]+ " ");
            }
            System.out.println("Satria Cahyo Nugroho");
        }        
     }
}