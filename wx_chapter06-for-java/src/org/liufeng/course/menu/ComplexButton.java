package org.liufeng.course.menu;

/**
 * 
 * @author lilin
 * @date 2016年2月15日 下午3:17:24
 * @annotation 复合类型的按钮
 */
public class ComplexButton extends Button {
	private Button[] sub_button;

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}
}


