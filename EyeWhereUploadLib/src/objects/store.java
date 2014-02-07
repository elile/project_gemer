package objects;

public class store 
{
	
	
	@Override
	public String toString() {
		return "store [id=" + id + ", picture=" + picture + ", name=" + name
				+ ", coordinate=" + coordinate + ", extra=" + extra + ", mId="
				+ mId + ", mpic=" + mpic + ", mname=" + mname + "]";
	}


	@com.google.gson.annotations.SerializedName("Id")
	private String id;
	@com.google.gson.annotations.SerializedName("pic")
	private String picture;
	@com.google.gson.annotations.SerializedName("name")
	private String name;
	@com.google.gson.annotations.SerializedName("extra")
	private String coordinate;
	@com.google.gson.annotations.SerializedName("coor")
	private String extra;


	public store(String id, String name, String picture, String coordinate,
			String extra) {

		this.id = id;
		this.name = name;
		this.picture = picture;
		this.coordinate = coordinate;
		this.extra = extra;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	
	@com.google.gson.annotations.SerializedName("Id")
	private String mId;

	@com.google.gson.annotations.SerializedName("pic")
	private String mpic;

	@com.google.gson.annotations.SerializedName("name")
	private boolean mname;

	

}
