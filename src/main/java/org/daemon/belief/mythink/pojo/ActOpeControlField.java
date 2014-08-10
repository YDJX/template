/**
 * Program  : ActOpeControlField.java
 * Author   : ydjx
 * Create   : 2014年8月10日 上午10:29:25
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
 * 
 * @author ydjx
 * @version 1.0.0
 * @2014年8月10日 上午10:29:25
 */
public class ActOpeControlField {

	private ActmouOpeautRel actoperel;
	private ActionMoudle actmou;
	private OperationAuthority opeaut;
	private String fieldName;

	public ActmouOpeautRel getActoperel() {
		return actoperel;
	}

	public void setActoperel(ActmouOpeautRel actoperel) {
		this.actoperel = actoperel;
	}

	public ActionMoudle getActmou() {
		return actmou;
	}

	public void setActmou(ActionMoudle actmou) {
		this.actmou = actmou;
	}

	public OperationAuthority getOpeaut() {
		return opeaut;
	}

	public void setOpeaut(OperationAuthority opeaut) {
		this.opeaut = opeaut;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

}
