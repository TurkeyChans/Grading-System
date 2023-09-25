import java.util.Scanner;
public class Grades {
	
   public static int sum(int[] arr) {
      int plus = 0;
      int i;
      for (i = 0; i < arr.length; ++i) {
         plus += arr[i];
      }
      return plus;
   }
   public static int sum(int[] arr, int firstIndex, int lastIndex) {
	
      int plus = 0;

      if (firstIndex <= -1) {
         return -666;
      }

      if (lastIndex <= -1) {
         return -666;
      }
      if ( firstIndex >= arr.length) {
         return -666;
      }
      if (lastIndex >= arr.length) {
         return -666;
      }
      if (lastIndex < firstIndex) {
         return -666;
      }
         for(int i = firstIndex; i <= lastIndex; ++i){          
            plus = plus + arr[i];  
         }          
         return plus;
   }

   public static double average(int[] arr) {
      double blearr = arr.length;
      double Ans = sum(arr) / blearr;
      return Ans;
   }

   public static int maxValue(int[] arr) {
      int i;
      int Ans = arr[0];

      for(i = 0; i < arr.length; ++i) {

         if(arr[i] > Ans) {

            Ans = arr[i];

         }
      }
        return Ans;
   }
   public static int maxValue(int[] arr, int firstIndex, int lastIndex) {

      int i;
      int Ans = arr[0];

      if (firstIndex <= -1) {
         return -666;
      }

      if (lastIndex <= -1) {
         return -666;
      }
      if ( firstIndex >= arr.length) {
         return -666;
      }
      if (lastIndex >= arr.length) {
         return -666;
      }
      if (lastIndex < firstIndex) {
         return -666;
      }

      for(i = firstIndex; i < lastIndex; ++i) {

         if(arr[i] > Ans) {

            Ans = arr[i];

         }
      }

      return Ans;
   
   }
   public static int indexOfFirstMaxValue(int[] arr) {
   
   int Ans = Grades.maxValue(arr);
   int i;

   for(i = 0; i < arr.length; ++i) {
      if(arr[i] == Ans) {
         return i;
      }
   }

   return 0;
   }

   public static void rotateElements(int[] arr) {          
         int i;
         int j = 1;
         int last;
         while (j > 0) {
            last = arr[arr.length - 1];
            for (i = arr.length - 1; i > 0; --i) {
               arr[i] = arr[i - 1];
            }

            arr[i] = last;
            j--;
         }
      }
   public static void rotateElements(int[] arr,int rotationCount) {
      int i;
      int k;
      int finals;          
      for(i = 0; i < rotationCount; ++i){ 

         finals = arr[arr.length-1];   

         for(k = arr.length-1; k > 0; --k){  

         arr[k] = arr[k - 1];     

      }                 
      arr[0] = finals;             
      } 	
   }

   public static int minValue(int[] arr) {
      int i;
      int Ans = arr[0];

      for(i = 0; i < arr.length; ++i) {
         if(arr[i] < Ans) {
               Ans = arr[i];
            }
        }
        return Ans;
   }

   public static int minValue(int[] arr, int firstIndex, int lastIndex) {
       int Ans = arr[0];
       int i;

       if (firstIndex <= -1) {
         return -666;
      }

      if (lastIndex <= -1) {
         return -666;
      }
      if ( firstIndex >= arr.length) {
         return -666;
      }
      if (lastIndex >= arr.length) {
         return -666;
      }
      if (lastIndex < firstIndex) {
         return -666;
      }

       for(i = firstIndex; i < lastIndex; ++i) {
           if(arr[i] < Ans) {
            Ans = arr[i];
         }
      }

      return Ans;
   }
   public static int indexOfFirstMinValue(int[] arr) {
      int i;
      int Ans = Grades.minValue(arr);
      
      for(i = 0; i < arr.length; ++i) {
            
            if(arr[i] == Ans)
            {
               return i;
            }
      }
      
      return 0;
   }

   public static int numberOfBelowAverageElements(int[] arr) {          
      int plus = 0;
      int count = 0;
      double Ave = 0;

      for (int i : arr) {
          plus += i;
      }

      Ave = plus / arr.length;
      for (int j : arr) {
          if (j < Ave) {
              count++;
          }
      }

      return count;
  }
   public static int numberOfAboveAverageElements(int[] arr) {
      int plus = 0;
      int count = 0;
      double Ave = 0;
      
      for (int i : arr) {
         plus += i;
      }

      Ave = plus / arr.length;

      for (int j : arr) {
         if (j > Ave) {
            count++;
         }
      }

      return count;

   }

   public static void reverseArray(int[] arr){
      int i; 
      int swaper;    
      for(i = 0; i < arr.length / 2; ++i){             
      swaper = arr[i];             
      arr[i] = arr[arr.length - i - 1];             
      arr[arr.length - i - 1] = swaper;         
   }      
}
public static void main(String args[]) {
   //Grades
   Scanner scnr = new Scanner(System.in);
   int add = 1;
   int[] store = new int[add];
   int i;
   do {
      int s = 10000;
      add = 1;
      store = new int[add];
      int max = store[0];
      int min = 10000000;
      int num;
      
      for (i = 0; i < s; ++i) {
         
         add += 1;
         store = new int[add];
         System.out.println("Enter a grade : ");
         store[i] = scnr.nextInt();
         
         if (store[i] != -1) {
            
         if (store[i] > max) {
            max = store[i];
         }
         
         if (store[i] <= min) {
            min = store[i];
         }
         }
         else {
            s = -1;
         }
      }
      
      num = store.length - 2;
      if (store[0] != -1) {
      System.out.println("Number Of Grades = " + num);
      System.out.println("Maximum Grade = " + max);
      System.out.println("Minimum Grade = " + min);
      System.out.println("");
      }
   } while(store[0] != -1);
   


   int[] arr = {scnr.nextInt()};
   Grades.sum(arr);
   int firstIndex = scnr.nextInt();
   int LastIndex = scnr.nextInt();
   Grades.sum(arr,firstIndex,LastIndex);
   Grades.average(arr);
   Grades.maxValue(arr);
   Grades.maxValue(arr,firstIndex,LastIndex);
   Grades.minValue(arr);
   Grades.minValue(arr,firstIndex,LastIndex);

}
}
