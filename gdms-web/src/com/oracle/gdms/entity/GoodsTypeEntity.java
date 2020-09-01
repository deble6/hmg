package com.oracle.gdms.entity;

import java.io.Serializable;

public class GoodsTypeEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;
	private int gtid;
	private String name;
	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description Ҫ���õ� description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return gtid
	 */
	public int getGtid() {
		return gtid;
	}
	/**
	 * @param gtid Ҫ���õ� gtid
	 */
	public void setGtid(int gtid) {
		this.gtid = gtid;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	public GoodsTypeEntity() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public GoodsTypeEntity(String description, int gtid, String name) {
		super();
		this.description = description;
		this.gtid = gtid;
		this.name = name;
	}
	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GoodsTypeEntity [description=" + description + ", gtid=" + gtid + ", name=" + name + "]";
	}
	
	
}
