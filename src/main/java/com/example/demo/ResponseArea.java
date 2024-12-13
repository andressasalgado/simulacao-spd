package com.example.demo;

public class ResponseArea {

	Double value;
	Long timeInMilliseconds;

	public ResponseArea(Double value, Long timeInMilliseconds) {
		this.value = value;
		this.timeInMilliseconds = timeInMilliseconds;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Long getTimeInMilliseconds() {
		return timeInMilliseconds;
	}

	public void setTimeInMilliseconds(Long timeInMilliseconds) {
		this.timeInMilliseconds = timeInMilliseconds;
	}
}
