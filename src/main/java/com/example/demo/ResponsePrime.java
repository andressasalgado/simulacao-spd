package com.example.demo;

import java.util.List;

public class ResponsePrime {

	List<Long> primeNumberList;
	Long timeInMilliseconds;


	public ResponsePrime(List<Long> primeNumberList, Long timeInMilliseconds) {
		this.primeNumberList = primeNumberList;
		this.timeInMilliseconds = timeInMilliseconds;
	}

	public List<Long> getPrimeNumberList() {
		return primeNumberList;
	}

	public void setPrimeNumberList(List<Long> primeNumberList) {
		this.primeNumberList = primeNumberList;
	}

	public Long getTimeInMilliseconds() {
		return timeInMilliseconds;
	}

	public void setTimeInMilliseconds(Long timeInMilliseconds) {
		this.timeInMilliseconds = timeInMilliseconds;
	}
}
