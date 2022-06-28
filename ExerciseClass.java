package deneme;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//kullanıcıdan alınan sayı kadar dizi elemanı olsun rastgele 1-10 arasındaki bu
//sayıları bir diziye atayalım
//sonra bu diziyi başka bir diziye clone edelim.
//clonelanmış bu dizi bu sayıları küçükten büyüğe doğru sıralayın
//(Arrays.sort())
//en küçük sayıyı ve en büyük sayıyı bulalım ? ( diziyele yapalım)
//bu sayıların toplamını ?
//bu sayıların ortalaması ?

//bu dizideki elemanlardan tek sayılardan kaç tane ve tek sayı toplamları (tek
//sayı dizisi)
//bu dizideki elemanlardan çift sayılardan kaç tane ve çift sayı toplamları
//(çift sayı dizisi)
//dizilerde en büyük ile 25 karşılatıralım dizideki eleman 25 büyük mü
//dizideki elemanlardan 5 sayısı var mı ? (java.util.Arrays.binarySearch())
//dizideki tekrar eden sayıları bir dizide göstrerelim ?
//dizideki tekrar eden sayılar yerine 1 kere tekrar sayı göstersin (tekrarsız
//dizi elemanları)

public class ExerciseClass {

	public static int[] randomArray(int[] arr) {
		
			for (int i = 0; i <arr.length ; i++) {
		    	Random rd = new Random();
		    	int number = rd.nextInt(10) + 1;
				arr[i] = number;
			}
			System.out.print("array: ");
		for(int temp : arr) {
			System.out.print(temp + " ");
		}
		
		return arr;
	}
	
	public static void cloneArray(int[] arr) {
			
		int[] clone = arr;
		System.out.print("\ncloned array: ");
		for (int temp : clone) {
			System.out.print(temp + " ");
		}
	}
	
	public static void bk(int[] arr) {
		Arrays.sort(arr);
		System.out.print(" \nsorted array: " );
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	public static void GetMin(int[] arr) {
		
		int minValue = arr[0];
		for(int i = 1;i <arr.length; i++) {
			if(arr[i] < minValue) {
				minValue = arr[i];
				}
			}System.out.println("\nmin. value is: " + minValue);
		
	}
public static void GetMax(int[] arr) {
		
		int maxValue = arr[0];
		for(int i = 1;i <arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
			}
		System.out.println("max. value is: " + maxValue);
		
		
	}
public static void Sum(int[] arr) {
	int sum = 0;
	for(int i=0; i<arr.length; i++){
        sum = sum + arr[i];
     }
	System.out.println("sum : " + sum);
}
public static void Ave(int[] arr) {
	int ave = 0;
	int sum =0;
	Arrays.sort(arr);
	
	for(int num : arr) {
		sum += num;	
	}
	ave = sum / arr.length;
	System.out.println("Average value is: " + ave);
}
	
public static void OddEvenValues(int[] arr) {
	
	int oddSum = 0;
	int evenSum = 0;
	
	System.out.print("even numbers: " );
	for(int i = 0;i<arr.length; i++) {
		if(arr[i]%2!=0) {
			System.out.print(arr[i] + " ");
		}
	}
	System.out.print("\nodd numbers: ");
	for(int i = 0;i<arr.length; i++) {
		if(arr[i]%2==0) {
			System.out.print( arr[i] + " ");
		}
	}
	System.out.println();
	for(int temp : arr) {
		if(temp%2!=0) {
		evenSum += temp;
	}
	}
	System.out.println("Sum of Even Numbers: " + evenSum);
	
	for(int temp : arr) {
		if(temp%2==0) {
		evenSum += temp;
	}
	}
	System.out.println("Sum of Odd Numbers: " + oddSum);
}

public static void Compare(int[] arr) {
	int maxValue = arr[0];
	for(int i = 1;i <arr.length; i++) {
		if(arr[i] > maxValue) {
			maxValue = arr[i];
		}
		}
	if(maxValue > 25) {
		System.out.println("max value is greater than 25");
		
	}else {
		System.out.println("max value is not greater than 25");
	}
	
}


public static void Find5(int[] arr) {
	int number = 5;
	Arrays.sort(arr);
	int result = Arrays.binarySearch(arr, number);
	if (result > 0) {
		System.out.println(number + " vardır. " + result + ". indistedir ");
	} else {
		System.out.println("5 yok ");
	}
}

public static void tekrarEdenSayilar(int[] arr) {
	System.out.print("repetitive numbers: ");
	for(int i = 0; i < arr.length; i++) {  
        for(int j = i + 1; j < arr.length; j++) {  
            if(arr[i] == arr[j])  
                System.out.print(arr[j] + " ");  
        }  
    }  System.out.println();
}  


public static int removeDups(int[] arr, int n) {
	System.out.print("array without repetitive numbers: ");
	if (n == 0 || n == 1) {
		 return n;
    }

    // creating another array for only storing
    // the unique elements
    int[] temp = new int[n];
    int j = 0;

    for (int i = 0; i < n - 1; i++) {
        if (arr[i] != arr[i + 1]) {
            temp[j++] = arr[i];
        }
    }

    temp[j++] = arr[n - 1];

    // Changing the original array
    for (int i = 0; i < j; i++) {
        arr[i] = temp[i];
    }
    return j;
    
    
    
}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter number: ");
		int range = input.nextInt();
	    int[] arr = new int[range];
		
		
		randomArray(arr);
		cloneArray(arr);
		bk(arr);
		GetMin(arr);
		GetMax(arr);
		Sum(arr);
	    Ave(arr);
	    OddEvenValues(arr);
	    Compare(arr);
	    Find5(arr);
	    tekrarEdenSayilar(arr);
	    
	   int n = arr.length;
	   n = removeDups(arr, n);
	   for (int i = 0; i < n; i++) {
	   System.out.print(arr[i] + " ");
	}
	  
}   
	}
