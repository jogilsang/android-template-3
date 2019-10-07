package com.sauce.mytablayout.model;

public class tabModel_1 extends itemModel{

	public int image;  // 이미지
	public String date; // 날짜


	public tabModel_1(int image, String date) {
		this.image = image;
		this.date = date;

	}

	public void setImage(int image) {
		this.image = image;
	}

	public void setDate(String date) {
		this.date = date;
	}


	public int getImage() {
		return image;
	}

	public String getDate() {
		return date;
	}

}
