package br.com.reforcoonline.controller;

import java.io.Serializable;
import java.util.Collection;

public abstract class AbstractController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Boolean isNullOrEpty(Object obj) {
		if ( obj == null ) {
			return true;
		}
		
		if ( obj instanceof Collection<?> && ((Collection<?>) obj).size() < 1) {
			return true;
		}
		
		return false;
	}
	
}
