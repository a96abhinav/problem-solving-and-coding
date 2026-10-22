package com.java.designpatterns.creational;

class Documents {
	String aadharCard;
	String panCard;
	String voterId;

	public Documents(DocumentsBuilder builder) {
		this.aadharCard = builder.aadharCard;
		this.panCard = builder.panCard;
		this.voterId = builder.voterId;
	}

	@Override
	public String toString() {
		return "Documents{" + "aadharCard='" + aadharCard + '\'' + ", panCard='" + panCard + '\'' + ", voterId='" + voterId + '\'' + '}';
	}
}

class DocumentsBuilder {
	String aadharCard;
	String panCard;
	String voterId;

	public static DocumentsBuilder create() {
		return new DocumentsBuilder();
	}

	public DocumentsBuilder setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
		return this;
	}

	public DocumentsBuilder setPanCard(String panCard) {
		this.panCard = panCard;
		return this;
	}

	public DocumentsBuilder setVoterId(String voterId) {
		this.voterId = voterId;
		return this;
	}

	public Documents build() {
		return new Documents(this);
	}
}

public class BuilderDesignPattern2 {

	public static void main(String[] args) {

		Documents documents = DocumentsBuilder.create().setPanCard("Pan Card").setAadharCard("Aadhar Card").setVoterId("Voter Id").build();
		System.out.println(documents);

	}
}
