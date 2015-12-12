package com.csshu.command;


/**
 *  实现命令接口，让所有的命令对象实现相同的包含一个方法的接口。在餐厅的例子中，我们
 *  称此方法为orderUp()方法，然而，现在改为一般管用的名称execute.
 * @author shujianhua
 *
 */

public interface Command {
	public void execute();

}
