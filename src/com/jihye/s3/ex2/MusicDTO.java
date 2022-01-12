package com.jihye.s3.ex2;

public class MusicDTO {

	
	//선언
	//멤버변수의 접근지정자는 모두 private
	//외부에서 접근가능하도록 뭔가(setter,getter)를 만들어야함
	//오늘의 음원: 순위 제목 가수이름 랭크 좋아요수 
	private String title;
	private String name;
	private int rank;
	private int like;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	
}
