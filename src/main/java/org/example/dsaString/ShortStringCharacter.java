package org.example.dsaString;

public class ShortStringCharacter {
    public static void main(String[] args) {

        String str="revati";

      char[] arr=  str.toCharArray();

      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr.length-i-1; j++){
              if(arr[j]>arr[j+1]){
                  char temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
      }
      //or we can use Array.sort(char) also;
        //Arrays.sort(arr);
      String ans=new String(arr);
        System.out.println(ans);



    }
}
