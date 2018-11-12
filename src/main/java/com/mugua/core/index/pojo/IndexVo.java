package com.mugua.core.index.pojo;

import java.io.Serializable;
import java.util.List;

import com.mugua.core.activity.pojo.Activity;

public class IndexVo implements Serializable {

	/**
	 *app主页需要的数据包括:企业动态以及新闻类型为1的新闻(各4条)
	 */
	private static final long serialVersionUID = 1L;
	private List<SayOneVo> sayOnes;
	private List<DynamicVo> dynamics;
	private Activity activity;
	
	
	public Activity getActivity() {
		return activity;
	}
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	public IndexVo() {
		super();
	}
	public List<SayOneVo> getSayOnes() {
		return sayOnes;
	}
	public void setSayOnes(List<SayOneVo> sayOnes) {
		this.sayOnes = sayOnes;
	}
	public List<DynamicVo> getDynamics() {
		return dynamics;
	}
	public void setDynamics(List<DynamicVo> dynamics) {
		this.dynamics = dynamics;
	}
	@Override
	public String toString() {
		return "IndexVo [sayOnes=" + sayOnes + ", dynamics=" + dynamics + ", activity=" + activity + "]";
	}
	
	
	
}
