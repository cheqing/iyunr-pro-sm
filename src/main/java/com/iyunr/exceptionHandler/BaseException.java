package com.iyunr.exceptionHandler;

/**
 * 
    * @ClassName: BaseException  
    * @Description: TODO 异常处理基础类,现在的处理机制是，当业务层有异常时，直接抛出ServiceException一种，以后如果要根据特定的业务场景抛出特定的错误的话
    * 可以开启此类，然后将定义的多个业务类异常（eg：ServiceException1 ServiceException2....）继承此类，然后再讲CommonException类中的ServiceException修改成BaseException
    * 这个时候业务层会报错，他需要将错误抛出，这里一定不要用try...catch...，直接throws抛出即可，然后在controller层同样抛出即可，但是为了查看日志方便，在controller中抛出异常不要忘记写到
    * 日志中去，logger.error（）；
    * @author Administrator  
    * @date 2017年10月30日  
    *
 */
//public class BaseException extends Exception{
//	  
//	    /**  
//	    * @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
//	    */  
//	    
//	private static final long serialVersionUID = 1L;
//
//	public BaseException() {
//		super();
//	}
//}
