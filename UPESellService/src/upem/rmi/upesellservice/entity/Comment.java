package upem.rmi.upesellservice.entity;

import java.util.Date;

public class Comment {
	private static final int id=0;
	private Date date;
	private int record;
	private String contents;
	private Personne author;
	
	public int getId() {
		return id;
	}
	
	public Personne getAuthor() {
		return author;
	}

	public void setAuthor(Personne author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return "Le " + date.toString() +", "+ author.toString()+ " a commenté :\n"+contents+"\n";
	}
}
