/**
 * Program  : GroupRoleRel.java
 * Author   : ydjx
 * Create   : 2014年8月10日 上午8:52:05
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

/**
 * usergroup-userrole-relationship
 * 
 * @author ydjx
 * @version 1.0.0
 * @2014年8月10日 上午8:52:05
 */
public class GroupRoleRel {

	private int grrelId;
	private Usergroup usergroup;
	private Userrole userrole;

	public int getGrrelId() {
		return grrelId;
	}

	public void setGrrelId(int grrelId) {
		this.grrelId = grrelId;
	}

	public Usergroup getUsergroup() {
		return usergroup;
	}

	public void setUsergroup(Usergroup usergroup) {
		this.usergroup = usergroup;
	}

	public Userrole getUserrole() {
		return userrole;
	}

	public void setUserrole(Userrole userrole) {
		this.userrole = userrole;
	}

}
