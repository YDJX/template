package org.daemon.belief.mythink.pojo;

import java.util.Set;

public class Usergroup {

	private int usergId;
	private long priVal; //权限值 privilege value
	private String groupName;
	private String description;
	private boolean readable;
	private boolean writable;
	private boolean executable;
	
	private Set<UserGroupRel> ugrels;
	private Set<GroupRoleRel> grrels;

	public int getUsergId() {
		return usergId;
	}

	public void setUsergId(int usergId) {
		this.usergId = usergId;
	}

	public long getPriVal() {
		return priVal;
	}

	public void setPriVal(long priVal) {
		this.priVal = priVal;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isReadable() {
		return readable;
	}

	public void setReadable(boolean readable) {
		this.readable = readable;
	}

	public boolean isWritable() {
		return writable;
	}

	public void setWritable(boolean writable) {
		this.writable = writable;
	}

	public boolean isExecutable() {
		return executable;
	}

	public void setExecutable(boolean executable) {
		this.executable = executable;
	}

	public Set<UserGroupRel> getUgrels() {
		return ugrels;
	}

	public void setUgrels(Set<UserGroupRel> ugrels) {
		this.ugrels = ugrels;
	}

	public Set<GroupRoleRel> getGrrels() {
		return grrels;
	}

	public void setGrrels(Set<GroupRoleRel> grrels) {
		this.grrels = grrels;
	}

}
