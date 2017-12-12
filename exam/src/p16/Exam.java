package p16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.google.common.collect.Lists;

public class Exam {
	/* 총 5명의 학생의 점수를 Scanner 클래스의 nextLine()함수를
	 * 사용하여 입력받아 총점과 평균을 구하고 점수가 낮은 순서대로
	 * 출력해주세요
	 * 입력순서가 50,60,30,70,100점이였다면 점수가 낮은 순서대로 출력
     */	
//	ArrayList<String> alStr = new ArrayList<String>();
//	Exam(){
//		Scanner s = new Scanner(System.in);
//		System.out.println("학생들의 점수를 ,기준으로 입력");
//		String str = s.nextLine();
//		String [] strs = str.split(",");
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		for(String st : strs) {
//			alStr.add(Integer.parseInt(st));
//		}		
//
//
//       return al;
// }

	

	
	
	
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		Integer[] nums = new Integer[5];
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번쨰 학생점수 입력=>");
			nums[i]= Integer.parseInt(s.nextLine());
			
		}
	//Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
                 int temp = nums[i];
                 nums[i]=nums[j];
                 nums[j]=temp;
                
				}
				
			}
		}
		ArrayList<Integer> numList = Lists.newArrayList(nums);
	    System.out.println(numList);
	
	}
}
