class Lab4_Sorting {
 void sort(int arr[])
 {
  int n = arr.length;
  for (int i = 1; i < n; ++i) {
   int key = arr[i];
   int j = i - 1;
   
   while (j >= 0 && arr[j] > key) {
    arr[j+1] = arr[j];
    j= j -1;
   }
   arr[j+1] = key;
  }
 }
 
 static void printArray(int arr[])
 {
  int n = arr.length;
  for (int i = 0; i < n; ++i)
    System.out.print(arr[i] + "");
  
  System.out.println();
 }
 
 public static void main(String args[])
 {
   int arr[] = {5, 2, 4, 3, 10, 7, 1, 9, 6, 8};
   String strarr[] = {"banana","apple","carrot","cardamon","donut","taco","pasta","mushrooms"};
   
   Lab4_Sorting ob = new Lab4_Sorting();
   ob.sort(arr);
   
   printArray(arr);
   printArray(strarr);
 }
}