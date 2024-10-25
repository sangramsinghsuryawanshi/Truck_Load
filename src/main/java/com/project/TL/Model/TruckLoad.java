package com.project.TL.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TruckLoad 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tId;
	private String DN;
	private long c;
	private long lc;
	private String l;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getDN() {
		return DN;
	}
	public void setDN(String dN) {
		DN = dN;
	}
	public long getC() {
		return c;
	}
	public void setC(long c) {
		this.c = c;
	}
	public long getLc() {
		return lc;
	}
	public void setLc(long lc) {
		this.lc = lc;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public TruckLoad(int tId, String dN, long c, long lc, String l) {
		super();
		this.tId = tId;
		DN = dN;
		this.c = c;
		this.lc = lc;
		this.l = l;
	}
	public TruckLoad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
