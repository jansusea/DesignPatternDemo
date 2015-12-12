package com.csshu.command;


/**
 * 命令模式的客户
 * @author shujianhua
 *
 */
public class Test {

	public static void main(String[] args) {
		// 遥控器就是调用者，会传入一个命令对象，可以用来发出请求，比如传入命令，按下按键
		SimpleRemoteControl remote = new SimpleRemoteControl();	// 新搞出来一个遥控器对象
		// 现在创建了一个电灯对象，此对象也就是请求的接受者
		Light light = new Light();	// 一个灯的对象
		// 在这里创建一个命令，然后将接受者传给它
		LightOnCommand lightOn = new LightOnCommand(light);	// 灯亮的命令，同时这个命令嵌了一个
		// 把命令做好了，就可以传给遥控器了								// 灯的接受者
		// 把命令传给调用者
		remote.setCommand(lightOn);	// 遥控器设置命令，获取了一个命令对象
		// 然后模拟按下按钮
		remote.buttonWasPressed();	// 遥控器，按下按钮，于是开始执行命令对象中得命令
	}

}
