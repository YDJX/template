/**
 * Program  : UserGroupRel.java
 * Author   : ydjx
 * Create   : 2014年8月10日 上午8:21:18
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
 * user-usergroup-relationship
 * @author ydjx
 * @version 1.0.0
 * @2014年8月10日 上午8:21:18
 */
public class UserGroupRel {

	private int ugrelId;
	private Userinfo userinfo;
	private Usergroup usergroup;

	public int getUgrelId() {
		return ugrelId;
	}

	public void setUgrelId(int ugrelId) {
		this.ugrelId = ugrelId;
	}

	public Userinfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Usergroup getUsergroup() {
		return usergroup;
	}

	public void setUsergroup(Usergroup usergroup) {
		this.usergroup = usergroup;
	}

}
