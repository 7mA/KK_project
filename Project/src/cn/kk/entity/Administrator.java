package cn.kk.entity;
/**
 * 
 * @author Liuyu
 * create 2016-7-16
 *
 */
public class Administrator {
	/**
	 * Administrator id
	 */
	private int id;
	/**
	 * Administrator name
	 */
	private String name;
	/**
	 * Administrator password
	 */
	private String password;
	
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
