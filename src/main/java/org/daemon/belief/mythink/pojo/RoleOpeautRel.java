/**
 * Program  : RoleOpeautRel.java
 * Author   : ydjx
 * Create   : 2014年8月10日 上午9:30:51
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
 * userrole-operationauthority-relationship
 * 
 * @author ydjx
 * @version 1.0.0
 * @2014年8月10日 上午9:30:51
 */
public class RoleOpeautRel {

	private int rorelId;
	private Userrole userrole;
	private OperationAuthority opeaut;
	
	public int getRorelId() {
		return rorelId;
	}

	public void setRorelId(int rorelId) {
		this.rorelId = rorelId;
	}

	public Userrole getUserrole() {
		return userrole;
	}

	public void setUserrole(Userrole userrole) {
		this.userrole = userrole;
	}

	public OperationAuthority getOpeaut() {
		return opeaut;
	}

	public void setOpeaut(OperationAuthority opeaut) {
		this.opeaut = opeaut;
	}

}
