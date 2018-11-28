package com.autobot.simsimi;

public class RequestParam {
	private String text; // Query message
	private String lc; // Language code
	
	/*
	 * Double(0.0~1.0) & Default value is 0.0 
	 * (0.0 is a bad Simsimi Version and 1.0 is a kind Simsimi Version.
	 */
	
	private double ft;
	private final String key = "08499f4b-f005-40f7-a670-1bfd5665239d"; // your Trial-key value

	public RequestParam() {
		text = null;
		lc = null;
		ft = 0.0;
	}

	/**
	 * Retrieve the value of text.
	 * 
	 * @return A String data type.
	 */
	public String getText() {
		return text;
	}

	/**
	 * set the value of text.
	 * 
	 * @param text
	 *            A variable of type String.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Retrieve the value of Language code(Lc).
	 * 
	 * @return A String data type.
	 */
	public String getLc() {
		return lc;
	}

	/**
	 * set the value of lc.
	 * 
	 * @param lc
	 *            A variable of type String.
	 */
	public void setLc(String lc) {
		this.lc = lc.toLowerCase();
	}

	/**
	 * Retrieve the value of ft.
	 * 
	 * @return A double data type.
	 */
	public double getFt() {
		return ft;
	}

	/**
	 * set the value of ft.
	 * 
	 * @param ft
	 *            A variable of type double.
	 */
	public void setFt(double ft) {
		this.ft = ft;
	}

	/**
	 * Retrieve the value of key.
	 * 
	 * @return A String data type.
	 */
	public String getKey() {
		return key;
	}

}
