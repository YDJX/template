/**
 * Program  : Userrole.java
 * Author   : ydjx
 * Create   : 2014年8月5日 下午8:48:49
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
 * @author   ydjx
 * @version  1.0.0
 * @2014年8月5日 下午8:48:49
 */
public class Userrole {

	private int userrId;
	private String roleName;
	private String description;
	private boolean disable;
	
	private Userlevel userlevel;
	private Set<GroupRoleRel> grrels;
	private Set<RoleOpeautRel> rorels;

	public int getUserrId() {
		return userrId;
	}

	public void setUserrId(int userrId) {
		this.userrId = userrId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	public Userlevel getUserlevel() {
		return userlevel;
	}

	public void setUserlevel(Userlevel userlevel) {
		this.userlevel = userlevel;
	}

	public Set<GroupRoleRel> getGrrels() {
		return grrels;
	}

	public void setGrrels(Set<GroupRoleRel> grrels) {
		this.grrels = grrels;
	}

	public Set<RoleOpeautRel> getRorels() {
		return rorels;
	}

	public void setRorels(Set<RoleOpeautRel> rorels) {
		this.rorels = rorels;
	}
	
}

