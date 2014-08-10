/**
 * Program  : OperationAuthority.java
 * Author   : ydjx
 * Create   : 2014年8月10日 上午9:26:03
 *
 * Copyleft 2014 by YDJX.
 * All rights reserved.
 *
 * Take it down to the copy center and make as many copies as you want
 * This software is the free software.
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed
 * The License is a free, copyleft license for software and other kinds of works.
 *
 */

package org.daemon.belief.mythink.pojo;

import java.util.Set;

/**
 * 
 * @author ydjx
 * @version 1.0.0
 * @2014年8月10日 上午9:26:03
 */
public class OperationAuthority {

	private int opeautId;
	private String opmethod; //操作方式
	private String explanation;
	private String remark;

	private Set<RoleOpeautRel> rorels;
	private Set<ActmouOpeautRel> aorels;
	
	public int getOpeautId() {
		return opeautId;
	}

	public void setOpeautId(int opeautId) {
		this.opeautId = opeautId;
	}

	public String getOpmethod() {
		return opmethod;
	}

	public void setOpmethod(String opmethod) {
		this.opmethod = opmethod;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<RoleOpeautRel> getRorels() {
		return rorels;
	}

	public void setRorels(Set<RoleOpeautRel> rorels) {
		this.rorels = rorels;
	}

	public Set<ActmouOpeautRel> getAorels() {
		return aorels;
	}

	public void setAorels(Set<ActmouOpeautRel> aorels) {
		this.aorels = aorels;
	}

}
