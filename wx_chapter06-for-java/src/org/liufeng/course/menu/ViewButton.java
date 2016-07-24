package org.liufeng.course.menu;

/**
 * 
 * @author lilin
 * @date 2016年2月15日 下午3:18:07
 * @annotation view类型的按钮
 */
public class ViewButton extends Button {
	private String type;
	private String url;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}

