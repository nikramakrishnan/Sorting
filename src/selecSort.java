import java.util.Scanner;


public class selecSort {
	public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[]){  
    	Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements to sort:");
		int n = s.nextInt();
		System.out.println("Please input "+n+" numbers");
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter number  "+(i+1)+": ");
			int ntemp = s.nextInt();
			arr1[i] = ntemp;
		}  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}
