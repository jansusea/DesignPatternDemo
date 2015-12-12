package com.csshu.command;


/**
 * 假设我们有一个遥控器，它只有一个按钮和对应的插槽，可以控制一个装置
 * @author shujianhua
 *
 */
public class SimpleRemoteControl { 
	Command slot;	// 有一个插槽持有命令，而这个命令控制着一个装置
	
	/**
	 * 这个方法用来设置插槽控制的命令。如果这段代码的客户想要改变遥控器按钮的行为，可以多次调用这个方法。
	 * @param command
	 */
	public void setCommand(Command command){
		slot = command;
	}
	
	public void buttonWasPressed(){ // 在遥控器中，应该有相关命令的调用
		slot.execute();		// 当按下按钮时，这个方法就会被调用，使得当前命令
				// 衔接插槽，并调用它的execute方法 当前命令衔接插槽
	}

}
