package com.org.SeleniumSampleProject1.project1;

public class GradeCalculationConstructor {
	float m1,m2,m3,Total;
	static float grade;
	String name;
	
	
	public GradeCalculationConstructor(float m,float n,float o,String name1) {
	m1=m;
	m2=n;
	m3=o;
	name = name1;
	}
	
	public void calculate(){
	Total = m1+m2+m3;
	System.out.println(Total);
	grade = (Total/300f)*100f;
	System.out.println(grade);
	if(grade<40){
		System.out.println(name  +"  " +  "failed");
		}else if (grade>=40 && grade<=60){
		System.out.println(name  +"   "+  "Grade D");
		}else if(grade>60 && grade<=70){
		System.out.println(name  +"   "+  "Grade C");
		}else if(grade>70 && grade<=80){
		System.out.println(name  +"   "+  "Grade B");
		}else {
		System.out.println(name  +"   " + "Grade A");
		}  
	}
	
	public float calculate1(){
		Total = m1+m2+m3;
		//System.out.println(Total);
		grade = (Total/300f)*100f;
		return grade; 
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeCalculationConstructor obj = new GradeCalculationConstructor(80f,80f,70f,"Alex");
		GradeCalculationConstructor obj1 = new GradeCalculationConstructor(80f,80f,70f,"Arjun");
		obj.calculate();
		float finalgrade = obj1.calculate1();
		if(finalgrade<40){
			System.out.println(obj1.name  +"  " +  "failed"); //instance variable "name" called in static method using static method object
			//System.out.println(name  +"  " +  "failed");  // if this method is used then name needs to be assigned as static variable 
			}else if (finalgrade>=40 && finalgrade<=60){
			System.out.println(obj1.name  +"   "+  "Grade D");
			}else if(finalgrade>60 && finalgrade<=70){
			System.out.println(obj1.name  +"   "+  "Grade C");
			}else if(finalgrade>70 && finalgrade<=80){
			System.out.println(obj1.name  +"   "+  "Grade B");
			}else {
			System.out.println(obj1.name  +"   " + "Grade A");
			} 
	    }
}
		
