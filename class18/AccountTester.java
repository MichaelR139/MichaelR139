package com.syntax.class18;

public class AccountTester {

        protected int sumArray(int[] arr){
            int sum=0;
            for(int i=0;i<arr.length;i++)
                sum+=arr[i];

            return sum;
        }

        public String reverse(String str){
            String reverseStr="";
            StringBuilder s1=new StringBuilder(str);
            reverseStr=s1.reverse().toString();

            return reverseStr;
        }

        private String vowels(String str1){
            String vowelsOnly="";
            for(int i=0;i<str1.length();i++) {
                if (str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='u' || str1.charAt(i)=='o')
                {
                    vowelsOnly += str1.charAt(i);

                }
            }
            return vowelsOnly;
    }
}
