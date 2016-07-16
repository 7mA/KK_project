package cn.kk.entity;

public class Staff {
	/**
	 * staff id
	 */
	private int id;
	/**
	 * staff name
	 */
	private String name;
	/**
	 * staff job
	 */
	private String job;
	/**
	 * staff remarks
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPs() {
		return ps;
	}
	public void setPs(String ps) {
		this.ps = ps;
	}
}
