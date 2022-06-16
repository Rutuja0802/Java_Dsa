import java.util.Scanner;
public class MappingDigit {
	public static void main(String[] args) {
		int[] arr= {1,1,4,3,2,5,3,2,1,6,8,9};
			sort(arr);
			Print(arr);
		
	}
	public static void Print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static void sort(int[] arr) {
		//Create frequency map
		int[] fmap=CreateFreqMap(arr);
		//sort array using frequency map
		SortArrayUsingFrequencyMap(arr,fmap);
	}
	
	public static int[] CreateFreqMap(int[] arr) {
		int[] fmap=new int[12];
		for(int i=0;i<arr.length;i++) {
			int val=arr[i];//value
			fmap[val]++;
					
		}
		return fmap;
		
	}
	
	public static void SortArrayUsingFrequencyMap(int[] arr,int[] fmap) {
		int k=0;
		for(int i=0;i<arr.length;i++) {
			int val=i;
			int freq=fmap [i];
			for(int j=0;j<freq;j++) {
				arr[k]=val;
				k++;
			}
			
		}
	}

}
