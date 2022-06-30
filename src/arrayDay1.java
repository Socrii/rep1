public class arrayDay1
{
    
            public static void main(String[] args) {
                int arr[]={3,9,7,8,12,6,15,5,4,10};
                int max= arr[0];
                for(int i=1;i< 10;i++){
                    if(arr[i]>max){
                        max=arr[i];}
                }
                System.out.println(max);
            }
        }
