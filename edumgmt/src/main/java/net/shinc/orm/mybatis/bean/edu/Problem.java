package net.shinc.orm.mybatis.bean.edu;

import javax.validation.constraints.NotNull;

public class Problem {
	private Integer id;

	private Integer bookId;
	
	private Integer seq;

	private String status;
	
	private String content;
	
	private String videoBaseIds;
	
	private String twoCode;
	
	private String videoNum;
	private String videoType; 

	public Integer getId() {
		return id;
	}

	public Integer getBookId() {
		return bookId;
	}

	public String getVideoNum() {
		return videoNum;
	}

	public void setVideoNum(String videoNum) {
		this.videoNum = videoNum;
	}

	public String getVideoBaseIds() {
		return videoBaseIds;
	}

	public String getTwoCode() {
		return twoCode;
	}

	public void setTwoCode(String twoCode) {
		this.twoCode = twoCode;
	}

	public void setVideoBaseIds(String videoBaseIds) {
		this.videoBaseIds = videoBaseIds;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getVideoType() {
		return videoType;
	}

	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	
	
}