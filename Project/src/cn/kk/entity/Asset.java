package cn.kk.entity;
/**
 * 
 * @author Liuyu
 * create 2016-7-16
 *
 */
public class Asset {
	/**
	 * Asset id
	 */
	private int id;
	/**
	 * Asset name
	 */
	private String name;
	/**
	 * Asset category
	 */
	private String category;
	/**
	 * Asset model
	 */
	private String model;
	/**
	 * Asset worth
	 */
	private int worth;
	/**
	 * Asset buyTime
	 */
	private String buyTime;
	/**
	 * Asset state
	 */
	private int state;
	/**
	 * Asset user
	 */
	private String user;
	/**
	 * Asset remarks
	 */
	private String ps;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getWorth() {
		return worth;
	}
	public void setWorth(int worth) {
		this.worth = worth;
	}
	public String getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}

}
