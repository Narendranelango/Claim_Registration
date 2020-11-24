package com.cg.model;

public class ClaimQuestions {
	
	private int question_Id;
	private String question_Desc;
	private String answer_1; //yes
	private String answer_2; //no
	private String answer_3;
	private String answer_4;
	private String business_Type; //businessType
	
	public ClaimQuestions(int question_Id, String question_Desc, String answer_1, String answer_2, String answer_3,
			String answer_4, String business_Type) {
		super();
		this.question_Id = question_Id;
		this.question_Desc = question_Desc;
		this.answer_1 = answer_1;
		this.answer_2 = answer_2;
		this.answer_3 = answer_3;
		this.answer_4 = answer_4;
		this.business_Type = business_Type;
	}

	public int getQuestion_Id() {
		return question_Id;
	}

	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}

	public String getQuestion_Desc() {
		return question_Desc;
	}

	public void setQuestion_Desc(String question_Desc) {
		this.question_Desc = question_Desc;
	}

	public String getAnswer_1() {
		return answer_1;
	}

	public void setAnswer_1(String answer_1) {
		this.answer_1 = answer_1;
	}

	public String getAnswer_2() {
		return answer_2;
	}

	public void setAnswer_2(String answer_2) {
		this.answer_2 = answer_2;
	}

	public String getAnswer_3() {
		return answer_3;
	}

	public void setAnswer_3(String answer_3) {
		this.answer_3 = answer_3;
	}

	public String getAnswer_4() {
		return answer_4;
	}

	public void setAnswer_4(String answer_4) {
		this.answer_4 = answer_4;
	}

	public String getBusiness_Type() {
		return business_Type;
	}

	public void setBusiness_Type(String business_Type) {
		this.business_Type = business_Type;
	}

	@Override
	public String toString() {
		return "ClaimQuestions [question_Id=" + question_Id + ", question_Desc=" + question_Desc + ", answer_1="
				+ answer_1 + ", answer_2=" + answer_2 + ", answer_3=" + answer_3 + ", answer_4=" + answer_4
				+ ", business_Type=" + business_Type + "]";
	}	
}

