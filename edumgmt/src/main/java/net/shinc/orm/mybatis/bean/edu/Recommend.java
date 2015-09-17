package net.shinc.orm.mybatis.bean.edu;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class Recommend {
	private Integer id;

	private Date addTime;

	private Date topTime;
	
	@NotEmpty(message = "{recommend.location.not.empty}")
	private String location;

	@NotEmpty(message = "{recommend.title.not.empty}")
	private String title;

	@NotEmpty(message = "{recommend.description.not.empty}")
	private String description;

	@NotEmpty(message = "{recommend.logo.not.empty}")
	private String logo;

	private String videoBaseIds;

	@NotEmpty(message = "{type.not.empty}")
	private String type;// 1单视频2视频组

	public Integer getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAddTime() {
		return addTime;
	}

	public String getVideoBaseIds() {
		return videoBaseIds;
	}

	public void setVideoBaseIds(String videoBaseIds) {
		this.videoBaseIds = videoBaseIds;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getTopTime() {
		return topTime;
	}

	public void setTopTime(Date topTime) {
		this.topTime = topTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location == null ? null : location.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo == null ? null : logo.trim();
	}
}