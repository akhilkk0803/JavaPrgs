/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	String s="bathe";
	int count=0;
	String temp="";
	for(int i=0;i<5;i++){
	    for(int j=0;j<5;j++){
	        if(i==j)continue;
	        for(int k=0;k<5;k++){
	            if(k!=i && k!=j){
	                 temp=""+s.charAt(i)+s.charAt(j)+s.charAt(k);
	            System.out.println(temp);
	            }
	        }
	    }
	}
	}
}
