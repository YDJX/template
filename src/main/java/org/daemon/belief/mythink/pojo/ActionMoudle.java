/**
 * Program  : ActionMoudleMenu.java
 * Author   : ydjx
 * Create   : 2014年8月10日 上午9:41:47
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
 * action moudle menu
 * 
 * @author ydjx
 * @version 1.0.0
 * @2014年8月10日 上午9:41:47
 */
public class ActionMoudle {

	private int actmouId;
	private String moudelName;
	private String pagePath; // 页面路径
	private boolean sysmoudle; // 是否系统模块
	private String explanation;
	private String firstPage; // 模块首页
	private int rankOrder; //排序次序
	private boolean oamoudle; // 是否权限模块

	// private int parentactmouId;
	private ActionMoudle parentActMou;
	private Set<ActionMoudle> subActMous;
	private Set<ActmouOpeautRel> aorels;

	public int getActmouId() {
		return actmouId;
	}

	public void setActmouId(int actmouId) {
		this.actmouId = actmouId;
	}

	public String getMoudelName() {
		return moudelName;
	}

	public void setMoudelName(String moudelName) {
		this.moudelName = moudelName;
	}

	public String getPagePath() {
		return pagePath;
	}

	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}

	public boolean isSysmoudle() {
		return sysmoudle;
	}

	public void setSysmoudle(boolean sysmoudle) {
		this.sysmoudle = sysmoudle;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(String firstPage) {
		this.firstPage = firstPage;
	}

	public int getRankOrder() {
		return rankOrder;
	}

	public void setRankOrder(int rankOrder) {
		this.rankOrder = rankOrder;
	}

	public boolean isOamoudle() {
		return oamoudle;
	}

	public void setOamoudle(boolean oamoudle) {
		this.oamoudle = oamoudle;
	}

	public ActionMoudle getParentActMou() {
		return parentActMou;
	}

	public void setParentActMou(ActionMoudle parentActMou) {
		this.parentActMou = parentActMou;
	}

	public Set<ActionMoudle> getSubActMous() {
		return subActMous;
	}

	public void setSubActMous(Set<ActionMoudle> subActMous) {
		this.subActMous = subActMous;
	}

	public Set<ActmouOpeautRel> getAorels() {
		return aorels;
	}

	public void setAorels(Set<ActmouOpeautRel> aorels) {
		this.aorels = aorels;
	}

}
