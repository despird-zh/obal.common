package com.dcube.launcher;

import com.dcube.exception.BaseException;

/**
 * CoreInitializer help to initial the component of Core instance 
 * 
 * @author despird
 * @version 0.1 2014-3-4
 **/
public abstract class CoreInitializer {

	public String hookerName = null;
	
	/**
	 * Default constructor, here the hooker will be bind to CoreLauncher
	 **/
	public CoreInitializer()throws BaseException{
		
		LifecycleHooker hooker = setupLifecycleHooker();
		this.hookerName = hooker.name();
	}
	
	/**
	 * Get the lifecycle event hooker for lifecycle operation 
	 **/
	public abstract LifecycleHooker setupLifecycleHooker() throws BaseException;
	
}
