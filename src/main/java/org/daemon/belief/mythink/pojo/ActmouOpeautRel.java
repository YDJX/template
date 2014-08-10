/**
 * Program  : ActmouOpeautRel.java
 * Author   : ydjx
 * Create   : 2014年8月10日 上午10:03:23
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
 * actionmoudle-operationauthority-relationship
 * @author ydjx
 * @version 1.0.0
 * @2014年8月10日 上午10:03:23
 */
public class ActmouOpeautRel {

	private int aorelId;
	private OperationAuthority opeaut;
	private ActionMoudle actmou;
	
	private Set<ActOpeControlField> aocfs;

	public int getAorelId() {
		return aorelId;
	}

	public void setAorelId(int aorelId) {
		this.aorelId = aorelId;
	}

	public OperationAuthority getOpeaut() {
		return opeaut;
	}

	public void setOpeaut(OperationAuthority opeaut) {
		this.opeaut = opeaut;
	}

	public ActionMoudle getActmou() {
		return actmou;
	}

	public void setActmou(ActionMoudle actmou) {
		this.actmou = actmou;
	}

	public Set<ActOpeControlField> getAocfs() {
		return aocfs;
	}

	public void setAocfs(Set<ActOpeControlField> aocfs) {
		this.aocfs = aocfs;
	}

}
