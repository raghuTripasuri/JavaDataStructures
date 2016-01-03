package exampleSortingAlgorithms;
/**
 * The objective of this class is to demonstrate some basic sorting algorithms.
 * @author raghunatht
 *
 */
import java.util.Random;
import java.lang.StringBuffer;

public class BasicSortingMethods {

	public BasicSortingMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicSortingMethods bs = new BasicSortingMethods();
		//Create an int data array
		Random rndVar = new Random(24);
		int[] data = new int[25];
		int[] originalData;
		
		System.out.println("Data Generation Starts here - ");
		
		for(int i=0; i<25; i++){
			data[i] = rndVar.nextInt(200);
		}
		originalData = data;
		System.out.println(bs.generatePrintString(data));
		data = bs.insertionSort(data);
		System.out.println(bs.generatePrintString(data));
		
		data = originalData;
		data = bs.selectionSort(data);
		System.out.println(bs.generatePrintString(data));
		
		data=originalData;
		data= bs.bubbleSort(data);
		System.out.println(bs.generatePrintString(data));
		
	}

	public String generatePrintString(int[] data) {
		StringBuffer str = new StringBuffer();
		str.append(" [ ");
		for(int i=0; i<data.length; i++){
			str.append(data[i]);
			str.append(" , ");
		}
		str.append(" ] ");
		return str.toString();
	}
	
	public int[] insertionSort(int[] data){
		System.out.println("InsertionSort Algorithm ...");
		for(int i = 1,j; i < data.length; i++){
			int tmp = data[i];
			for (j=i; j>0 && tmp <data[j-1]; j--){
				data[j] = data[j-1];
			}
			data[j] = tmp;
		}
		return data;
	}
	
	public int[] selectionSort(int[] data){
		System.out.println("Selection Sort Algorithm...");

		int leastElement, currElement, leastIndex;
		for (int i=0; i< data.length-1; i++){
			currElement = data[i];
			leastElement = data[i];
			leastIndex = i;
			for(int j= i+1; j<data.length; j++){
				if(data[j] < leastElement ){
					leastElement = data[j];
					leastIndex = j;
				}
			}
			data[i] = data[leastIndex];
			data[leastIndex] = currElement;
			
		}
		return data;
	}
	
	public int[] bubbleSort(int[] data){
		System.out.println("Using Bubble Sort Algorithm....");
		int tmp;
		
		for(int i=0; i< data.length; i++){
			for(int j = data.length-1; j>i; j--){
				if(data[j] < data[j-1]){
					tmp = data[j-1];
					data[j-1] = data[j];
					data[j] = tmp;
				}
			}
		}
		return data;
	}
}
