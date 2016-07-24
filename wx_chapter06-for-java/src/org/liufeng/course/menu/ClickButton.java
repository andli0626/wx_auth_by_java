package org.liufeng.course.menu;

/**
 * 
 * @author lilin
 * @date 2016年2月15日 下午3:16:39
 * @annotation click类型的按钮
 */
public class ClickButton extends Button {
	private String type;
	private String key;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}

