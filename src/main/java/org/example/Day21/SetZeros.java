package org.example.Day21;

public class SetZeros {
    public static void main(String[] args) {
        int[][] arr={{1,3,1},{0,3,4},{8,9,0}};
        setZeros(arr);
    }
    static void setZeros(int[][] arr){
        // constant space
       int m= arr.length;//row
       int n= arr[0].length;// col
       boolean zeroRow=false;
       boolean zeroCol =false;
        for (int i = 0; i <m ; i++) {
            if(arr[i][0]==0){
                zeroRow=true;
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            if(arr[0][j]==0){
                zeroCol=true;
                break;
            }
        }

        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        for (int i = 1; i <m ; i++) {
            if(arr[i][0]==0 ){
                for (int j=1;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }
        for (int j = 1; j <n ; j++) {
            if(arr[0][j]==0){
                for (int i=1;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
        if(zeroRow){
            for (int i = 0; i < m; i++) {
                arr[i][0]=0;
            }
        }
        if(zeroCol){
            for (int j = 0; j < n; j++) {
                arr[0][j]=0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void setZeros2(int[][] arr){
        //m+n space approach
        int m= arr.length;
        int n=arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        /* setting the row and col false but row and col default false
        for (int i = 0; i <m ; i++) {
            row[i]=false;
        }
        for (int i = 0; i <n ; i++) {
            col[i]=false;
        }*/
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        //it is efficient method
        for (int i = 0; i < m; i++) {
            if(row[i]){
                for (int j = 0; j < n; j++) {
                    arr[i][j]=0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (col[i]) {
                for (int j = 0; j < m; j++) {
                    arr[j][i] = 0;
                }
            }
        }
        /*not efficient method
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                if(row[i] && col[j]){// no need to check if it is true than if loop pass
                    for (int k = 0; k <m ; k++) {
                        arr[k][j]=0;
                    }
                    for (int k = 0; k <n ; k++) {
                        arr[i][k]=0;
                    }
                }
            }
        }*/
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void setZeros1(int[][] arr){
        // it takes m*n space
        int m=arr.length;
        int n=arr[0].length;
        int[][] helper = new int[m][n];
        //copying the array into helper
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                helper[i][j]=arr[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(helper[i][j]==0){
                    for (int k = 0; k <m ; k++) {
                        arr[k][j]=0;
                    }
                    for (int k = 0; k < n; k++) {
                        arr[i][k]=0;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
