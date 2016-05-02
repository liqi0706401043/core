package com.mikey.crazy04;

public class Num2Rmb {
	private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
	private String[] unitArr= {"十", "百", "千"};
	
	private String[] divide(double num){
		long zheng = (long)num;
		long xiao = Math.round((num - zheng) * 100);
		return new String[]{zheng + "", String.valueOf(xiao)};
	}
	
	private String toHanStr(String numStr){
		String result = "";
		int numLen = numStr.length();
		for(int i=0; i<numLen; i++){
			int num = numStr.charAt(i) - 48;
			if(num != 0 && i != numLen-1){
				result += hanArr[num] + unitArr[numLen -2 - i];
			}else{
				result += hanArr[num];
			}
		}
		
		return toAll(result);
	}
	
	private String noRepeatChar(String numStr){
		if(numStr.isEmpty())
			return null;
		String result = "";
		for(int i=0; i<numStr.length()-1; i++){
			
			if(numStr.charAt(i) == numStr.charAt(i+1) ){
				continue;
			}else{
				result += numStr.charAt(i);
			}
			
		}
		if(numStr.charAt(numStr.length()-1) != '零'){
			result += numStr.charAt(numStr.length()-1);
		}
		return result;
	}
	
	private String toAll(String numStr){
		String result = "";
		int strLen = numStr.length();
		if(strLen <= 4){
			result =numStr + "元";
		} else if(4 < strLen && strLen <=8){
			String temp1 = numStr.substring(0,strLen-4);
			String temp2 = numStr.substring(strLen-4,strLen);
			result = temp1 + "万" + temp2 + "元";			
		} else if(strLen > 8 && strLen <=12){
			String temp1 = numStr.substring(0,strLen-8);
			String temp2 = numStr.substring(strLen-8,strLen - 4);
			String temp3 = numStr.substring(strLen-4,strLen);
			result = temp1 + "亿" + temp2 + "万" + temp3 + "元";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Num2Rmb nr = new Num2Rmb();
		System.out.println(nr.toHanStr("1909"));
	}

}
