/**
 * Program  : Userlevel.java
 * Author   : ydjx
 * Create   : 2014年8月10日 上午8:35:47
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
 * @2014年8月10日 上午8:35:47
 */
public class Userlevel {

	private int userlId;
	private String levelName;
	private String explanation;

	private Set<Userinfo> userinfos;
	private Set<Userrole> userroles;
	
	public int getUserlId() {
		return userlId;
	}

	public void setUserlId(int userlId) {
		this.userlId = userlId;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public Set<Userinfo> getUserinfos() {
		return userinfos;
	}

	public void setUserinfos(Set<Userinfo> userinfos) {
		this.userinfos = userinfos;
	}

	public Set<Userrole> getUserroles() {
		return userroles;
	}

	public void setUserroles(Set<Userrole> userroles) {
		this.userroles = userroles;
	}

}
