package runtimeClass;

public class RuntimeExec {
      
        public static void main(String args[])throws Exception{ 
        	try{
         Runtime.getRuntime().exec("notepad");
        }  
        	catch(Exception e){
        		System.out.println("exception during runtime : notepad doesnt exist");
        	}
       }  
}
