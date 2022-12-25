package Interface_giaodien;

public class sapxepchon implements  sapxep {
    // thực thi interface sắp xếp cho lơp côn sapxepchen


    @Override
    public void sapxeptang(double [] arr){
        double temp = arr[0];
        int i,j;
        for( i =0; i<arr.length-1;i++){
            for(j=i+1; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    @Override
    public void sapxepgiam(double [] arr){
        double temp = arr[0];
        int i,j;
        for( i =0; i<arr.length-1;i++){
            for(j=i+1; j<arr.length;j++){
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
